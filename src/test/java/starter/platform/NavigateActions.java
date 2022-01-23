package starter.platform;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

/**
 * UIInteractionSteps let us define action classes which regroup related
 * actions.
 * The @Step annotation is used to indicate that this action will appear as a
 * step in the reports.
 */
public class NavigateActions extends UIInteractions {
    // private WebDriver driver_ptr;

    // public NavigateActions(WebDriver driver) {
    // driver_ptr = driver;
    // }

    @Step("Navigate to the home page")
    public void toTheHomePage() {
        openUrl("http://10.97.8.137/");
        WebDriverWait _wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1));
        _wait.withTimeout(Duration.ofSeconds(1));
    }

    @Step("Navigate to the DT page")
    public void toTheDTPage() {

    }
}
