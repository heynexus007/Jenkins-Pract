pipeline{
    //agent { label 'agent-k'}
    agent any
    
    stages{
        stage('Clone Repo'){
            steps{
                git url: 'https://github.com/heynexus007/Jenkins-Pract.git', branch: 'main'
            }
        }
        
        stage('Compile & Run QuickSort'){
            steps{
                sh 'javac QuickSort.java'
                sh 'java QuickSort.java > output.txt'
            }
        }
        stage('Output'){
            steps{
                sh 'cat output.txt'
            }
        }
    }
    
    post{
        success {
            echo 'Successfully cloned and executed QuickSort!'
        }
        failure {
            echo 'Pipeline failed during clone or execution.'
        }
    }
}
