def generateStage(bar) {
    return {
        stage("${bar}") {
            echo "Building for ${bar}"
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
                generateStage("cool")
            }
        }
    }
}

