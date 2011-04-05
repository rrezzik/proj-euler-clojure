(ns problem3
  (:use [clojure.contrib.math :only (sqrt)]))

(defn is-prime?
  "Check if a number is prime, probably not the most efficient but it works"
  [x]
  (let [limit (int (sqrt x))]
    (loop [i 2]
      (if (= i limit)
	true
	(if (zero? (rem x i))
	  false
	  (recur (inc i)))))))
      

(defn largest-prime-fact
  "Determines the largest prime factor of a number n"
  [n]
  (let [limit (int (sqrt n))]
    (loop [i limit]
      (if (and (zero? (rem n i)) (is-prime? i))
	i
	(recur (dec i))))))


;; solve the problem for the number 600851475143 and print it
(print (largest-prime-fact 600851475143))