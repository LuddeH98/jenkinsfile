pipeline {
    agent any
    stages {
        stage('Main') {
            steps {
                script {
                    build job: 'JobPipeline',
                    parameters: [
                        [ $class: 'StringParameterValue', name: 'JOB_NAME', value: 'Makefile']
                        [ $class: 'StringParameterValue', name: 'JOB_TARGET', value: 'make all']
                    ]
                }
            }
        }
    }
}

