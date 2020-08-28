pipeline {
    agent any
    stages {
        stage('Main') {
            steps {
                script {
                    sh 'printenv'
                    build "/var/jenkins_home/workspace/pipeline-test/${GIT_BRANCH}"
                    parameters: [
                        [ $class: 'StringParameterValue', name: 'JOB_NAME', value: 'Makefile'],
                        [ $class: 'StringParameterValue', name: 'JOB_TARGET', value: 'make all']
                    ]
                }
            }
        }
    }
}

