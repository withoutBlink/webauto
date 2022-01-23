package starter.platform;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.SingleBrowser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.WithTimeout;
import io.netty.handler.codec.http.multipart.DiskAttribute;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;

import org.bouncycastle.crypto.prng.drbg.DualECPoints;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenLoginPlatform {

    /**
     * Define the webdriver instance to be used for these tests
     */
    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    /**
     * Navigation actions. This is a UIInteraction class so it will be instantiated
     * automatically by Serenity.
     */
    NavigateActions navigate;

    /**
     * Actions related to searches. This is a UIInteraction class so it will be
     * instantiated automatically by Serenity.
     */
    LoginActions login;

    /**
     * A page object representing a Wikipedia article that is currently appearing in
     * the browser.
     * Page Objects are automatically initialised by Serenity.
     */
    DisplayedPage displayedPage;

    @Test
    void loginByAdminUser() {
        navigate.toTheHomePage();
        login.loginAs("yangqltest");
        Serenity.reportThat("Successful login should be 'dment' in title",
                () -> assertThat(displayedPage.getCurrentPage().contains("dment")));
    }

    @Test
    void DTCheckout() {
        // navigate
    }
}
