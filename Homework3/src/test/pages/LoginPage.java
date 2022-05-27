package test.pages;

import common.DriverFactory;
import common.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    WebDriver webDriver = DriverFactory.getDriver();
    ElementHelper elementHelper;
    public LoginPage(){
        elementHelper = new ElementHelper(webDriver);
    }
    public void goToLogin()
    {
        webDriver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
    }

    public void clickRadioButton(String key)
    {
        webDriver.findElement(By.xpath("//*[text()='" + key + "']")).click();
    }

    public void clickByClass(String str)
    {
        webDriver.findElement(By.cssSelector(str)).click();
    }

    public void checkElement(String str){
        WebElement element = webDriver.findElement(By.xpath("//*[text()='" + str + "']"));

        boolean flag = false;
        if( element != null )
            flag = true;

        Assert.assertEquals(true, flag);
    }

    public void checkTextBoxPlaceHolder(String name, String attribute)
    {
        WebElement element = webDriver.findElement(By.name(name));
        String variable = element.getAttribute("placeholder");
        Assert.assertEquals(attribute, variable);
    }

    public void checkNameElement(String name)
    {
        WebElement element = webDriver.findElement(By.name(name));

        boolean flag = false;
        if(element != null)
            flag = true;

        Assert.assertEquals(true, flag);
    }

}
