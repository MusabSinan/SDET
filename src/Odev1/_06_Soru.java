package Odev1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(2);

        WebElement element= driver.findElement(By.id("fakealerttest"));
        element.click();                                                  //5.SORU
        Bekle(2);

        WebElement element2=driver.findElement(By.id("modaldialog"));
        element2.click();
        Bekle(2);

        WebElement element1= driver.findElement(By.id("dialog-ok"));
        element1.click();
        BekleKapat();
    }
}
