package com.andromeda;

import org.junit.Test;
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
        



        // driver.quit();

    }
}
