package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    LoadProperty loadProperty = new LoadProperty();
    // string browserName = "edge";
    String browserName = loadProperty.getProperty("browser");
    public void openBrowser() {

        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/Browser/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/resources/Browser/msedgedriver.exe");
            // initialing the object
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/test/resources/Browser/geckodriver.exe");
        driver = new FirefoxDriver();

    }else {
            System.out.println();
        }
        //maximize the browse window
        driver.manage().window().maximize();
        // applying implicitly wait to driver object
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}

