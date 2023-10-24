package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Checkout {
    @And("user click cart icon")
    public void userClickCartIcon() {
        AddProducts.init.driver.findElement(By.className("shopping_cart_link")).click();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() {
        AddProducts.init.driver.findElement(By.xpath("//button[@name='checkout']")).click();
    }

    @And("user input first name")
    public void userInputFirstName() {
        AddProducts.init.driver.findElement(By.id("first-name")).sendKeys("Andro");
    }

    @And("user input last name")
    public void userInputLastName() {
        AddProducts.init.driver.findElement(By.id("last-name")).sendKeys("Meda");
    }

    @And("user input postal code")
    public void userInputPostalCode() {
        AddProducts.init.driver.findElement(By.id("postal-code")).sendKeys("12345");
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        AddProducts.init.driver.findElement(By.xpath("//input[@name='continue']")).click();
    }

    @Then("user redirected to Checkout: Overview page")
    public void userRedirectedToCheckoutOverviewPage() {
        String title =  AddProducts.init.driver.findElement(By.className("title")).getText();
        Assert.assertEquals("Checkout: Overview", title);
    }

    @Then("system show message {string}")
    public void systemShowMessage(String arg0) {
        String errorMsg =  AddProducts.init.driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(arg0, errorMsg);
    }
}
