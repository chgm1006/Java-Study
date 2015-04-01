(ns
  ^{:author Forrest G. Choi}
  clojure.LeanXinYminutes)

(str "Hello" " " "World")

(println str)

(+ 1 1)

(- 2 1)

(* 1 2)

(/ 2 1)

(= 1 1)

(= 2 1)

(not true)

(+ 1 (- 3 2))

(class 1)

(class 1.)

(class "")

(class false)

(class nil)

'(+ 1 2)

(eval '(+ 1 2 ))

(class [1 2 3])
(class '(1 2 3))

(coll? '(1 2 3))
(coll? [1 2 3])

(seq? '(1 2 3))
(seq? [1 2 3])

(range 4)
(range)
(take 4 (range))

(cons 4 [1 2 3])
(cons 4 '(1 2 3))

(conj [1 2 3] 4)
(conj '(1 2 3) 4)
(conj '(1 2 ) 3 4)

(concat [1 2] '(3 4))

(map inc [1 2 3])
