package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QeIndexPage extends BasePage {

    private static String url = "QE-index.html";
    private static String emailAddress = faker.internet().emailAddress();
    private static String password = faker.internet().password();

    private static WebElement headerTitle = driver.findElement(By.className("navbar-brand"));
    private static WebElement emailAddressInput = driver.findElement(By.id("inputEmail"));
    private static WebElement passwordInput = driver.findElement(By.id("inputPassword"));
    private static WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign in']"));

    public static void goTo(){
        driver.manage().window().maximize();
        driver.get(url);
        wait.until(ExpectedConditions.urlContains(url));
        Assert.assertTrue(headerTitle.isDisplayed());
    }

    public static boolean checkPresenceOfElements(){
        return emailAddressInput.isDisplayed() && passwordInput.isDisplayed() && loginButton.isDisplayed();
    }

    public static void enterEmailAddressAndPassword(){
        emailAddressInput.clear();
        emailAddressInput.sendKeys(emailAddress);
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public static void clickOnLoginButton(){
        loginButton.click();
    }

}