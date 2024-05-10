package docs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    protected final String SELENIDE_URL = "https://ru.selenide.org";
    protected SelenideElement firstHeaderOnThePage = $(".ojE3Fb");

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    public TestBase openGooglePage() {
        open("https://www.google.com/");

        return this;
    }

    public TestBase typeInInputField(String words) {
        $("[name=q]").setValue(words).pressEnter();

        return this;
    }
}
