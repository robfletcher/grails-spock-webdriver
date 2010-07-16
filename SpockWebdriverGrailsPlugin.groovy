class SpockWebdriverGrailsPlugin {

    def version = "0.1"
    def grailsVersion = "1.3.0 > *"
    def dependsOn = [spock: "0.5-groovy-1.7-SNAPSHOT"] // TODO: can we make this flexible?
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Rob Fletcher"
    def authorEmail = "rob@energizedwork.com"
    def title = ""
    def description = ""

    def documentation = "http://grails.org/plugin/spock-webdriver"

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
    }

    def doWithDynamicMethods = { ctx ->
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }
}
