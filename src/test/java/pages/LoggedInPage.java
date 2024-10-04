package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {


    public static String product_formalShoe = "//h3[.='Formal Shoes']";

    public static String product_sportShoe = "//h3[.='Sports']";

    public static String product_sneakerShoe = "//h3[.='Sneakers']";


    public static void visible_productCategory_formalShoe() {

        String actualProductCategory = driver.findElement(By.xpath(product_formalShoe)).getText();
        assertEquals(actualProductCategory, "Formal Shoes");

    }

    public static void visible_productCategory_sportShoe() {

        String actualProductCategory_ss = driver.findElement(By.xpath(product_sportShoe)).getText();
        assertEquals(actualProductCategory_ss, "Sports");

    }

    public static void visible_productCategory_sneakerShoe() {

        String actualProductCategory_sf = driver.findElement(By.xpath(product_sneakerShoe)).getText();
        assertEquals(actualProductCategory_sf, "Sneakers");
    }
}
