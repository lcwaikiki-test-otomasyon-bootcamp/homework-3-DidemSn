package test.pages;

import common.DriverFactory;
import common.ElementHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

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

    public void checkElement(String str, boolean actualFlag){
        By by = By.xpath("//*[text()='" + str + "']");

        if( actualFlag )
        {
            elementHelper.checkElementPresence(by);
            WebElement element = webDriver.findElement(by);

            boolean flag = false;
            if( element != null )
                flag = true;

            Assert.assertEquals(actualFlag, flag);
        }
        else
        {
            List<WebElement> list = webDriver.findElements(by);

            boolean flag = false;
            if(list.size() > 0)
                flag = true;

            Assert.assertEquals(actualFlag, flag);
        }
    }

    public void checkTextBoxPlaceHolder(String name, String attribute)
    {
        WebElement element = webDriver.findElement(By.name(name));
        String variable = element.getAttribute("placeholder");
        Assert.assertEquals(attribute, variable);
    }

    public boolean checkNameElement(String name)
    {
        WebElement element = webDriver.findElement(By.name(name));

        boolean flag = false;
        if(element != null)
            flag = true;

        Assert.assertEquals(true, flag);
        return flag;
    }

    public void writeText(String elementName, String text)
    {
        boolean flag = checkNameElement(elementName);
        Assert.assertEquals(true, flag);

        By emailBy = By.name(elementName);
        elementHelper.checkElementPresence(emailBy);

        WebElement element = webDriver.findElement(emailBy);
        element.sendKeys(text);
    }


}
