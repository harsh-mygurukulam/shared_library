// Define the 'cloneRepo' method in your shared library
def call(String repoUrl) {
    def config = loadConfig()  // Load config file
    def branch = config.ENVIRONMENT == "prod" ? "main" : "develop"

    // Clone the repository based on the branch
    sh "git clone -b ${branch} ${repoUrl}"
}
