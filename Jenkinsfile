def generateStage(bar) {
    return {
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
        }
    }
}

