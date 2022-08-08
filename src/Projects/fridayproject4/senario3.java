package Projects.fridayproject4;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class senario3 extends BaseStaticDriver {
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

        WebElement giftcard=driver.findElement(By.linkText("$25 Virtual Gift Card"));
        giftcard.click();

        WebElement recipientName=driver.findElement(By.id("giftcard_2_RecipientName"));
        recipientName.sendKeys("grup");

        WebElement recipientEmail=driver.findElement(By.id("giftcard_2_RecipientEmail"));
        recipientEmail.sendKeys("grup21@hotmail.com");

        WebElement addtocard=driver.findElement(By.id("add-to-cart-button-2"));
        addtocard.click();

        WebElement shoppingcart=driver.findElement(By.linkText("Shopping cart"));
        shoppingcart.click();

        WebElement termsofservice=driver.findElement(By.id("termsofservice"));
        termsofservice.click();

        WebElement checkout=driver.findElement(By.id("checkout"));
        checkout.click();

        WebElement addresselect=driver.findElement(By.id("billing-address-select"));
        Select adreselect=new Select(addresselect);
        adreselect.selectByVisibleText("New Address");


        WebElement country=driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select ddMenu=new Select(country);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("BillingNewAddress_CountryId")));
        ddMenu.selectByIndex(2);




        WebElement State=driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select state=new Select(State);
       // wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='BillingNewAddress_StateProvinceId']>option"), state.getOptions().size()));
        //wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("id='BillingNewAddress_StateProvinceId']>option"))));
        state.selectByVisibleText("Alberta");

        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("istanbul");

        WebElement address=driver.findElement(By.id("BillingNewAddress_Address1"));
        address.sendKeys("kadıköy");

        WebElement postalcode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        postalcode.sendKeys("00000");

        WebElement phonenumber=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phonenumber.sendKeys("2121212121");

        WebElement cntnbtn=driver.findElement(By.cssSelector("[value='Continue']"));
        cntnbtn.click();

        WebElement cnbtnbtn2=driver.findElement(By.xpath("(//*[@value='Continue'])[2]"));
        cnbtnbtn2.click();

        WebElement cnbtnbtn3=driver.findElement(By.xpath("(//*[@value='Continue'])[3]"));
        cnbtnbtn3.click();

        WebElement confirm=driver.findElement(By.cssSelector("[value='Confirm']"));
        confirm.click();

        WebElement validate=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));

        Assert.assertEquals(validate.getText(),"Your order has been successfully processed!");

        BekleKapat();
    }
}
