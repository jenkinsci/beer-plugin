@Library('pipeline-library@pull/220/head') _

def configurations = [
    [ platform: "linux", jdk: "8", jenkins: null ],
    [ platform: "linux", jdk: "11", jenkins: null ]
]
// TODO: change useAci to useContainerAgent
buildPlugin(configurations: configurations, useAci: true)
