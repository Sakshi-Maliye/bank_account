pipeline {
    agent any // Defines that the pipeline can run on any available agent
    stages {
        stage('Addition') {
            steps {
                script {
                    // Define variables and perform addition
                    def num1 = 10
                    def num2 = 20
                    def sum = num1 + num2
                    
                    // Print the result to the console
                    echo "The sum of ${num1} and ${num2} is: ${sum}"
                }
            }
        }
    }
}
