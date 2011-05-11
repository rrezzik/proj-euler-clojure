(ns problem10
  (:use [clojure.contrib.math :only (sqrt)]))

(defn is-prime? [n]
  "Is this natural number prime?"
  (.isProbablePrime (bigint n) 10))

(defn sum-primes [n]
  "Find the sum of all the primes below n"
  (reduce + (filter is-prime? (range 1 n))))

(println (sum-primes 2000000))