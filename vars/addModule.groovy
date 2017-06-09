#!/usr/bin/env groovy

def call(String module) {
    sh "source /usr/share/Modules/init/bash && " +
            "module add ${module}"
}