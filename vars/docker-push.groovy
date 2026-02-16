def call( String Project , String ImageTag , String DockerHubUser){
  withCrendentials{[usernamePassword(crendentialid: 'dockerHubCred' , passwordvariable: 'dockerHubPass', usernameVariable: 'dockerHubUser' )]}
  sh  "docker login -u ${dokcerhubuser} -p ${dockerhubpass}""
}
 sh "docker push ${dockerhubuser}/${project}: ${ImageTag}"
}
