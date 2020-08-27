def generateStage(bar) {
    stage ("${bar}") {
        sh "echo Building for ${bar}"
    }
}

def generateStage

pipeline {
    agent any
    stages {
        stage('Main') {
            steps {
                script {
                    generateStage("bar")
                }
            }
        }
    }
}

