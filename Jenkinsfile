def foo (name, command) {
        dockerNode('ubuntu:latest') {
            sh "${command}"
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

