package com.hepsiburada.testautomation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 400, 1000);
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void clickElement(By by) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }

    public void sendKeys(By by, CharSequence text) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By by) {
        return findElement(by).getText();
    }


}
