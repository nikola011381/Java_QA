

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/chromedriver_win32/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

    // Otvoriti Google.com stranicu
    driver.get("https://www.google.com");

    // Zatvaranje driver objekta
    driver.quit();
}

}