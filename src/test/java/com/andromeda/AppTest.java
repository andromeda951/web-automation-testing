package com.andromeda;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
    @Test
    public void main()
    {
        WebDriver driver;
        String baseUrl = "https://kasirdemo.belajarqa.com";

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        
        driver.findElement(By.id("email")).sendKeys("tdd-selenium@gmail.com");
        driver.findElement(By.id("password")).sendKeys("tdd-selenium");
        driver.findElement(By.xpath("//button[@type='submit']")).click();



        // driver.quit();
    }
}
