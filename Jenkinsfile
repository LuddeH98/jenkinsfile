def generateStage(bar) {
    docker_agent()
    stage ("${bar}") {
        steps {
            sh "echo Building for ${bar}"
        }
    }

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

