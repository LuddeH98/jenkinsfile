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
            parallel {
                generateStage("foo")
                generateStage("bar")
                generateStage("baz")
                generateStage("bez")
                generateStage("boz")
            }
        }
    }
}

