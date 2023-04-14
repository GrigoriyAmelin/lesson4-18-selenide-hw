package git;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void andreiSolntcevShouldBeTheFirstContributor () {

        // open page with repository of selenide
        open("https://github.com/selenide/selenide");
        // move a mouse to the first avatar in a block
        $("div.Layout-sidebar").$(byText("Contributors")).closest(".BorderGrid-cell").
                $$("ul li").first().hover();
        // check that pop-up window include the text "Andrei Solntsev"
        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}
