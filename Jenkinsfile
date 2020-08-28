def foo (name, command) {
    node {
        checkout scm
        docker.image("ubuntu:latest").inside {
            sh "echo '${command}'"
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

