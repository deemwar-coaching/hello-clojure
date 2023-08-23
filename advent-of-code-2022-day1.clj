(defn sum-all-elf-calories [elf-calories]
  (let [elf-calories-as-vector (clojure.string/split elf-calories #"\n")]
    (reduce (fn [acc current]
              (+ acc (Integer/parseInt current))) 0  elf-calories-as-vector)))




(defn mainn []
  (def input (slurp "C:/Users/DELL/Desktop/clojure basics/input.txt"))

  (def initial (clojure.string/split input #"\n\n"))
  (apply max (map sum-all-elf-calories initial)))


(mainn)
  