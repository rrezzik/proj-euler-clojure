(ns problem2)

(defn fib-seq
  "Creates a lazy sequence for the fibonacci sequence"
  [a b]
  (lazy-seq
   (cons a (fib-seq b (+ a b)))))

  
(defn solve-problem []
  "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."

  (reduce + (filter even? (take-while #(<= % 4000000) (fib-seq 1 2)))))


;; solve the problem and print out the solution
(println (solve-problem))
