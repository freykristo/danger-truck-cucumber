(ns danger-truck-cucumber.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [danger-truck-cucumber.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[danger-truck-cucumber started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[danger-truck-cucumber has shut down successfully]=-"))
   :middleware wrap-dev})
