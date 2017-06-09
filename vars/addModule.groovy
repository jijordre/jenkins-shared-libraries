#!/usr/bin/env groovy

def call(String module) {
    sh "set -e && " +
            "source /usr/share/Modules/init/bash && " +
            "module add ${module}"
}