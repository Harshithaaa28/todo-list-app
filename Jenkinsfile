pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Clone') {

            steps {

                git 'https://github.com/Keerthana-Keeru/quiz-app.git'
            }
        }

        stage('Build') {

            steps {

                sh 'mvn clean compile'
            }
        }

        stage('Test') {

            steps {

                sh 'mvn test'
            }
        }

        stage('Package') {

            steps {

                sh 'mvn package'
            }
        }

    }

    post {

        success {

            echo 'Build Successful!'
        }

        failure {

            echo 'Build Failed!'
        }
    }
}
