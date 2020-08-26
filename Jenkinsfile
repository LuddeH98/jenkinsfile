def generateStage(bar) {
    docker {
        image 'ubuntu:latest'
    }
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
            generateStage("cool")
        }
    }
}

