def generateStage(bar) {
    agent {
        docker {
            image 'ubuntu:latest'
        }
    }
    steps {
        sh "echo Building for ${bar}"
    }
}

pipeline {
    agent any
    stages {
        stage('build') {
            generateStage("cool")
        }
    }
}

