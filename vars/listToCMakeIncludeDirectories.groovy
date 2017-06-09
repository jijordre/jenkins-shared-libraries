#!/usr/bin/env groovy

def call(Map<String, Object> args) {
    def params = args.params
    def placement = args.containsKey('placement') ? args.placement : 'AFTER'
    def result = []
    for (def param : params) {
        result.add("include_directories(${placement} \"${param}\")")
    }
    return result
}
