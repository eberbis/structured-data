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
  "Takes a vector as a parameter and adds "<3" to its end."
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


(defn height [rectangle]
  "Returns the height of a rectangle"
  (let [[[x1 y1] [x2 y2]] rectangle]
  (Math/abs (- y1 y2))))


(defn width [rectangle]
  "Returns the width of a rectangle"
  (let [[[x1 y1] [x2 y2]] rectangle]
  (Math/abs (- x1 x2))))


(defn square? [rectangle]
  "Returns true if rectangle is a square. Otherwise false"
  (== (height rectangle) (width rectangle)))


(defn area [rectangle]
  "Returns the area of the given rectangle"
  (* (height rectangle) (width rectangle)))


(defn contains-point? [rectangle point]
  "Returns true if rectangle contains point. Otherwise false"
  (let [[[x1 y1] [x2 y2]] rectangle [xp yp] point]
      (and (<= x1 xp x2) (<= y1 yp y2)
      )
  )
)


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
