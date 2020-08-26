def generateStage(bar) {
    return {
        stage("Build ${bar}") {
            agent {
                docker {
                    image 'ubuntu:latest'
                }
            }
            steps {
                script {
                    generateStage("build").call()
                }
            }
            echo "Building for ${bar}"
        }
    }
}

pipeline {
    agent any
    stages {
        stage('Main') {
            script {
                generateStage("build").call()
            }
        }
    }
}

