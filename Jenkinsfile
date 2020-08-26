def generateStage(bar) {
    return {
        stage("Build ${bar}") {
            agent {
                docker {
                    image 'ubuntu:latest'
                }
            }
            steps {
                echo "Building for ${bar}"
            }

        }
    }
}

pipeline {
    agent any
    stages {
        script {
            generateStage("build").call()
        }
    }
}

