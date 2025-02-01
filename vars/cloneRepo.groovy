def call(String repoUrl) {
    def config = loadConfig()  // Load config file
    def branch = config.ENVIRONMENT == "prod" ? "main" : "develop"

    pipeline {
        stages {
            stage('Clone Repository') {
                steps {
                    script {
                        sh "git clone -b ${branch} ${repoUrl}"
                    }
                }
            }
        }
    }
}
