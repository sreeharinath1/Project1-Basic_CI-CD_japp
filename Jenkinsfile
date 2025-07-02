pipeline {
    agent any

    tools {
        maven 'maven 3.9.10'  // Make sure this matches the Maven tool name in Jenkins
    }

    stages {
        stage('Check Out') {
            steps {
                git branch: 'main', url: 'https://github.com/sreeharinath1/Project1.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
