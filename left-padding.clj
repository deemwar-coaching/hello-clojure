(defn generate-string-of [length input]
  (apply str (repeat length input)))

(defn left-padding [input length]
  (let [width (- length (count input))
        leftpad (generate-string-of width "0")]
    (str leftpad input)))