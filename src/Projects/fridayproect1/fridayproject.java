package Projects;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class fridayproject1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("grup21@hotmail.com");
        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("grup21");
        WebElement signin = driver.findElement(By.name("commit"));
        signin.click();
        WebElement addresses = driver.findElement(By.cssSelector(" [data-test='addresses']"));
        addresses.click();
        Bekle(1);
        WebElement newadres = driver.findElement(By.cssSelector(" [data-test='create']"));
        newadres.click();
        Bekle(1);
        WebElement firstname = driver.findElement(By.id("address_first_name"));
        firstname.sendKeys("Fernando");
        Bekle(1);
        WebElement lastname = driver.findElement(By.id("address_last_name"));
        lastname.sendKeys("Torres");
        Bekle(1);
        WebElement adres1 = driver.findElement(By.id("address_street_address"));
        adres1.sendKeys("Anfield Rd");
        Bekle(1);
        WebElement adres2 = driver.findElement(By.id("address_secondary_address"));
        adres2.sendKeys("Anfield");
        Bekle(1);
        WebElement city = driver.findElement(By.id("address_city"));
        city.sendKeys("Liverpool");
        Bekle(1);
        WebElement state = driver.findElement(By.id("address_state"));
        Select select = new Select(state);
        select.selectByValue("FL");
        Bekle(1);
        WebElement zipcode = driver.findElement(By.id("address_zip_code"));
        zipcode.sendKeys("L4 0TH");
        Bekle(1);
        WebElement counrty = driver.findElement(By.id("address_country_us"));
        counrty.click();
        Bekle(1);
        WebElement birthday = driver.findElement(By.id("address_birthday"));
        birthday.sendKeys("20.03.1984");
        Bekle(1);
        WebElement age = driver.findElement(By.id("address_age"));
        age.sendKeys("36");
        Bekle(1);
        WebElement website = driver.findElement(By.id("address_website"));
        website.sendKeys("https://www.google.com/");
        Bekle(1);
        WebElement phone = driver.findElement(By.id("address_phone"));
        phone.sendKeys("8625747878");
        Bekle(1);
        WebElement climbing = driver.findElement(By.id("address_interest_climb"));
        climbing.click();
        Bekle(1);
        WebElement dancing = driver.findElement(By.id("address_interest_dance"));
        dancing.click();
        Bekle(1);
        WebElement note = driver.findElement(By.id("address_note"));
        note.sendKeys("Never Back Down");
        Bekle(1);
        WebElement submit = driver.findElement(By.name("commit"));
        submit.click();
        Bekle(1);
        WebElement firstnameverifiy = driver.findElement(By.cssSelector("[data-test='first_name']"));
        WebElement lastnameverifiy = driver.findElement(By.cssSelector("[data-test='last_name']"));

        Assert.assertTrue(firstnameverifiy.getText().contains("Fernando"));
        Assert.assertTrue(lastnameverifiy.getText().contains("Torres"));

        WebElement addresses2 = driver.findElement(By.cssSelector(" [data-test='addresses']"));
        addresses2.click();
        Bekle(1);
        WebElement edit = driver.findElement(By.cssSelector("[data-test='edit']"));
        edit.click();
        Bekle(1);

        WebElement editfirstname = driver.findElement(By.id("address_first_name"));
        editfirstname.clear();  //böyle bir kod var hoca söyledi bu kod orada yazanları siler
        editfirstname.sendKeys("Peter");
        Bekle(1);

        WebElement editlastname = driver.findElement(By.id("address_last_name"));
        editlastname.clear();//böyle bir kod var hoca söyledi bu kod orada yazanları siler
        editlastname.sendKeys("Crouch");
        Bekle(1);

        WebElement editsubmit = driver.findElement(By.name("commit"));
        editsubmit.click();

        WebElement editfirstnameverifiy = driver.findElement(By.cssSelector("[data-test='first_name']"));
        WebElement editlastnameverifiy = driver.findElement(By.cssSelector("[data-test='last_name']"));

        Assert.assertTrue(editfirstnameverifiy.getText().contains("Peter"));
        Assert.assertTrue(editlastnameverifiy.getText().contains("Crouch"));

        WebElement adres3 = driver.findElement(By.cssSelector("[data-test='addresses']"));
        adres3.click();
        Bekle(1);

        WebElement delete = driver.findElement(By.xpath("//*[text()='Destroy']"));
        delete.click();
        driver.switchTo().alert().accept();
        Bekle(1);

        WebElement deleteverify = driver.findElement(By.xpath("//*[text()='Address was successfully destroyed.']"));
        Assert.assertTrue(deleteverify.getText().contains("Address was successfully destroyed"));


        BekleKapat();


    }
}
