package com.andromeda;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
    @Test
    public void login_success()
    {
        WebDriver driver;
        String baseUrl = "https://kasirdemo.belajarqa.com";

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get(baseUrl);
        
        driver.findElement(By.id("email")).sendKeys("tdd-selenium@gmail.com");
        driver.findElement(By.id("password")).sendKeys("tdd-selenium");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String username = driver.findElement(By.xpath("//dt[contains(text(),'tdd-selenium')]")).getText();
        Assert.assertEquals(username, "tdd-selenium");

        // driver.quit();
    }
}
