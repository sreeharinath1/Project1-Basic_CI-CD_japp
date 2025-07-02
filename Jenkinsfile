pipeline {
    agent any

    tools {
        maven 'maven 3.9.10'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/sreeharinath1/Project1.git'
            }
        }

        stage('Build WAR') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Archive WAR') {
            steps {
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                deploy adapters: [
                    tomcat8(
                        credentialsId: 'tomcat-creds',
                        path: '',
                        url: 'http://13.235.9.222:8080'
                    )
                ],
                contextPath: 'project1',
                war: 'target/project1-1.0-SNAPSHOT.war'
            }
        }
    }
}	
