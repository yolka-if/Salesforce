package wroppers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String lable;

    public TextArea(String lable, WebDriver driver) {
        this.lable = lable;
        this.driver = driver;
    }

    public void writeTextArea(String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//textarea", lable))).sendKeys(text);

    }
}