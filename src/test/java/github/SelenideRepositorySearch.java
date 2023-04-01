package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop () {

        // open main page
        open("https://github.com");
        // enter into search field "selenide" and press ENTER
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        // click on the first repository at the list of found repositories
        $$("ul.repo-list li").first().$("a").click();
        // check that header is "selenide/selenide"
        $("#repository-container-header").shouldHave(text("selenide /\nselenide"));
        sleep(5000);

        // ARRANGE

        // ACT

        // ASSERT



    }
}
