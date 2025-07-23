package example;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class UiTest {

    @Test
    void uiTest() {
        open("https://petstore.octoperf.com/actions/Catalog.action");
        $x("//input[@name='keyword']").setValue("dog");
        $x("//input[@type='submit']").click();
        $("#Catalog").shouldHave(text("Bulldog"));

    }
}

