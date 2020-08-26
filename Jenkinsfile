def generateStage(bar) {
    return {
        agent {
            docker {
                image 'ubuntu:latest'
            }
        }
        stage("${bar}") {
            sh "echo Building for ${bar}"
        }
    }
}

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                agent {
                    node {
                        generateStage("cool").call()
                    }
                }

            }
        }
    }
}

