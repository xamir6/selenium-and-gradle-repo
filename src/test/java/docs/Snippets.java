package docs;

import com.codeborne.selenide.AuthenticationType;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Snippets {

    void cssXpathExamples() {

        // <input type = "email" class="inputtext" loggin_form_input_box" name = "email" id = "email" data-testid = "email">

        $("[data-testid=email]");
        $(by("data-testid", "email"));


        // <input type = "email" class="inputtext" loggin_form_input_box" name = "email" id = "email">

        $("[id=email]");
        $("#email");
        $(byId("email"));
        $(By.id("email"));
        $("[id='email']");
        $("[id=\"email\"]");
        $(by("id", "email"));
        $x("//*[@id='email']");
        $(byXpath("//*[@id='email']"));

        $("input[id=email]");
        $("input#email");


        // <input type = "email" class="inputtext loggin_form_input_box" name = "email">

        $("[name=email]");
        $(byName("email"));


        // <input type = "email" class="inputtext loggin_form_input_box">

        $(".loggin_form_input_box");
        $(byClassName("loggin_form_input_box"));
        $(".inputtext.loggin_form_input_box");
        $x("//*[@class='inputtext loggin_form_input_box']");


        // <div class="inputtext">
        //      <input type = "email" class="loggin_form_input_box">
        // </div>

        $(".inputtext. loggin_form_input_box");
        $(".inputtext").$("loggin_form_input_box");

        // <div>Something is written here</div>
        $(byText("Something is written here"));
        $(withText("hing is writte"));

    }

    void browserCommandExamples() {

        open("https://www.google.ru/");
        open("/customer/orders");
//          open("/", AuthenticationType.BASIC, "user", "login");

        back();
        refresh();

        clearBrowserCookies();
        clearBrowserLocalStorage();

        confirm(); // OK alert dialog
        dismiss(); // close alert dialog

        closeWindow(); // close active tab
        closeWebDriver(); // close browser

        switchTo().frame("here using name of id"); // frame of iframe switching
        switchTo().defaultContent(); // back to main page from frame of iframe

        switchTo().window("name of the window");
    }

    void selectorsExamples() {

        $("div").click(); // will find first div in DOM
        element("div").click();

        $("div", 2).click(); // will find third tag in DOM

        $x("//h1/div").click();
        $(byXpath("//h1/div")).click();

        $("").parent();
        $("").sibling(1);
        $("").preceding(1);
    }

    void actoinExamples() {

        $("").click();
        $("").doubleClick();
        $("").contextClick(); // right mouse click

        $("").hover();

        $("").setValue("some text"); // clear and enter text
        $("").append("more text"); // add text without clear
        $("").clear();
        $("").setValue(""); // same as .clear()

        $("").sendKeys("c"); // hotkey "c" on element
        actions().sendKeys("c").perform(); //hotkey "c" on whole application
        actions().sendKeys(Keys.chord(Keys.CONTROL, "f")).perform(); // Ctrl + f
        $("html").sendKeys(Keys.chord(Keys.CONTROL, "f"));

        $("").pressEnter();
        $("").pressEscape();
        $("").pressTab();

        //drag and drop imitation
        actions().moveToElement($("div")).clickAndHold().moveByOffset(300, 200).release().perform();

        // old html actions don`t work with many modern frameworks
        $("").selectOption("dropdown_option");
        $("").selectRadio("radio_options");
    }

    void assertionExamples() {

        $("").shouldBe(visible);
        $("").shouldNotBe(visible);
        $("").shouldHave(text("abc"));
        $("").shouldNotHave(text("abc"));
        $("").should(appear);
        $("").shouldNot(appear);
    }

}
