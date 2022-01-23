package starter.platform;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

import com.google.inject.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginActions extends UIInteractions {

    @Step("Login by account '{0}'")
    public void loginAs(String keyword) {
        findBy("//input[@placeholder='用户名']").sendKeys(keyword);
        findBy("//input[@placeholder='密码']").sendKeys(keyword);
        findBy("//input[@placeholder='验证码']").sendKeys("vcswk", Keys.ENTER);

    }
}
