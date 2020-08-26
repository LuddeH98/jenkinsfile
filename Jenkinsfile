def generateStage(bar) {
    stage ("${bar}") {
        steps {
            sh "echo Building for ${bar}"
        }
    }

}

def docker_agent() {
    docker {
        image 'ubuntu:latest'
    }
}

pipeline {
    agent any
    stages {
        stage('Main') {
            steps {
                sh 'echo "a"'
            }
            
        }
    }
}

