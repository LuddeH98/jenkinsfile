def generateStage(bar) {
    script {
        node {
            stage ("${bar}") {
                sh "echo Building for ${bar}"
            }
        }
    }

}
pipeline {
    agent any
    stages {
        stage('Main') {
            steps {
                generateStage("abc")
            }

        }
    }
}

