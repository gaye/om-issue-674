(ns issue674.component.app
  (:require [issue674.component.input :as input]
            [om.dom :as dom]
            [om.next :as om :refer-macros [defui]]))

(defui App
  Object
  (render [this]
    (input/input)))
