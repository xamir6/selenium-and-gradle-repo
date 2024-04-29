package docs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
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
}
