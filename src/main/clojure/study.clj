; require는 클로저 라이브러리를 로드한다.
; 이상없이 로드되면 nil을 반환한다.
(require 'examples.introduction)

; require를 사용해 라이브러리를 로드한 경우,
; 전체 namespace를 작성해줘야 한다.
(take 10 examples.introduction/fibs)

; refer는 현재 namespace를 새로운 namespac으로 대응시킨다.
; 이상없이 로드되면 nil을 반환한다.
(refer 'examples.introduction)
; refer로 로드하면 namespace 없이 호출 할 수 있다.
(take 10 fibs)

; use를 사용하면 require와 refer가 한꺼번에 이루어진다.
(use 'examples.introduction)
(take 10 fibs)

; quot 정수를 나눈 몫
(quot 22 7)

; rem 나머지
(rem 22 7)

(find-doc #"\?$")


(def inventors {
                 "lisp" "McCarthy"
                 "Clojure" "Hickey"}
  )

(inventors "lisp")


(invetors "foo")

(get inventors "lisp" "I donno")
(get inventors "foo" "I donno")

:foo (def inventors {
                      :lisp "McCarthy"
                      :Clojure "Hickey"}
       )

(inventors :lisp)

(:Clojure inventors)

(defstruct book :title :author)

(def b (struct book "Anathem" "Neal Stephenson"))

(:title b)
(b :title)

{:title "Forrest Gump", :author "Forrest"}
{:title "네 멋대로 해라", :author "Forrest1234"}

(b :title)

(defn greeting
  "Returns a greeting of the form 'Hello, username'"
  [username]
  (str "Hello, " username)
  )

(greeting "Forrest1")

(doc greeting)

(defn greeting
  "Returns a greeting of the form 'Hello, username'
            Default username is 'world'."
  ([] (greeting "world"))
  ([username] (str "Hello, " username)))

(greeting)


(defn date [person-1 person-2 & chaperones]
  (println person-1 " and " person-2 " went out with " (count chaperones) "chaperones."))


(date "Romeo" "Juliet" "Friar Lawrence" "Nurse")


(defn indexable-word? [word]
  (> (count word) 2))

(require '[clojure.string.split :as str])

(filter indexable-word? (str/split "A fine day it is" #"\W+"))

(filter (fn [w] (> (count w) 2))
  (str/split "A fine day it is" #"\W+"))

(filter #(> (count %) 2)
  (str/split "A fine day it is" #"\W+"))

(defn indexable-words [text]
  (let [indexable-word? (fn [w] (> (count w) 2))]
    (filter indexable-word? (str/split text #"\W+"))))

(indexable-words "a fine day it is")

(defn make-greeter [greeting-prefix]
  (fn [username] (str greeting-prefix ", " username)))

(def hello-greeting (make-greeter "Hello"))

(def aloha-greeting (make-greeter "aloha"))

(hello-greeting "world")

(aloha-greeting "world")

((make-greeter "Howdy") "pardner")

(def foo 10)

foo

(var foo 10)

#'foo

(defn triple [number] (* 3 number))

(triple 10)

(doc let)

(defn square-corners [bottom left size] ; 함수 선언 함수명 파라미터
  (let [
         top (+ bottom size) ; let 바인딩
         right (+ left size)
         ] 1
           [
             [bottom left]
             [top left]
             [top right]
             [bottom right]
             ] ; let exprs* (let expressions*)
           ))

(square-corners 10 15 5)

(defn greet-author-1 [author]
  (println "Hello, " (:first-name author)))

(greet-author-1 {:last-name "Vinge" :first-name "vernor"})

(defn greet-author-2 [{fname :first-name}]
  (println "Hello, " fname))

(greet-author-2 {:last-name "Vinge" :first-name "Vernor"})


(defn greet-author-3 [{fname :last-name}]
  (println "Hello, " fname))

(greet-author-3 {:last-name "Choi" :first-name "Forrest"})


(let [[x y] [1 2 3]] [x y])

(let [[_ _ z] [1 2 3]] z)

(let [[x y :as coords] [1 2 3 4 5 6]]
  (str "x: " x ", y: " y ", total dimensions " (count coords)))

(require '[clojure.string :as str])

(defn ellipsize [words]
  (let [[w1 w2 w3] (str/split words #"\s+")]
    (str/join " " [w1 w2 w3 "..."])))

(ellipsize "Forrest는 천재가 아닙니다. 하지만 열심히 노력합니다.")

(def foo 10)

(resolve 'foo)

(in-ns 'myapp)

String

(clojure.core/use 'clojure.core)

java.io.File/separator/



(import '(java.io InputStream File))

File/separator



(require 'clojure.core.math)

(clojure.core.math/round 1.7)



(use 'clojure.core.math)

(round 1.7)


(import '(java.io InputStream File))

(.exists (File. "/The KMPlayer"))


(require 'clojure.string)

(clojure.string/split "something,separated,by,commas" #",")

(clojure.string/replace (clojure.string/split "something,separated,by,commas" #",") '"[" "")

(def rnd (new java.util.Random))

(* -10 (. rnd nextInt))

(use :reload 'examples.exploring)

(find-doc "ns-")

; Clojure if 문

(in-ns 'user)

(defn is-small? [number]
  (if (< number 100) "yes" "no"))

(is-small? 1000)

(defn is-small? [number] ; is-small? 함수 정의  파라미터는 [number]
  (if (< number 100) ; number가 100 보다 크다면
                     "yes" ; 참이면 "yes"를 출력
                     (do ; 거짓이면,
                       (println "Saw a big number" number) ; 메세지를 출력하고,
                                                           "no"))) ; "no"를 출력

(is-small? 200)

; loop/recur 문
(loop [result [] x 5] ; loop는 [bindings”]를 파라미터로 받기 때문에, result에는 빈벡터가, x에는 5가 바인딩된다.
                      (if (zero? x) ; x가 0 이면,
                                    result ; result 출력.
                                    (recur (conj result x) (dec x)))) ; 그렇지 않다면, result에 x 값을 추가하고, x 값을 1 감소(dec) 시키고,
; loop 의 첫 구문으로 돌아간다.
; 구구단
(loop [dan 5 gop 1]
  (if (< gop 10)
    (println dan " * " gop " = " (* dan gop)))
  (recur 5 (+ 1 gop)))

(doc recur)

(doc conj)

(def aaa (conj "Hello" ", world"))
aaa

(dec 5)

(doc dec)

(into [] (take 5 (iterate dec 5)))

(into [] (drop-last
           (reverse (range 6))))

(vec (reverse (rest (range 6))))

(defn indexed [coll]
  (map vector (iterate inc 0) coll))

(indexed "abcde")

(defn index-filter [pred coll]
  (when pred
    (for [[idx elt] (indexed coll) :when (pred elt)] idx)))

(index-filter #{\a \b} "abcdbbb")

(index-filter #{\a \b} "xyz")

(defn index-of-any [pred coll]
  (first (index-filter pred coll)))

(index-of-any #{\z \a} "zzabyycdxx")

(index-of-any #{\b \y} "zzabyycdxx")

(doc first)

(doc index-filter)


; with-meta 예제
(def stu {:name "Stu" :email "stu@thinkrelevance.com"})
(def serializable-stu (with-meta stu {:serializable true}))

(= stu serializable-stu)

(identical? stu serializable-stu)

(meta stu)

(meta serializable-stu)

(def stu-with-address (assoc serializable-stu :state "NC"))

(meta stu-with-address)

(meta #'str)

(defn #^{:tag String} shout [#^{:tag String} s] (.toUpperCase s))

(meta #^shout)
(shout 1)

(shout "hello")

(defn #^String shout [#^String s]
  (.toUpperCase s))

(new java.util.Random)

(def rnd (new java.util.Random))

(. rnd nextInt 100)

;(defn gugudan [dan]
;  (loop ))

(. Math PI)

(import '(java.util Random Locale)
  '(java.text MessageFormat))

Random

Locale

MessageFormat

(Random. (nextInt 20))

(Math/PI)


(System/currentTimeMillis)

(.. '(1 2) getClass getProtectionDomain getCodeSource getLocation)

(doto (System/getProperties)
  (.setProperty "name" "Forrest")
  (.setProperty "favoriteColor" "blue"))

(doto (System/getProperties)
  (.getProperty "name"))

(make-array String 5)

(seq (make-array String 5))

(seq (int-array 10))

(find-doc "-array")

(defn painstakingly-create-array []
  (let [arr (make-array String 5)]
    (aset arr 0 "painstaking")
    (aset arr 1 "to")
    (aset arr 2 "fill")
    (aset arr 3 "in")
    (aset arr 4 "arrays")
    arr))

(alength (painstakingly-create-array))

(aget (painstakingly-create-array) 1)

(def aaa (to-array ["aaaa" "bbbb" "cccc"]))

(aget (aaa) 1)



(def strings (into-array
                ["some" "strings" "here"]))

(seq (amap strings idx ret (.toUpperCase (aget strings idx))))

(areduce strings idx ret 0
                 (max ret
                   (.length  (aget strings idx))
                   )
                 )


(map (memfn toUpperCase) ["a" "short" "message"])

(map #(.toUpperCase %) ["a" "short" "message"])

(doc map)

(doc memfn)
