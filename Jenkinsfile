def generateStage(bar) {
    stage ("${bar}") {
        steps {
            sh "echo Building for ${bar}"
        }
    }
}
pipeline {
    agent any
    stages {
        stage('Main') {
            steps {
                stage ("${bar}") {
                    steps {
                        sh "echo Building for ${bar}"
                    }
                }
            }
        }
    }
}

