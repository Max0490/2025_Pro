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
 //       Configuration.remote = "http://selenium:4444/wd/hub";
        Configuration.headless = false;
        Configuration.timeout = 15000;
    }

    @Test
    void authTest() {

        open("https://www.demoblaze.com/");
        $x("//a[@id='login2']").click();
        $x("//input[@id='loginusername']").setValue("123martin");
        $x("//input[@id='loginpassword']").setValue("qwerty123");
        $x("//button[@onclick='logIn()']").click();
        $x("//a[@id='nameofuser']").shouldHave(text("Welcome 123martin"));
    }

    @Test
    void addToCardTest() {

        open("https://www.demoblaze.com/");

        $x("//a[text()='Laptops']").click();
        $x("//a[text()='Sony vaio i5']").click();
        $x("//a[text()='Add to cart']").click();
    }


}

