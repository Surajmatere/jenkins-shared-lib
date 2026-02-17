def call(String project, String imageTag, String dockerUser) {

    withCredentials([usernamePassword(
        credentialsId: 'dockerHubCred',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {

        sh """
            docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}
            docker push ${dockerUser}/${project}:${imageTag}
        """
    }
}

