pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        
        stage('invoke analyzer') {
     steps {
         script {
              withCredentials([usernamePassword(credentialsId: 'luis_kiuwan',
                        passwordVariable: 'PASSWORD',
                        usernameVariable: 'USERNAME')]) {
                            def returnCode = sh '${AGENT_HOME}/bin/agent.sh -s \"${WORKSPACE}\" -n \"Blueblog\" -c -l ${BUILD_NUMBER} --user \"$USERNAME\" --pass \"$PASSWORD\"'
                         echo $returnCode
                         switch(returnCode){
                                case 0:
                                    break
                                case 14:
                                    currentBuild.result = 'UNSTABLE'
                                    break
                                case 1:
                                case 10:
                                    currentBuild.result = 'FAILURE'
                                    break
                                case 11:
                                case 12:
                                    currentBuild.result = 'NOT_BUILT'
                                    break
                                case 13:
                                    currentBuild.result = 'ABORTED'
                                    break
                                default:
                                    currentBuild.result = 'NOT_BUILT'
                                }
                        }
                  }
             }
    }
        
        
        
        
        
        
        
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
