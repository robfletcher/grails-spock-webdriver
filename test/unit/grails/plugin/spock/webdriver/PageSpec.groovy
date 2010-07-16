package grails.plugin.spock.webdriver

import spock.lang.Specification
import org.openqa.selenium.WebDriver
import spock.lang.Unroll

class PageSpec extends Specification {

	@Unroll("invoking to on #pageType with #params opens #url")
	def "to opens the page using the static URL"() {
		given: "a page object"
		def page = pageType.newInstance()
		page.driver = Mock(WebDriver)

		when: "the to method is invoked"
		page.to(params)

		then: "the browser is sent to the page's URL"
		1 * page.driver.get(url)

		where:
		pageType         | params  | url
		CreatePiratePage | null    | "/pirate/create"
		EditPiratePage   | [id: 1] | "/pirate/edit/1"
	}

}

class CreatePiratePage extends Page {

	static url = {
		"/pirate/create"
	}

}

class EditPiratePage extends Page {

	static url = {
		"/pirate/edit/$id"
	}

}
