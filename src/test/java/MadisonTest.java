import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class MadisonTest {

    public static void main (String [] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://madisonperfumery.com/?lang=ro");
//driver.quit();
    }
}
