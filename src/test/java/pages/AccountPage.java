package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wroppers.Input;

public class AccountPage extends BasePage {

    String BASE_URL = "https://aventus5-dev-ed.lightning.force.com/lightning/o/Account/list?filterName=Recent";
    private final By CREATE_BUTTON = By.xpath("//div[@title = 'New']");
    private final By SAVE_BUTTON = By.xpath("//button[text() = 'Save']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @Step("Заполнить поля формы создания аккаунта")
    public void createAccount(String firstName) {
        new Input("Account Name", driver).write("Account Name");
    }
    @Step("Нажать на кнопку Save")
    public void clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }
    @Step("Открыть стр. создние аккаунта")
    public void isOpen() {
        driver.get(BASE_URL);
    }
}