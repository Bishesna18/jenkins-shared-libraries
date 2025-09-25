def call(String project, String imageTag, String dockerhubUser) {
    withCredentials([usernamePassword(credentialsId: 'dockerHubCred', 
                                      passwordVariable: 'dockerHubPass', 
                                      usernameVariable: 'dockerHubUser')]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${project}:${imageTag}"
    }
}
