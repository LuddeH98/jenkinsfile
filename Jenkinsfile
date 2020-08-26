def generateStage(bar) {
    return {
        stage("${bar}") {
            agent {
                docker {
                    image 'ubuntu:latest'
                }
            }
            steps {
                sh "echo Building for ${bar}"
            }

        }
    }
}

pipeline {
    agent any
    stages {
        stage('build') {
            parallel {
                script {
                    generateStage("cool").call()
                }
            }
        }
    }
}

