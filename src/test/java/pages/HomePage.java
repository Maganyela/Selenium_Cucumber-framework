package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {



    // Declaration of Locators and Driver
     public static WebDriver driver;

    public static String hamburger_Menu = "//div[@id='menuToggle']/input[1]";

    public static String sign_In = "//li[.='Sign In Portal']";


    // Action Function/Method
    public static void click_hamburger_Menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_Menu)).click();
    }

    public static void click_sign_In() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_In)).click();
    }
}
