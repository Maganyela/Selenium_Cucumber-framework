package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    public static WebDriver driver;

    public static String username_text = "usr";
    public static String password_text = "pwd";

    public static String login_btn = ".btn-info";

    public static void sendKeys_Username() {
        driver.findElement(By.id(username_text)).sendKeys("Scott.gale@gmail.com");
    }

    public static void sendkeys_Password() {
        driver.findElement(By.id(password_text)).sendKeys("P@sword!");
    }

    public static void click_Login_button() {
        driver.findElement(By.cssSelector(login_btn)).click();
    }
}
