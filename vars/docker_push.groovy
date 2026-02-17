def call(String project, String imageTag, String dockerUser) {

    withCredentials([usernamePassword(
        credentialsId: 'dockerHubCreds',   // Updated to match your Jenkins credential ID
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {

        sh """
            echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin
            docker push ${dockerUser}/${project}:${imageTag}
        """
    }
}


