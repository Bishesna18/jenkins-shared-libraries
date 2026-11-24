def call(String ProjectName, String ImageTag, String dockerhubcred){
  sh "docker build -t ${dockerhubcred}/${ProjectName}:${ImageTag} ."
}
