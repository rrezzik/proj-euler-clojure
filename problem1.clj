(defn sum_of_multiples
  "Project euler #1: Find the sum of all multiples of 3 and 5 under 1000"
  [start limit x y]
  (reduce + (distinct (concat (range 0 limit x) (range 0 limit y)))))

(sum_of_multiple 1000 5 3)