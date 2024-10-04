package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {

    public static String username_text = "usr";

    public static String password_text = "pwd";

    public static String login_btn = "//input[@class='btn btn-info']";

    public static void sendKeys_Username() {
        driver.findElement(By.id(username_text)).sendKeys("vitwend");
    }

    public static void sendKeys_Password() {
        driver.findElement(By.id(password_text)).sendKeys("Vitwend@09");
    }

    public static void click_Login_button() {
        driver.findElement(By.xpath(login_btn)).click();
    }
}
