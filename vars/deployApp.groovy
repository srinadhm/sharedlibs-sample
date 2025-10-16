def call(String destination = '/Users/mupparajusrinadh/Documents/Jenkins-Workspace', String artifactlocation = 'target/*.jar') {
    stage('Deploy Application') {
        echo "Deploying application to ${destination}”
        sh """
        cp ${artifactlocation} ${destination}
      
        """
    }
}
