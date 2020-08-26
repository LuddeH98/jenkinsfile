def generateStage(bar) {
    return {
        agent {
            docker {
                image 'ubuntu:latest'
            }
        }
        stages {
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

