package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class fridayproject3senario4 extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addtoCart = driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
        addtoCart.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Product-Quantity']>input")));

        WebElement PayDebit = driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
        PayDebit.click();

        WebElement mail = driver.findElement(By.cssSelector("[placeholder='Email']"));
        mail.sendKeys("grup21@hotmail.com");

        WebElement confirmail = driver.findElement(By.cssSelector("[placeholder='Confirm Email']"));
        confirmail.sendKeys("grup21@hotmail.com");

        WebElement nameoncard = driver.findElement(By.xpath("//input[@placeholder='Name On Card']"));
        nameoncard.sendKeys("grup21");

        WebElement phone = driver.findElement(By.cssSelector("[autocomplete='phone']"));
        phone.sendKeys("12345");

        WebElement company = driver.findElement(By.cssSelector("[autocomplete='company']"));
        company.sendKeys("grup21");

        driver.switchTo().frame(2);

        WebElement cardno = driver.findElement(By.name("cardnumber"));
        cardno.sendKeys("1111 1111 1111 1111");
        driver.switchTo().parentFrame();

        WebElement validate = driver.findElement(By.xpath("//*[text()='Kart numaranız geçersiz.']"));
        Assert.assertTrue(validate.isDisplayed());

        driver.switchTo().defaultContent();

        BekleKapat();
    }
}
