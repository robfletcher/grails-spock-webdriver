package grails.plugin.spock.webdriver

import spock.lang.Specification
import org.openqa.selenium.WebDriver

class WebDriverSpec extends Specification {

	static WebDriver driver

	@Delegate Page currentPage

	static <T extends Page> void to(Class<T> pageClass) {
		driver.get pageClass.url
		currentPage = T.newInstance(driver)
	}

	static <T extends Page> boolean at(Class<T> pageClass) {
		currentPage.verifyOnPage()
	}
	
}
