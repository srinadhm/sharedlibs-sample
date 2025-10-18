def call(String GitUrl, String GitBranch){
  git url: "${GitUrl}", branch: "${GitBranch}"
}

###########
Jenkins Code Snippet for calling/passing parameters  to Shared Library

  
stage("Shared Library Docker Compose ") {
steps {
  script {
    clone("https://github.com/LondheShubham153/django-notes-app.git","main")
} 
}
}  
