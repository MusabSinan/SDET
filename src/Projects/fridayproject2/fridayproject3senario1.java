package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class fridayproject3senario1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addtoCart = driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
        addtoCart.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));
        WebElement validate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Product-Quantity']>input")));

        System.out.println(validate.getText());
        Assert.assertEquals("1", validate.getAttribute("value"));


        BekleKapat();
    }
}
