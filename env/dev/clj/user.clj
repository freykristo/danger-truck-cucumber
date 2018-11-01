(ns user
  (:require [danger-truck-cucumber.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [danger-truck-cucumber.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'danger-truck-cucumber.core/repl-server))

(defn stop []
  (mount/stop-except #'danger-truck-cucumber.core/repl-server))

(defn restart []
  (stop)
  (start))


