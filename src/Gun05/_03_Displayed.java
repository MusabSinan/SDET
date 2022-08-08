package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Örnek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.facebook.com/");

        WebElement element= driver.findElement(By.cssSelector("[id^='u_0_0_']"));



        element.click();


    }
}
