(ns problem4)

(defn is-palindrome?
  "Returns true if a number is a palindrome"
  [n]
  (let [x (str n)]
    (= x (apply str (reverse x)))))

(defn max-palindrome-three-digit
  []
  (apply max (filter is-palindrome? (distinct (for [x (range 999 99 -1) y (range 999 99 -1)] (* x y))))))
    
    
  

(println (max-palindrome-three-digit))