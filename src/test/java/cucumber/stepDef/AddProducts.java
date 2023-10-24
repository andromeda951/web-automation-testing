package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddProducts {
    public static Login init;

    @Given("list product of standard_user")
    public void listProductOfStandardUser() {
        init = new Login();

        init.userLaunchTheApp();
        init.userInputRegisteredUser();
        init.userInputRegisteredPassword();
        init.userTapLoginButton();
    }

    @When("user click product")
    public void userClickProduct() {
        init.driver.findElement(By.id("item_4_title_link")).click();
    }

    @And("user click {string} button")
    public static void userClickButton(String arg0) {
        init.driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
    }

    @Then("icon cart showing number")
    public void iconCartShowingNumber() {
        String badge = init.driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals("1", badge);
    }

    @Given("list product of problem_user")
    public void listProductOfProblemUser() {
        init = new Login();

        init.userLaunchTheApp();
        init.driver.findElement(By.id("user-name")).sendKeys("problem_user");
        init.userInputRegisteredPassword();
        init.userTapLoginButton();
    }

    @Then("icon cart not showing number")
    public void iconCartNotShowingNumber() {
        String button = init.driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']")).getText();
        Assert.assertEquals("Add to cart", button);
    }
}
