def generateStage(bar) {
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
        docker_agent()
        stage('build') {

            steps {
                generateStage("cool")
            }
        }
    }
}

