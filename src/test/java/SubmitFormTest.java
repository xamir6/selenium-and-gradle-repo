import com.codeborne.selenide.Configuration;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SubmitFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

//    @Test
//    void submitFormTest() {
//        open("https://demoqa.com/automation-practice-form");
//
//        $("#firstName").setValue("Pashoi");
//        $("#userEmail").setValue("Chochoev@mail.ru");
//        $("#currentAddress").setValue("Some text");
//        $("#permanentAddress").setValue("Что-то написал");
//
//        $("#submit").click();
//
//        $("#output").shouldHave(text("Pashoi"), text("Chochoev@mail.ru"),
//                text("Some text"), text("Что-то написал"));
//    }
//    @Test
//    void studentRegistrationFormTest() {
//
//        open("https://demoqa.com/automation-practice-form");

}


