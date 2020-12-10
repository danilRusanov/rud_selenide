package by.test.selenide.rud.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class ElementTextPage {

    public void refresh() {

        open("https://demoqa.com/elements");
        $(By.xpath("//div[contains(@class, 'element-list collapse show')]//ul//li[@id='item-0']")).click();
    }

    public void inputFullName(String fullName) {

        $(By.xpath("//input[contains(@id, 'userName')]")).sendKeys(fullName);
    }


    public void submitButton() {
        $(By.xpath("//button[contains(@id, 'submit')]")).click();
    }

    public void resultForm(String value) {

        $x("//div[@id='output']//p[@id='name']").isDisplayed();

        Assert.assertTrue("Is it True? ",
                $x("//div[@id='output']//p[@id='name']").getText().contains(value));
    }

}
