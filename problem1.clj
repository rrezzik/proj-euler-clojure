(defn sum_of_multiples
  "Project euler #1: Find the sum of all multiples of 3 and 5 under 1000"
  [start limit x y]
  (reduce + (distinct (concat (range start limit x) (range start limit y)))))

; print the solution
(println (sum_of_multiples 0 1000 5 3))
