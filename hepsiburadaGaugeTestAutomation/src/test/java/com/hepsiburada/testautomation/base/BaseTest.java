package com.hepsiburada.testautomation.base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {

    public static WebDriver driver;
    protected static ChromeDriverService service;


    @BeforeScenario
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.hepsiburada.com/");
    }


    @AfterScenario
    public void tearDown() throws Exception {
        driver.quit();
    }
}



