def generateStage(bar) {
    return {
        stage("Build ${bar}") {
            
            steps {
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

