def generateStage(bar) {
    node {
        docker.image('ubuntu:latest').inside {
            stage ("${bar}") {
                sh "echo Building for ${bar}"
            }
        }
    }
}

def generateStage2 (bar) {
    return stages {
        stage ("${bar}") {
        }
    }
}

pipeline {
    agent any
    generateStage2("aaa")
}

