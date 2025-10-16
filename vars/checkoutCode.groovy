def call(String repoUrl, String branch) {
    stage('Checkout Source Code') {
        checkout([
            $class: 'GitSCM',
            branches: [[name: branch]],
            userRemoteConfigs: [[url: repoUrl]]
        ])
    }
}
