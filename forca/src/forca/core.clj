(ns forca.core
  (:gen-class))

(def lifeTotal 6)

(defn perdeu [] (print 'perdeu'))
(defn ganhou [] (print 'ganhou'))

(defn acertouPalavra? [palavra acertos] true)

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
    (perdeu)
    (if acertouPalavra? palavra acertos)
      (ganhou)
      (print 'chuta essa porra!')
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
