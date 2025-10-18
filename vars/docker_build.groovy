// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}

###########
Jenkins Code Snippet for calling/passing parameters  to Shared Library

  
stage("Shared Library Docker Build") {
steps {
  script {
    docker_build("notes-app","latest","srinadhm)
} 
}
}  
