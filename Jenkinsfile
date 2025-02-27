pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Minimal-Alexi/AikidoTracker.git'

            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco(
            execPattern: '**/target/jacoco.exec', // Path to the JaCoCo execution data
            classPattern: '**/target/classes',   // Path to the class files
            sourcePattern: '**/src/main/java',   // Path to the source code
            exclusionPattern: '**/test/**'       // (Optional) Exclude test classes or specific files
        )   }
        }
    }
}