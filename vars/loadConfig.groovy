import groovy.yaml.YamlSlurper

def call() {
    def configFile = libraryResource 'config.yml' 
    def yaml = new YamlSlurper().parseText(configFile)  
    return yaml  
}
