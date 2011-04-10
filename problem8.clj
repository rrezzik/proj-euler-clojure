(ns problem8)

(defn load-input
  [f]
  "Loads file f and return a number representation"
  (map #(Integer/parseInt (str%)) (filter #(not= \newline %) (slurp f))))


(defn max-product-5-consec
  "Find the greatest product of five consecutive digits in a sequence of digits"
  [file]
  (apply max (map #(reduce * %) (partition 5 1 (load-input file)))))


;; should get: 40824
(println (max-product-5-consec "/home/rafik/Projects/proj-euler-clojure/problem8-input.txt"))