def call(){
  sh "docker-compose down && docker-compose up -d"
}

###########
Jenkins Code Snippet for calling/passing parameters  to Shared Library

  
stage("Shared Library Docker Compose ") {
steps {
  script {
    docker_compose()
} 
}
}  
