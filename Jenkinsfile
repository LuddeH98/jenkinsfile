def generateStage(bar) {

    pipeline {
        agent any
        stages {
            stage('Main') {
                stage ("${bar}") {
                    sh "echo Building for ${bar}"
                }
            }
        }
    }
}

generateStage("bar").call()



