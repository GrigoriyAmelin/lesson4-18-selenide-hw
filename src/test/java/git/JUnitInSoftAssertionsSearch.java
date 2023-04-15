package git;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactTextCaseSensitive;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnitInSoftAssertionsSearch {

    @Test
    void JUnitInSoftAssertionsExist () {

        // Open page with selenide repository
        open("https://github.com/selenide/selenide");

        // Move cursor to wiki and click
        $("#wiki-tab").click();

        // Find "Pages" menu, enter text "softassert" into search-bar
        $(".filter-bar input").setValue("softassert");

        // Check that element "SoftAssertions" exist
        $$(".details-reset").last().shouldHave(exactTextCaseSensitive("SoftAssertions"));

        // Click on "softAsserions" link
        $$(".details-reset").last().$(byText("SoftAssertions")).click();

        // Find that JUnit5 code sample exist
        $(".markdown-body").$(byText("3. Using JUnit5 extend test class:")).
                shouldHave(exactTextCaseSensitive("3. Using JUnit5 extend test class:"));
    }
}
