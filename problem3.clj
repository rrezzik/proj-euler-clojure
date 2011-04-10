(ns problem3
  (:use [clojure.contrib.math :only (sqrt)]))

(defn is-prime? [n]
  "Checks whether the natural number n is prime."
  (.isProbablePrime (bigint n) 10))

(defn largest-prime-fact
  "Determines the largest prime factor of a number n"
  [n]
  (let [limit (int (sqrt n))]
    (loop [i limit]
      (if (and (zero? (rem n i)) (is-prime? i))
	i
	(recur (dec i))))))


;; solve the problem for the number 600851475143 and print it
(println (largest-prime-fact 600851475143))