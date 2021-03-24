package com.epam.services.engineer;

import com.codeborne.selenide.Condition;
import com.epam.BaseTest;
import com.epam.pages.services.EngineerPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class EngineerPageTest extends BaseTest {

    private EngineerPage engineerPage = new EngineerPage();

    @BeforeMethod
    public void openSignInPage(){
        open(baseUrl + "/services/engineer");
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }

    @Test(description = "Positive scenario. Go to Test Automation page chapter")
    public void openTestAutomationPageChapter() {
        engineerPage.goToTestAutomationChapter();
        assertThat(engineerPage.testAutomationPageHeader.is(Condition.visible));
    }
}
