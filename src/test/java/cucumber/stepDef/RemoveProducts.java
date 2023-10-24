package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class RemoveProducts {

    @When("user click {string} button in inventory page")
    public void userClickButtonInInventoryPage(String arg0) {
        AddProducts.init.driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']")).click();
    }

    @And("user click Remove button")
    public void userClickButtonRemove() {
        AddProducts.init.driver.findElement(By.xpath("//button[@name='remove-sauce-labs-backpack']")).click();
    }
}
