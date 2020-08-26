def generateStage(bar) {
    return {
        docker {
            image 'ubuntu:latest'
        }
        steps {
            sh "echo Building for ${bar}"
        }
    }
}

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                script {
                    generateStage("cool").call()
                }
            }
        }
    }
}

