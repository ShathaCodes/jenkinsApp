pipeline {
	agent any
	parameters {
		string(name: 'VERSION', defaultValue: '1.3.0', description: 'version to deploy on prod')
		booleanParam(name: 'executeTests', defaultValue: true, description: '')
	}
	
	stages {
		stage("build") {
			steps {
				echo 'building the application...'
			}
		}
		stage("test") {
			when {
				expression {
					params.executeTests
				}
			}
			steps {
				echo 'testing the application...'
			}
		}
		stage("deploy") {
			steps {
				echo 'deploying the application...'
				echo 'version is ${params.VERSION}'
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
