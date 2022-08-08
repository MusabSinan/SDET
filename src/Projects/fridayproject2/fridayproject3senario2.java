package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class fridayproject3senario2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addtoCart=driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
        addtoCart.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Product-Quantity']>input")));
        WebElement apply=driver.findElement(By.xpath("//*[text()='Add Promo Code']"));
        apply.click();

        WebElement promocode=driver.findElement(By.cssSelector("[class='Promo-Code-Value']"));
        promocode.sendKeys("123456789");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Apply']")));

        WebElement apply2=driver.findElement(By.xpath("//*[text()='Apply']"));
        apply2.click();

        WebElement valide=driver.findElement(By.xpath("//*[text()='Invalid promo code']"));

        Assert.assertTrue(valide.isDisplayed());
        driver.switchTo().defaultContent();


        BekleKapat();
    }
}
