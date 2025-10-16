def call(String goal) {
    //stage('Build with Maven') {
     //   echo "Running Maven Goals: ${goals}"
      //  sh "mvn -s ${libraryResource('config/maven-settings.xml')} ${goals}"
     // }
   // sh "mvn clean install"
    sh "mvn clean ${goal}"
  
}
