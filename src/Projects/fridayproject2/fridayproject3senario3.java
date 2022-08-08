package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class fridayproject3senario3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addtoCart=driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
        addtoCart.click();



        driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Product-Quantity']>input")));

        WebElement PayDebit=driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
        PayDebit.click();

        WebElement Pay=driver.findElement(By.xpath("//*[text()='Pay 0.50 USD']"));
        Pay.click();

        WebElement validate=driver.findElement(By.cssSelector("[id='SnackBar']>ion-icon+span"));
        Assert.assertTrue(validate.getText().contains("Invalid Email"));

        driver.switchTo().defaultContent();

        BekleKapat();
    }
}
