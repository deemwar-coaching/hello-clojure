(defn average [num]
  (-> (reduce + (range 1 (inc num)))
      (/ num)))

(average 100)