package wroppers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String lable;

    public Input(String lable, WebDriver driver) {
        this.lable = lable;
        this.driver = driver;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//input", lable))).sendKeys(text);

    }


    //поиск - селекст и сёртч
    //текст эрия , не особо отличается от инпута

}
