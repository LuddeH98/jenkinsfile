def foo (command) {
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
                        foo("make unitTest")
                    }
                }
                stage ("Integration tests") {
                    steps {
                        foo("make integrationTest")
                    }
                }
            }
        }
    }
}

