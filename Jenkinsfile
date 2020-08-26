def generateStage(bar) {
    stage ("${bar}") {
        steps {
            sh "echo Building for ${bar}"
        }
    }
}
pipeline {
    agent any
    stages {
        stage('Main') {
            agent {
                docker {
                    image 'ubuntu:latest'
                }
            }
            steps {
                sh "echo Building for aaa"
            }
        }
    }
}

