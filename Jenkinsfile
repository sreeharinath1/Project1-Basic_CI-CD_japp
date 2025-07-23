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

        stage('Pre-clean') {
            steps {
                sh 'rm -rf target'
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

        stage('Deploy WAR via curl') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'tomcat-deploy-creds', usernameVariable: 'TOMCAT_USER', passwordVariable: 'TOMCAT_PASS')]) {
                    sh '''
                    curl -u "$TOMCAT_USER:$TOMCAT_PASS" \
                         -T target/project1-1.0-SNAPSHOT.war \
                         "http://3.110.218.114:8080/manager/text/deploy?path=/project1&update=true"
                    '''
                }
            }
        }
    }
}
