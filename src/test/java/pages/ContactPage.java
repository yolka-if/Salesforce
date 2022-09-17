package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wroppers.Dropdown;
import wroppers.Input;
import wroppers.Search;
import wroppers.TextArea;

public class ContactPage extends BasePage {

    private By saveButton = By.xpath("//button[text()='Save']");

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @Step("Заполнить поля формы создания контакта")
    public void createContact(String lastName, String phone, String firstName, String accountName, String salutation, String description
    ) {
        new Input("Last Name", driver).write(lastName);
        new Input("Phone", driver).write(phone);
        new Input("First Name", driver).write(firstName);
        new Dropdown("Salutation", driver).select(salutation);
        new Search("Account Name", driver).search(accountName);
        new TextArea("Description", driver).writeTextArea(description);
    }
    @Step("Нажать на кнопку Save")
     public void clickSaveButton(){
         driver.findElement(saveButton).click();
     }
}
