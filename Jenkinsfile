def generateStage(bar) {
    script {
        node {
            docker.image('ubuntu:latest').inside {
                stage ("${bar}") {
                    sh "echo Building for ${bar}"
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
                generateStage("foo")
                generateStage("bar")
                generateStage("baz")
            }
        }
    }
}

