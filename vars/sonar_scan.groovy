def call(String projectKey) {
    withSonarQubeEnv('SonarQube') {
        sh """
        sonar-scanner \
        -Dsonar.projectKey=${projectKey} \
        -Dsonar.sources=. \
        -Dsonar.host.url=$SONAR_HOST_URL \
        -Dsonar.login=$SONAR_AUTH_TOKEN
        """
    }
}
