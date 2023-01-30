package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import java.time.Duration;

public class BasePage {

    public static Faker faker = new Faker();
    public static ChromeDriver driver = new ChromeDriver();
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    private static String url;
}
