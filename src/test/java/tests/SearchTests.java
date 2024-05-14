package tests;

import docs.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class SearchTests extends TestBase {

    @Test
    void successfulSearchTest() {

        openGooglePage()
                .typeInInputField("selenide");

        firstHeaderOnThePage.shouldHave(text(SELENIDE_URL));
    }
}
