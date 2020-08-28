def foo (name, command) {
    dockerNode(image: 'ubuntu') {
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

