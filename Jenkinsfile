pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/tsola2002/calculator-app.git', branch: 'master'
            }
        }
        stage("Compile") {
            steps {
                bat "mvn clean compile"
            }
        }
        stage("Unit Test") {
                    steps {
                        bat "mvn test"
                    }
        }
        stage("Code coverage") {
            steps {
                bat "mvn clean verify"
                publishHTML(target: [
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true,
                    allowMissing: false
                ])
            }
        }
    }
}