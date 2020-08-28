def foo (name, command) {
    node {
        stage {
            checkout scm

            // Run docker with custom registry
            // https://www.jenkins.io/doc/book/pipeline/docker/

            docker.image("ubuntu:latest").inside {
                sh "echo 'Running command: ${command}'"
            }
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

