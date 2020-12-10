package by.test.selenide.rud.tests;

import by.test.selenide.rud.pages.ElementTextPage;
import org.junit.Test;


public class ElementTextTest {

    private ElementTextPage elementText = new ElementTextPage();
    private String fullName = "DanilRu";

    @Test
    public void submitBtnTest() {
        elementText.refresh();
        elementText.inputFullName(fullName);
        elementText.submitButton();
        elementText.resultForm(fullName);
    }

}
