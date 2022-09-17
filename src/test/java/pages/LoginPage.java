package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By USER_NAME = By.id("username");
    public String BASE_URL = "https://aventus5-dev-ed.my.salesforce.com/";
    private By PASSWOR = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void login(String username, String password) {
        driver.findElement(USER_NAME).sendKeys(username);
        driver.findElement(PASSWOR).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();


    }
}