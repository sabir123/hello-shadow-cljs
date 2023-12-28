(ns hello-shadow.core)

(defn hello-world []
  [:div
   [:h1 "Hello, World!"]])

(defn ^:export main []
  (js/console.log "Hello Shadow-Cljs"))

