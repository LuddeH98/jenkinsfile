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
        stage('build') {
            docker_agent()
            steps {
                generateStage("cool")
            }
        }
    }
}

