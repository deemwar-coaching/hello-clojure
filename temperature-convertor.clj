(defn conversion-of-F-to-C [degrees]
  (-> (- degrees 32)
      (* 5)
      (/ 9)))
(defn conversion-of-C-to-F [degrees]
  (-> (* degrees 9)
      (/ 5)
      (+ 32)))
(defn temperaure-convertor [degree unit]
  (def F) (def C)
  (cond
    (= unit F) (do
                 (println "Converting fron Fahrenheit to Celsius")
                 (conversion-of-F-to-C degree))
    (= unit C) (do
                 (println "Converting from Celsius to Fahrenheit")
                 (conversion-of-C-to-F degree))))

(temperaure-convertor 36.0 C)