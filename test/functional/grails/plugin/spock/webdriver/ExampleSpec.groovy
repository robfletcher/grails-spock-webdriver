package grails.plugin.spock.webdriver

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import spock.lang.Shared
import spock.lang.Specification
import java.util.concurrent.TimeUnit

class ExampleSpec extends WebDriverSpec {

	def "I can see the homepage"() {
		when:
		to HomePage

		then:
		at HomePage
	}

}
