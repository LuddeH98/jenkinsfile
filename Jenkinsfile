def generateStage(bar) {
    sh "echo Building for ${bar}"
}

pipeline {
    agent any
    stages {
        stage('build') {
            agent {
                docker {
                    image 'ubuntu:latest'
                }
            }
            steps {
                generateStage("cool")
            }
        }
    }
}

