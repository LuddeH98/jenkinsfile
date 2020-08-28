def foo (name, command) {
    node {
        docker.image("ubuntu:latest").inside {
            sh "${command}"
        }

    }
}

pipeline {
    agent any
    stages {
        stage('Main') {
            steps {
                script {
                    foo("Makefile", "make all")
                }
            }
        }
    }
}

