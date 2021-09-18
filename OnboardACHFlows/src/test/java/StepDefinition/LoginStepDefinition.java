package StepDefinition;

import Steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class LoginStepDefinition {

    @Managed
    WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Given("user launch the google page")
    public void user_launch_the_google_page() {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
}
