import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;
import utility.Myfunction;

import java.time.Duration;

public class testingproject2 extends BaseDriver {

    @Test
    public void senaryo1(){
    driver.get("http://demowebshop.tricentis.com/");
        WebElement register= driver.findElement(By.linkText("Register"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(register).click().build();
       // Myfunction.Bekle(2);
        aksiyon.perform();

        WebElement genderButton= driver.findElement(By.id("gender-male"));
        aksiyon=aksiyonlar.moveToElement(genderButton).click().build();
        aksiyon.perform();

        WebElement firstName= driver.findElement(By.id("FirstName"));
        aksiyon=aksiyonlar.moveToElement(firstName).click().sendKeys("Ahmet").build();
        aksiyon.perform();

        WebElement lastName= driver.findElement(By.id("LastName"));
        aksiyon=aksiyonlar.moveToElement(lastName).click().sendKeys("seker").build();
        aksiyon.perform();

       // testing"+((int)(Math.random()*10000))+"@testing.com
//        WebElement email= driver.findElement(By.id("Email"));
//        aksiyon=aksiyonlar.moveToElement(email).click().sendKeys("abc454356789@yahoo.com").build();
//        aksiyon.perform();

        WebElement mail= driver.findElement(By.id("Email"));
        aksiyon = aksiyonlar.moveToElement(mail).click().sendKeys("testing"+((int)(Math.random()*10000))+"@testing.com").build();
        aksiyon.perform();

        WebElement password= driver.findElement(By.id("Password"));
        aksiyon=aksiyonlar.moveToElement(password).click().sendKeys("1aswe335Ayx").build();
        aksiyon.perform();

        WebElement confirmPassword= driver.findElement(By.id("ConfirmPassword"));
        aksiyon=aksiyonlar.moveToElement(confirmPassword).click().sendKeys("1aswe335Ayx").build();
        aksiyon.perform();

        WebElement registerButton= driver.findElement(By.id("register-button"));
        aksiyon=aksiyonlar.moveToElement(registerButton).click().build();
        aksiyon.perform();


        WebElement text= driver.findElement(By.xpath("//div[@class='result']"));
        System.out.println("text.getText() = " + text.getText());
        Assert.assertEquals("Your registration completed",text.getText());

        WebElement logout = driver.findElement(By.linkText("Log out"));
        aksiyon=aksiyonlar.moveToElement(logout).click().build();
        aksiyon.perform();

    }
    @Test
    public void senaryo2(){

        driver.get("http://demowebshop.tricentis.com/");
        WebElement register= driver.findElement(By.linkText("Register"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(register).click().build();
        // Myfunction.Bekle(2);
        aksiyon.perform();

        WebElement genderButton= driver.findElement(By.id("gender-male"));
        aksiyon=aksiyonlar.moveToElement(genderButton).click().build();
        aksiyon.perform();

        WebElement firstName= driver.findElement(By.id("FirstName"));
        aksiyon=aksiyonlar.moveToElement(firstName).click().sendKeys("Ahmet").build();
        aksiyon.perform();

        WebElement lastName= driver.findElement(By.id("LastName"));
        aksiyon=aksiyonlar.moveToElement(lastName).click().sendKeys("seker").build();
        aksiyon.perform();

        // testing"+((int)(Math.random()*10000))+"@testing.com
        WebElement email= driver.findElement(By.id("Email"));
        aksiyon=aksiyonlar.moveToElement(email).click().sendKeys("abc45435678@yahoo.com").build();
        aksiyon.perform();

        WebElement password= driver.findElement(By.id("Password"));
        aksiyon=aksiyonlar.moveToElement(password).click().sendKeys("1aswe335Ayx").build();
        aksiyon.perform();

        WebElement confirmPassword= driver.findElement(By.id("ConfirmPassword"));
        aksiyon=aksiyonlar.moveToElement(confirmPassword).click().sendKeys("1aswe335Ayx").build();
        aksiyon.perform();

        WebElement registerButton= driver.findElement(By.id("register-button"));
        aksiyon=aksiyonlar.moveToElement(registerButton).click().build();
        aksiyon.perform();

        WebElement errorMessage= driver.findElement(By.xpath("//li[text()='The specified email already exists']"));
        System.out.println("errorMessage.getText() = " + errorMessage.getText());

        Assert.assertEquals("The specified email already exists",errorMessage.getText());


    }
    @Test
    public void senaryo3(){

        driver.get("http://demowebshop.tricentis.com/");
        WebElement login= driver.findElement(By.linkText("Log in"));
        Actions aksiyonlar= new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(login).click().build();
        aksiyon.perform();

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        aksiyon=aksiyonlar.moveToElement(email).click().sendKeys("abc45435678@yahoo.com").build();
        aksiyon.perform();

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        aksiyon=aksiyonlar.moveToElement(password).click().sendKeys("1aswe335Ayx").build();
        aksiyon.perform();

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        aksiyon=aksiyonlar.moveToElement(loginButton).click().build();
        aksiyon.perform();

        WebElement logOut= driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logOut.isDisplayed());

        WebElement logout = driver.findElement(By.linkText("Log out"));
        aksiyon=aksiyonlar.moveToElement(logout).click().build();
        aksiyon.perform();



    }

    @Test
    public void senaryo4(){
        driver.get("http://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.linkText("Log in"));
        Actions aksiyonlar= new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(login).click().build();
        aksiyon.perform();

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        aksiyon=aksiyonlar.moveToElement(email).click().sendKeys("rtureitd@yahoo.com").build();
        aksiyon.perform();

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        aksiyon=aksiyonlar.moveToElement(password).click().sendKeys("32849idewu--=1-").build();
        aksiyon.perform();

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        aksiyon=aksiyonlar.moveToElement(loginButton).click().build();
        aksiyon.perform();

        WebElement errorMessage= driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        System.out.println("errorMessage.getText() = " + errorMessage.getText());
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.",errorMessage.getText());

    }
@Test
    public void senaryo5(){
    driver.get("http://demowebshop.tricentis.com/");
    WebElement login= driver.findElement(By.linkText("Log in"));
    Actions aksiyonlar= new Actions(driver);
    Action aksiyon= aksiyonlar.moveToElement(login).click().build();
    aksiyon.perform();

    WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
    aksiyon=aksiyonlar.moveToElement(email).click().sendKeys("abc45435678@yahoo.com").build();
    aksiyon.perform();

    WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
    aksiyon=aksiyonlar.moveToElement(password).click().sendKeys("1aswe335Ayx").build();
    aksiyon.perform();

    WebElement loginButton= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
    aksiyon=aksiyonlar.moveToElement(loginButton).click().build();
    aksiyon.perform();

    WebElement computersTab= driver.findElement(By.linkText("COMPUTERS"));
    aksiyon=aksiyonlar.moveToElement(computersTab).build();
    aksiyon.perform();

    WebElement notebooks= driver.findElement(By.linkText("Notebooks"));
    aksiyon=aksiyonlar.moveToElement(notebooks).click().build();
    aksiyon.perform();

    WebElement inch14= driver.findElement(By.linkText("14.1-inch Laptop"));
    aksiyon=aksiyonlar.moveToElement(inch14).click().build();
    aksiyon.perform();

    WebElement addToCard= driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
    aksiyon=aksiyonlar.moveToElement(addToCard).click().build();
    aksiyon.perform();

    WebElement confirmationMessage= driver.findElement(By.linkText("shopping cart"));
    System.out.println("confirmationMessage.getText() = " + confirmationMessage.getText());

    Assert.assertEquals("shopping cart",confirmationMessage.getText());

    WebElement shoppingCardButton= driver.findElement(By.xpath("//span[text()='Shopping cart']"));
    aksiyon=aksiyonlar.moveToElement(shoppingCardButton).click().build();
    aksiyon.perform();

    WebElement productConfirmation= driver.findElement(By.xpath("//a[@class='product-name']"));
    Assert.assertTrue(productConfirmation.isDisplayed());

    WebElement agreeToTermsofService= driver.findElement(By.xpath("//input[@id='termsofservice']"));
    aksiyon=aksiyonlar.moveToElement(agreeToTermsofService).click().build();
    aksiyon.perform();

    WebElement checkout= driver.findElement(By.xpath("//button[@id='checkout']"));
    aksiyon=aksiyonlar.moveToElement(checkout).click().build();
    aksiyon.perform();

    WebElement newAddres= driver.findElement(By.xpath("//select[@id='billing-address-select']"));
    Select saddress= new Select(newAddres);
    saddress.selectByVisibleText("New Address");
    aksiyon=aksiyonlar.moveToElement(newAddres).click().build();
    aksiyon.perform();
    //select[@id='billing-address-select']

    WebElement dropDownMenu= driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
    Select menu= new Select(dropDownMenu);
    menu.selectByVisibleText("Switzerland");

    WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
    aksiyon=aksiyonlar.moveToElement(city).click().sendKeys("Erzurum").build();
    aksiyon.perform();

    WebElement adress1= driver.findElement(By.id("BillingNewAddress_Address1"));
    aksiyon = aksiyonlar.moveToElement(adress1).click().sendKeys("Bakirköy").build();
    aksiyon.perform();

    WebElement zipCode = driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
    aksiyon=aksiyonlar.moveToElement(zipCode).click().sendKeys("12345").build();
    aksiyon.perform();

    WebElement phoneNum = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    aksiyon=aksiyonlar.moveToElement(phoneNum).click().sendKeys("02164581379").build();
    aksiyon.perform();

    WebElement continue1= driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
    aksiyon=aksiyonlar.moveToElement(continue1).click().build();
    aksiyon.perform();


    WebElement continue2= driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
    continue2.click();


    WebElement continue3= driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
    continue3.click();


    WebElement continue4= driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
    continue4.click();


    WebElement continue5= driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
    continue5.click();


    WebElement confirmOrder= driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
    confirmOrder.click();

    WebElement orderCompleted= driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
    System.out.println("orderCompleted.getText() = " + orderCompleted.getText());

    Assert.assertEquals("Your order has been successfully processed!",orderCompleted.getText());

    BekleKapat();


    //input[@onclick='ShippingMethod.save()']


//    WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(30));
//    wait2.until(ExpectedConditions.alertIsPresent());
//    driver.switchTo().alert().accept();

//    WebElement continueInformation= driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
//    aksiyon=aksiyonlar.moveToElement(continueInformation).click().build();
//    aksiyon.perform();
//
//    WebElement continueAddress= driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
//    aksiyon=aksiyonlar.moveToElement(continueAddress).click().build();
//    aksiyon.perform();

//    WebElement countryMenu = driver.findElement(By.name("BillingNewAddress.CountryId"));
//    Select countrySelectMenu = new Select(countryMenu);
////    WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(30));
////    wait1.until(ExpectedConditions.visibilityOfElementLocated())
//    countrySelectMenu.se
//
//
//    WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
//    aksiyon=aksiyonlar.moveToElement(city).click().sendKeys("Erzurum").build();
//    aksiyon.perform();
//
//    WebElement adress1= driver.findElement(By.id("BillingNewAddress_Address1"));
//    aksiyon = aksiyonlar.moveToElement(adress1).click().sendKeys("Bakirköy").build();
//    aksiyon.perform();
//
//    WebElement zipCode = driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
//    aksiyon=aksiyonlar.moveToElement(zipCode).click().sendKeys("12345").build();
//    aksiyon.perform();
//
//    WebElement phoneNum = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
//    aksiyon=aksiyonlar.moveToElement(phoneNum).click().sendKeys("02164581379").build();
//    aksiyon.perform();

//    WebElement dropDownMenu= driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
//    Select menu= new Select(dropDownMenu);
//    menu.selectByValue("74");
//
//    WebElement cityName= driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
//    aksiyon=aksiyonlar.moveToElement(cityName).click().sendKeys("Bern").build();
//    aksiyon.perform();
//
//    WebElement address1= driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
//    aksiyon=aksiyonlar.moveToElement(address1).click().sendKeys("avenue 34").build();
//    aksiyon.perform();
//
//    WebElement postalCode= driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"));
//    aksiyon=aksiyonlar.moveToElement(postalCode).click().sendKeys("4656").build();
//    aksiyon.perform();
//
//    WebElement phoneNumber= driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
//    aksiyon=aksiyonlar.moveToElement(phoneNumber).click().sendKeys("374832743298423").build();
//    aksiyon.perform();
//
//    WebElement continueButton= driver.findElement(By.xpath("(//input[@title='Continue'])[1]"));
//    aksiyon=aksiyonlar.moveToElement(continueButton).click().build();
//    aksiyon.perform();
//
//    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
//    wait.until(ExpectedConditions.alertIsPresent());
//    driver.switchTo().alert().dismiss();
//











    //span[text()='Shopping cart']


//
//    WebElement logOut= driver.findElement(By.linkText("Log out"));
//    Assert.assertTrue(logOut.isDisplayed());
//
//    WebElement logout = driver.findElement(By.linkText("Log out"));
//    aksiyon=aksiyonlar.moveToElement(logout).click().build();
//    aksiyon.perform();
}
}
