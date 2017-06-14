#!/usr/bin/env groovy

def call(Map<String, Object> args) {
    def params = args.params
    def filterKeys = args.containsKey('filterKeys') ? args.filterKeys : params.keySet()
    def result = []
    for (def key : filterKeys) {
        if (params.containsKey(key)) {
            def paramValue = params.get(key)
            if (paramValue in Boolean) {
                result.add("set(${key} ${paramValue ? "ON" : "OFF"} CACHE BOOL \"n\")")
            } else /*(paramValue in String)*/ {
                result.add("set(${key} \"${paramValue}\" CACHE STRING \"n\")")
            }
        }
    }
    return result
}
