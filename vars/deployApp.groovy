//def call(String destination = '/Users/mupparajusrinadh/Documents/Jenkins-Workspace', String artifactlocation = 'target/*.jar') {
  def call (String artifactLocation, String Destination) {
    stage('Deploy Application') {
       // echo "Deploying application to ${destination}"
          echo "Deploying application to ${Destination} from ${artifactlocation}"
        sh """
      #  cp ${artifactlocation} ${destination}
         cp ${artifactLocation} ${Destination}
      
        """
    }
}
