pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn clean verify'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn install'
            }
        }
    }
}
