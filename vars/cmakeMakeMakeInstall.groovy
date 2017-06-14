#!/usr/bin/env groovy

def call(Map<String, Object> args) {
    def cacheFile = args.containsKey('cacheFile') ? args.cacheFile : null
    def modules = args.containsKey('modules') ? args.modules : null
    def makeJobs = args.containsKey('makeJobs') ? args.makeJobs : null

    def cmdLine = "set -e"

    if (modules) {
        for (def module : modules) {
            def source = module.source
            def name = module.name
            cmdLine += " && source ${source} && module add ${name}"
        }
    }

    cmdLine += " && /project/res/x86_64_RH_6/bin/cmake" + (cacheFile ? " -C ${cacheFile} " : "") + " .."
    cmdLine += " && make" + (makeJobs ? " -j ${makeJobs} " : "")
    cmdLine += " && make install"
    sh cmdLine
}