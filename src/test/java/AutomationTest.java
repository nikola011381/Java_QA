import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Otvoriti Google.com stranicu
        driver.get("http://automationpractice.pl/index.php");

        WebElement womenLink = driver.findElement(By.cssSelector("a.sf-with-ul[title='Women']"));

// Create an instance of Actions class
        Actions actions = new Actions(driver);

// Perform the hover over action on the Women link
        actions.moveToElement(womenLink).build().perform();


    }
}
