package cucumber.stepDef;

import java.time.Duration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com";

    @Given("user launch the app")
    public void userLaunchTheApp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("user input registered user")
    public void userInputRegisteredUser() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("user input registered password")
    public void userInputRegisteredPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user tap login button")
    public void userTapLoginButton() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("user redirected to inventory page")
    public void userRedirectedToInventoryPage() {
        String title = driver.findElement(By.className("title")).getText();
        Assert.assertEquals("Products", title);
    }

    @Then("user input unregistered user")
    public void userInputUnregisteredUser() {
        driver.findElement(By.id("user-name")).sendKeys("unregistered_user");
    }

    @Then("user failed to login and system show message {string}")
    public void userFailedToLoginAndSystemShowMessage(String arg0) {
        String errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(arg0, errorMsg);
    }
}