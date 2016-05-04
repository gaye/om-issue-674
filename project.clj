(defproject issue674 "0.0.0"
  :description "Minimal repro for https://github.com/omcljs/om/issues/674"
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.51" :exclusions [org.apache.ant/ant]]
                 [org.omcljs/om "1.0.0-alpha32"]
                 [figwheel-sidecar "0.5.0-20151109.200757-7"]])
