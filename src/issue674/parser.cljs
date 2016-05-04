(ns issue674.parser
  (:require [om.next :as om]))

(defn read [{:keys [state] :as env} key params]
  (let [st @state]
    (if-let [[_ value] (find st key)]
      {:value value}
      {:value :not-found})))

(defmulti mutate om/dispatch)

(defmethod mutate 'app/update-text
  [{:keys [state ref]} _ {:keys [value]}]
   {:action #(swap! state assoc :text value)})
