// vars/docker_push.groovy
def call(String project, String imageTag, String dockerhubUser) {
    withCredentials([usernamePassword(credentialsId: 'dockerhubcred',
                                      usernameVariable: 'DH_USER',
                                      passwordVariable: 'DH_PASS')]) {
        sh '''
            echo "$DH_PASS" | docker login -u "$DH_USER" --password-stdin
        '''
        sh "docker push ${dockerhubUser}/${project}:${imageTag}"
    }
}
