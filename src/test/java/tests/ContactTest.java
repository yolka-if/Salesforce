package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.ContactPage;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {

    @Test(description = "Создание контакта")
    public void createContactTest() {
        loginPage.open();
        loginPage.login("375293572290@mail.ru", "aq12ws345");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title = 'Setup']")));
        driver.get("https://aventus5-dev-ed.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        driver.findElement(By.xpath("//div[text() = 'New']")).click();
        driver.get("https://aventus5-dev-ed.lightning.force.com/lightning/o/Contact/new?count=1&nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&uid=166308491345494018");
        new ContactPage(driver).createContact("Test", "375236532002", "Ted", "12", "Mr.", "text123");
        contactPage.clickSaveButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")));
        assertTrue(driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).isDisplayed());
    }

    //акканут криэйт тест
}
//привести в норм вид с фишками ндж( листнерер дискрипшен, запуск в параллели
//создать логин пэйдж и контакт пэйдж