import org.openqa.selenium.chrome.ChromeDriver;

public class TestTest {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://madisonperfumery.com/?lang=ro");
driver.quit();
    }
}
