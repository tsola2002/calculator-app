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

    }
}