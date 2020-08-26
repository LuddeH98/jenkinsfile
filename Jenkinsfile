def generateStage(bar) {
    return {
        node {
            docker {
                image 'ubuntu:latest'
            }
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
            stage ('cool') {
                script {
                    generateStage("cool").call()
                }
            }
        }
    }
}

