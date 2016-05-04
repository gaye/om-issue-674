(ns issue674.component.input
  (:require [om.dom :as dom]
            [om.next :as om :refer-macros [defui]]))

(defui Input
  static om/IQuery
  (query [this] [:text])

  Object
  (render [this]
    (defn handle-change [event]
      (om/transact! this `[(app/update-text {:value ~event.target.value})]))
    (let [{:keys [text]} (om/props this)]
      (dom/input #js {:type "text"
                      :value text
                      :onChange handle-change}))))

(def input (om/factory Input))
