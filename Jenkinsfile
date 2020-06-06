def dockeruser = "rmpco"
def imagename = "java"
def container = "java7"
def mypassword = "SamsungR580"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/rmpco-iscteiul/ES2_docker'
    }
    
stage('Build Docker Imagae'){
     powershell "docker build -t  ${imagename} ."
    }
    
stage('Stop Existing Container'){
     powershell "docker stop ${container}"
    }
    
stage('Remove Existing Container'){
     powershell "docker rm ${container}"
    }
    
stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit --name ${container} -p 81:80 ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/ubuntu:16.04"
    }

stage('Docker Login and Push Image'){
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'mypassword', usernameVariable: 'dockeruser')]) {
    powershell "docker login -u ${dockeruser} -p ${mypassword}"
    }
    powershell "docker push ${dockeruser}/ubuntu:16.04"
    }

}
