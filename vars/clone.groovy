def call(String url, String branch){
                echo 'cloning the code'   // Just prints text
                git url: "${url}",branch: "${branch}"
                echo "code cloning successful"
                
}
