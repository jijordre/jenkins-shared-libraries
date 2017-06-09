#!/usr/bin/env groovy

def call(String rootDir) {
    sh "source /project/res/SDP_bashrc && " +
            "res_perm ${rootDir}"
}