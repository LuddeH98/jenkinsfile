def generateStage(bar) {
    return {
        script {
            agent {
                docker {
                    image 'ubuntu:latest'
                }
            }
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

