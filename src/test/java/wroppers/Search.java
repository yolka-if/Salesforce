package wroppers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Search {
    WebDriver driver;
    String lable;

    public Search(String lable, WebDriver driver) {
        this.lable = lable;
        this.driver = driver;
    }

    public void search(String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//input", lable)))
                .sendKeys(text);
//        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//li[@class='slds-listbox__item']", lable)))
//                .click();

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath(String.format("//strong [text() = '%s']", text)));
        executor.executeScript("arguments[0].click();", element);
    }
}
