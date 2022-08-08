package Projects;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class senario1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement loginbtn= driver.findElement(By.linkText("Log in"));
        loginbtn.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("grup21@hotmail.com");

        WebElement Password=driver.findElement(By.id("Password"));
        Password.sendKeys("grup21");

        WebElement loginbtn2=driver.findElement(By.cssSelector("[value='Log in']"));
        loginbtn2.click();

        WebElement validatelogin= driver.findElement(By.className("account"));
        Assert.assertTrue(validatelogin.getText().contains("grup21"));

        BekleKapat();
    }
}
