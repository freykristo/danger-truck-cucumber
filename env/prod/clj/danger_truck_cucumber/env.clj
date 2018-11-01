(ns danger-truck-cucumber.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[danger-truck-cucumber started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[danger-truck-cucumber has shut down successfully]=-"))
   :middleware identity})
