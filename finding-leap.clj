(defn find-leap [num]
  (if (->> (and (not= 0 (mod num 100))
               (= 0 (mod num 4)))
           (or (= 0 (mod num 400))))
    true
    false))

(find-leap 1900)
