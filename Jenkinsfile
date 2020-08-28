def jobHandler (command) {
    node {
        checkout scm

        // Run docker with custom registry
        // https://www.jenkins.io/doc/book/pipeline/docker/

        docker.image("ubuntu:latest").inside {
            sh "echo 'Running command: ${command}'"
        }
    }
}

pipeline {
    agent any
    stages {
        stage('Main') {
            parallel {
                stage ("Unit tests") {
                    steps {
                        jobHandler("make unitTest")
                    }
                }
                stage ("Integration tests") {
                    steps {
                        jobHandler("make integrationTest")
                    }
                }
            }
        }
    }
}

