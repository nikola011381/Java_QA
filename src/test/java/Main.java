

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/chromedriver_win32/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
    // Otvoriti Google.com stranicu
    driver.get("http://automationpractice.pl/index.php");
      //  driver.findElement(By.cssSelector("input[name='Phrase']")).sendKeys("test 0");
      //  driver.findElement(By.cssSelector("input[name='Phrase']")).sendKeys(Keys.ENTER);
      //  driver.findElement(By.cssSelector("input[name='SubmitType']")).click();
      //  Thread.sleep(3000);
    // Zatvaranje driver objekta
   // driver.quit();
       // driver.close();
}

}