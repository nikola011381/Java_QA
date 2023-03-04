import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Auto {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.pl/index.php");

        Thread.sleep(3000);

        driver.findElement(By.id("contact-link")).click();
        Select subjectHeadingSelect = new Select(driver.findElement(By.id("id_contact")));
        subjectHeadingSelect.selectByVisibleText("Webmaster");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("qwe@qwe.com");
        driver.findElement(By.id("id_order")).sendKeys("79846541");
        driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\Radovic\\IdeaProjects\\Java_QA\\src\\test\\java\\Test.txt");

        driver.findElement(By.tagName("textarea")).sendKeys("Test Message");

        driver.findElement(By.id("submitMessage")).click();

        Assert.assertEquals(
                driver.findElement(By.cssSelector(".alert.alert-success")).getText(),
                "Your message has been successfully sent to our team.");

    }
}
