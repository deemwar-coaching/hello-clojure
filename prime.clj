(defn is-prime? [num]
  (reduce (fn [acc current]
            (-> (not= 0 (mod num current))
                (and acc))) true (range 2 num)))

(defn only-prime [x]
  (when (is-prime? x)
    (println x)))

(filter only-prime (range 1 100))