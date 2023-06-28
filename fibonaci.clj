(defn fib [num]
  (reduce (fn [{:keys [a b c]} , curr]
            (let [added-value (+ a b)
                  result {:a b :b added-value :c added-value}]
              result))
          {:a 0 :b 1 :c 0}
          (range 2 (inc num))))