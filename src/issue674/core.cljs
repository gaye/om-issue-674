(ns issue674.core
  (:require [issue674.component.app :as app]
            [issue674.parser :as parser]
            [goog.dom :as gdom]
            [om.next :as om]))

(def initial-state
  (atom {:text "Can you see me?"}))

(def reconciler
  (om/reconciler {:state initial-state
                  :parser (om/parser {:read parser/read
                                      :mutate parser/mutate})}))

(om/add-root! reconciler app/App (gdom/getElement "container"))
