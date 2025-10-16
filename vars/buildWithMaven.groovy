def call(String goals) {
    stage('Build with Maven') {
        echo "Running Maven Goals: ${goals}"
      //  sh "mvn -s ${libraryResource('config/maven-settings.xml')} ${goals}"
    }
}
