(ns problem9)

(defn pyth-triple
  "a + b + c = sum"
  [sum]
  (first (for [a (range 1 (/ sum 2))
	       b (range 1 (/ sum 2))
	       c [(- sum (+ a b))]
	       :when (= (* c c) (+ (* a a) (* b b)))] [a b c])))


;; print [a b c] and then their product
;; expected answer: 31875000

(let [result (pyth-triple 1000)]
  (do (println result)
      (println (reduce * result))))