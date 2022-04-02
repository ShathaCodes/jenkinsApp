def buildApp() {
  echo 'building the application with groovy!'
}
def testApp() {
  echo 'testing the application...'
}
def deployApp() {
  echo 'deploying the application...'
				echo "version is ${params.VERSION}"
}
return this
