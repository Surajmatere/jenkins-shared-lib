def call(String imageName, String tag, String username) {

    sh """
        docker build -t ${username}/${imageName}:${tag} .
    """

}

