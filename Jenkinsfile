def generateStage(bar) {
    sh "echo Building for ${bar}"
}

def docker_agent() {
    docker {
        image 'ubuntu:latest'
    }
}

pipeline {
    agent any
    stages {
        stage('Main') {
            agent { docker_agent() }
            steps {
                generateStage("cool")
            }
        }
    }
}

