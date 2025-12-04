def call(String url, String branch){
  echo "Cloning the git url"
  git url: "${url}", branch: "${branch}"
  echo "Cloning is Successful!"
}
