(ns problem6)

(defn sum-of-squares
  [a count]
  (lazy-seq
   (cons a (sum-of-squares (+ a (* (inc count) (inc count))) (inc count)))))

(defn square-of-sums
  [a last count]
  (let [next (* (+ last count) (+ last count))]
    (lazy-seq
     (cons a (square-of-sums next (+ last count) (inc count))))))



(defn diff-sums
  [x]
  (- (nth (square-of-sums 1 1 2) (- x 1))
     (nth (sum-of-squares 1 1) (- x 1))))
    
(println (diff-sums 100))