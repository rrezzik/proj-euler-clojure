(ns problem7
  (:use [clojure.contrib.math :only (sqrt)]))

(defn is-prime? [n]
  "Checks whether the natural number n is prime."
  (.isProbablePrime (bigint n) 10))


;; print the 10001st prime number
(println (nth (filter is-prime? (iterate inc 2)) 10000))