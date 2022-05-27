package test.pages;

import common.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

     WebDriver webDriver = DriverFactory.getDriver();

    public void goToHome()
    {
        webDriver.get("https://www.lcwaikiki.com/tr-TR/TR");
    }

    public void clickByString(String string)
    {
        webDriver.findElement(By.xpath("//*[text()='" + string + "']")).click();
    }

    public void isInLoginPage()
    {
        By loginLabel = By.xpath("//*[text()='GİRİŞ YAP']");
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(loginLabel));

        WebElement test = webDriver.findElement(loginLabel);

        boolean flag = false;
        if (test != null)
            flag = true;

        Assert.assertEquals(true,flag);
    }
}
