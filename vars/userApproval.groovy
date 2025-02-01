def call() {
    def config = loadConfig()  

    if (config.KEEP_APPROVAL_STAGE) {  // Check if approval is required
        pipeline {
            stages {
                stage('User Approval') {
                    steps {
                        input message: "Proceed with deployment?", ok: 'Approve'
                    }
                }
            }
        }
    } else {
        echo "Skipping approval stage as per config."
    }
}
