def generateStage(bar) {
    agent {
        docker {
            image 'ubuntu:latest'
        }
    }
}

pipeline {
    agent any
    stages {
        generateStage("a")
        stage('Main') {
            steps {
                sh "echo Building for aaa"
            }
        }
    }
}

