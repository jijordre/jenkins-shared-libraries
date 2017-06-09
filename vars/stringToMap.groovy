#!/usr/bin/env groovy

def call(Map<String, Object> args) {
    def param = args.param
    def entriesDelimiter = args.containsKey('entriesDelimiter') ? args.entriesDelimiter : ','
    def keyValueDelimiter = args.containsKey('keyValueDelimiter') ? args.keyValueDelimiter : ':'
    def result = [:]
    for (def entry : param.split(entriesDelimiter)) {
        def keyValue = entry.split(keyValueDelimiter)
        result.put(keyValue[0], keyValue[1])
    }
    return result
}