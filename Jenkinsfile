def generateStage(bar) {
    node {
        docker.image('ubuntu:latest').inside {
            stage ("${bar}") {
                sh "echo Building for ${bar}"
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
                    parallel (
                        generateStage("foo"),
                        generateStage("bar"),
                        generateStage("baz")
                    )
                }
            }
        }
    }
}

