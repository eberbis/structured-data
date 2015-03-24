(ns structured-data)


(defn do-a-thing
  "Uses let to give a name to the common expression (+ x x) in its body."
  [x]
  (let [xx (+ x x)]
    (Math/pow xx xx)))


(defn spiff
  "Takes a vector and returns the sum of the first and third
  elements of the vector. What happens when you pass in a
  vector that is too short?"
  [v]
  (let [first (if (nil? (get v 0)) 0 (get v 0))
        third (if (nil? (get v 2)) 0 (get v 2))]
    (+ first third))


(defn cutify
  "takes a vector as a parameter and adds "<3" to its end."
  [v]
  (conj v "<3"))


(defn spiff-destructuring
  "Rewrites our earlier function spiff by destructuring its parameter"
  [v]
  (let [[x y z] v
        x (if (nil? x) 0 x)
        z (if (nil? z) 0 z)]
    (+ x z))


(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  :-)

(defn height [rectangle]
  :-)

(defn square? [rectangle]
  :-)

(defn area [rectangle]
  :-)

(defn contains-point? [rectangle point]
  :-)

(defn contains-rectangle? [outer inner]
  :-)

(defn title-length [book]
  :-)

(defn author-count [book]
  :-)

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
