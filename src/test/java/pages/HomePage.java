package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    // Declaration of Locators

    public static String hamburger_Menu = "//div[@id='menuToggle']/input[1]";

    public static String sign_In = "//li[.='Sign In Portal']";


    // Action Function/Method
    public static void click_hamburger_Menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_Menu)).click();
    }

    public static void click_sign_In() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_In)).click();
    }
}
