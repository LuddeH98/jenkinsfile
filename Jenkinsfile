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
            stage ("aa") {
                steps {
                    sh "echo Building for ${bar}"
                }
            }
        }
    }
}

