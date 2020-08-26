pipeline {
    agent any
    stages {
        agent {
            docker {
                image 'ubuntu:latest'
            }
        }
        stage('build') {
            steps {
                sh 'echo "Hello there"'
            }
        }
    }
}