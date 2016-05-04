(require '[figwheel-sidecar.repl-api :as api])

(api/start-figwheel!
  {:figwheel-options {}
   :build-ids ["dev"]
   :all-builds
   [{:id "dev"
     :figwheel true
     :source-paths ["src"]
     :compiler {:main 'issue674.core
                :asset-path "js"
                :output-to "public/js/main.js"
                :output-dir "public/js"
                :verbose true}}]})

(api/cljs-repl)
