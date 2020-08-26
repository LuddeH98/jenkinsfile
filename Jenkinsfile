def generateStage(bar) {
    return {
        agent {
            docker {
                image 'ubuntu:latest'
            }
        }
        script {
            stage("Build ${bar}") {
                echo "Building for ${bar}"
            }
        }
    }
}

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                script {
                    generateStage("build").call()
                }
            }
        }
    }
}

