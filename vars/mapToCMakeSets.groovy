#!/usr/bin/env groovy

def call(Map<String, Object> args) {
    def params = args.params
    def filterKeys = args.containsKey('filterKeys') ? args.filterKeys : params.keySet()
    def result = []
    for (def key : filterKeys) {
        if (params.containsKey(key)) {
            result.add("set(${key} \"${params.get(key)}\" CACHE STRING \"n\")")
        }
    }
    return result
}
