package example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class UiTest {

    @BeforeAll
    static void setUp() {
        Configuration.browser = "chrome";
        Configuration.remote = "http://selenium:4444/wd/hub";
        Configuration.timeout = 15000;
    }

    @Test
    void uiTest() {

        open("https://petstore.octoperf.com/actions/Catalog.action");
        $x("//input[@name='keyword']").setValue("dog");
        $x("//input[@type='submit']").click();
        $("#Catalog").shouldHave(text("Bulldog"));

    }
}

