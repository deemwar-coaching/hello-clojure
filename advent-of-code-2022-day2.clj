 (defn score-based-on-input [input]
  (cond
    (= input "rock") 1
    (= input "paper") 2
    (= input "scissors") 3))



(defn score-based-on-outcome [input]
  (let [outcome-score {:won 6 :draw 3 :lost 0}]
    (input outcome-score)))

(defn do-i-win? [them us]
  (or (and (= them "rock") (= us "paper"))
      (and (= them "paper") (=  us  "scissors"))
      (and  (= them  "scissors") (=  us "rock"))))

(defn calculating-scores [them us]
  (cond
    (= true (do-i-win? them us)) (+ (score-based-on-input us) (score-based-on-outcome :won))
    (= them us) (+ (score-based-on-input us) (score-based-on-outcome :draw))
    :else 0))

(defn changing-to-defaults [input]
  (cond
    (or (= input "A") (= input "X")) "rock"
    (or (= input "B") (= input "Y")) "paper"
    (or (= input "C") (= input "Z")) "scissors"))

(defn actual-inputs [input]
  (let [initialV (clojure.string/split input #"")]
    (calculating-scores (changing-to-defaults (get initialV 0))
                        (changing-to-defaults (get initialV 2)))))

(defn main-game []
  (def input   (-> (slurp "C:/Users/DELL/Desktop/clojure basics/input2.txt")
                   (clojure.string/split-lines)))
  (def round-score (map actual-inputs input))
  (let [total-score  (reduce + 0  round-score)]
    total-score))

(main-game)
  
 
 
