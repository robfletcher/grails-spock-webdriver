package grails.plugin.spock.webdriver

import org.openqa.selenium.WebDriver

class Page {

	WebDriver driver

	void to(params) {
		def c = this.class.url.clone()
		c.delegate = params
		driver.get(c())
	}

	String toString() {
		getClass().simpleName
	}
}
