def foo (name, command) {
    pipeline {
        agent any
        stages {
            stage("${name}") {
                steps {
                    sh "${command}"
                }
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

