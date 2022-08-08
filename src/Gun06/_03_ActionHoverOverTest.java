package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_Soru extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.etsy.com/");

        Bekle(2);


        WebElement element= driver.findElement(By.cssSelector("[id='catnav-primary-link-10855']"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar.moveToElement(element).build();

        aksiyon.perform();

        Bekle(1);


        WebElement element1= driver.findElement(By.id("side-nav-category-link-10873"));

        aksiyon=aksiyonlar.moveToElement(element1).build();

        aksiyon.perform();

        Bekle(2);
        WebElement element2= driver.findElement(By.id("catnav-l3-10881"));
        element2.click();


        Assert.assertTrue(driver.getCurrentUrl().contains("Bib"));

        BekleKapat();


    }
}
