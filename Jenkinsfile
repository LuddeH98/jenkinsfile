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
    stages {
        stage ("${bar}") {
        }
    }
}

pipeline {
    agent any
    stages {
        script {
            generateStage2("aaa")
        }
    }
}

