def gv

pipeline {
	agent any
	parameters {
		string(name: 'VERSION', defaultValue: '1.3.0', description: 'version to deploy on prod')
		booleanParam(name: 'executeTests', defaultValue: true, description: '')
	}
	
	stages {
		stage("init") {
			steps {
				script {
					gv = load "script.groovy"
				}
			}
		}
		stage("build") {
			steps {
				script {
					gv.buildApp()
				}
			}
		}
		stage("test") {
			when {
				expression {
					params.executeTests
				}
			}
			steps {
				script {
					gv.testApp()
				}
			}
		}
		stage("deploy") {
			steps {
				script {
					gv.deployApp()
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
