pipeline {
	agent any
	stages {
		stage("build") {
			when {
				expression {
					BRANCH_NAME == 'dev' && CODE_CHANGES == true
				}
			}
			steps {
				echo 'building the application...'
			}
		}
		stage("test") {
			when {
				expression {
					BRANCH_NAME == 'main'
				}
			}
			steps {
				echo 'testing the application...'
			}
		}
		stage("deploy") {
			steps {
				echo 'deploying the application...'
			}
		}
	}
	post {
		always {
			//
		}
		success {
			//
		}
		failure {
			//
		}
	}
}
