pipeline {
	agent any
	environment {
		NEW_VERSION = '1.3.0'
	}
	stages {
		stage("build") {
			when {
				expression {
					BRANCH_NAME == 'dev' && CODE_CHANGES == true
				}
			}
			steps {
				echo 'building the application...'
				echo 'building version ${NEW_VERSION}'
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
				withCredentials([
					usernamePassword(credentials: 'git-id', usernameVariable: USER, passwordVariable: PWD)
				]){
					echo 'deploying with ${USER}'
				}
		
			}
		}
	}
	post {
		always {
			echo 'DONEEEEE'
		}
		success {
			echo 'SUCCESS!!!'
		}
		failure {
			echo 'Failed :('
		}
	}
}
