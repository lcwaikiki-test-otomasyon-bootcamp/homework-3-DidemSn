package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver webDriver;

    public static WebDriver getDriver()
    {
        if(webDriver == null)
        {
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications","--disable-blink-features=AutomationControlled");
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver(options);
        }
        return webDriver;
    }
}
