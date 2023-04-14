package git;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsSearch {

    @Test
    void softAssertionsCheck () {

        // open page with repository of selenide
        open("https://github.com/selenide/selenide");
        //move to wiki and click
        $("#wiki-tab").click();
        //find right menu and click the drop-down menu "Show 2 more pages…"
        $(".wiki-more-pages-link").$("[type=button]").click();
        //find menu element "SoftAssertions" and check the spelling of the name of this element
        $$(".Box-row").get(16).shouldHave(text("SoftAssertion"));
        sleep(5000);
    }
}
