package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {

    @Test(description = "Создание аккаунта")
    public void createAccount() {
        loginPage.open();
        loginPage.login("375293572290@mail.ru", "aq12ws345");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title = 'Setup']")));
        driver.get("https://aventus5-dev-ed.lightning.force.com/lightning/o/Account/new?count=1&nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&uid=166335615774624890");
        accountPage.createAccount("Test");
        accountPage.clickSaveButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")));
        assertTrue(driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).isDisplayed());
    }
}
