package com.hepsiburada.testautomation.step;

import com.hepsiburada.testautomation.base.BaseTest;
import com.hepsiburada.testautomation.base.BasePage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class StepImplementation extends BaseTest {

    public Object WebElement;

    @Step("https://www.hepsiburada.com/ adresine git <Key> saniye kadar bekle")
    public void waitElement(int Key) throws InterruptedException {
        Thread.sleep(Key + 4000);
    }

    @Step("<Giriş Yap> butonuna tıkla")
    public void clickElementByCss(String element) throws InterruptedException {
        driver.findElement(By.cssSelector("div[id='myAccount']")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.cssSelector("div>div>ul>li>a[id='login']")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.cssSelector("input[id='txtUserName']")).click();

    }

    @Step("<Kullanıcı adı> alanına <text> yazılır ve Giriş Yapılır")
    public void sendKeys(String by, String text) throws InterruptedException {
        WebElement username = driver.findElement(By.id("txtUserName"));
        driver.findElement(By.cssSelector("input[id='txtPassword']")).click();
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),\"Giriş yap\")]"));

        username.sendKeys("xxxx");
        password.sendKeys("xxx");
        login.click();
        TimeUnit.SECONDS.sleep(3);
    }


    @Step("Sepete Git ve Sepet Kontrolü yap")
    public void sepetTutarı (){
        WebElement sepet = driver.findElement(By.cssSelector("a[class='sf-OldMyAccount-2OvEz sf-OldMyAccount-3TYPj']"));
        sepet.click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }


    @Step("Ürün Seç")
    public void urunSec() throws InterruptedException {

        driver.findElement(By.cssSelector("ul[class='sf-MenuItems-1Sj7h']")).click();
        driver.findElement(By.cssSelector("a[class='sf-ChildMenuItems-1Mjr0 item-3548']")).click();
        TimeUnit.SECONDS.sleep(3);

        /*
        WebElement element = driver.findElement(By.cssSelector("label[class=' hbus 70cdebfb-157d-4206-8de0-934c2b8c4a08']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
         */

        //driver.findElement(By.cssSelector("input[id='brand-lego']")).click();
        TimeUnit.SECONDS.sleep(3);
    }

    @Step("Aralık belirle")
    public void sendKeys() throws InterruptedException {

        WebElement int1 = driver.findElement(By.cssSelector("div:first-child[class='range-contain-row left']"));
        int1.click();

        //WebElement int2 = driver.findElement(By.cssSelector("div[class='range-contain-row left']"));
        //int2.click();

        int1.sendKeys("10");
        //int2.sendKeys("4000");

        TimeUnit.SECONDS.sleep(3);

    }

}



