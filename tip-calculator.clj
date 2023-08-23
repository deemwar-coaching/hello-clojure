(defn tip-calculator [bill-amt tip-percent]
  (let [only-tip (tip bill-amt tip-percent)]
    (println "Total bill" "Rs." (+ bill-amt only-tip))))

(defn tip [amount percentage]
  (-> (* amount percentage)
      (/ 100)))

(tip-calculator 1200 5)