def call(String imageName, String tag, String username) {
    // Use the parameters passed in the call
    docker.build("${username}/${imageName}:${tag}")
}
