pipeline {
    agent any
    parameters {
        string(name: 'JOB_NAME', defaultValue: '', description: 'Name of the job')
        string(name: 'JOB_TARGET', defaultValue: '', description: 'Target command for the job')
    }
    stages {
        stage("${params.JOB_NAME}") {
            steps {
                sh "${params.JOB_TARGET}"
            }
        }
    }
}