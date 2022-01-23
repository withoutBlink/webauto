package starter.platform;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebdriverAssertionError;

import org.openqa.selenium.support.FindBy;

public class DisplayedPage extends PageComponent {

    public String getCurrentPage() {
        return getDriver().getCurrentUrl();
    }
}
