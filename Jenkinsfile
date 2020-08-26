def generateStage(bar) {
    stage ("${bar}") {

    }
    sh "echo Building for ${bar}"
}

def docker_agent() {
    agent {
        docker {
            image 'ubuntu:latest'
        }
    }
}

pipeline {
    agent any
    stages {
        stage('Main') {
            steps {
                generateStage("cool")
            }
        }
    }
}

