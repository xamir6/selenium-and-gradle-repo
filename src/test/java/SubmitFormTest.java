import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SubmitFormTest {

    @Test
    void submitFormTest() throws InterruptedException {
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Pashoi");
        $("#userEmail").setValue("Chochoev@mail.ru");
        $("#currentAddress").setValue("Some text");
        $("#permanentAddress").setValue("русские быкву ОНИ ЧОЕНЬ ХОроши ааааах");

        $("#submit").click();
        Thread.sleep(5000);

        $("#output").shouldHave(text("Pashoi"), text("Chochoev@mail.ru"),
                text("Some text"), text("русские быкву ОНИ ЧОЕНЬ ХОроши ааааах"));
    }
}
