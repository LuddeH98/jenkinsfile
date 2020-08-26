def generateStage(bar) {
    return {
        stage("Build ${bar}") {
            echo "Building for ${bar}"
        }
    }
}

pipeline {
    agent any
    stages {
        agent {
            docker {
                image 'ubuntu:latest'
            }
        }
        stage('build') {
            steps {
                script {
                    generateStage("build").call()
                }
            }
        }
    }
}

