package com.epam.homePageTests;

import com.epam.BaseTest;
import com.epam.pages.HomePage;
import com.epam.pages.services.EngineerPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePageTests  extends BaseTest {

    private HomePage homePage = new HomePage();
    private EngineerPage engineerPage = new EngineerPage();

    @BeforeMethod
    public void openSignInPage(){
        open(baseUrl);
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }

    @Test(description = "Positive test scenario. Visit home page & check welcome message")
    public void visitHomePage() {
        assertThat(homePage.getMainMessage().getText()).isEqualTo("Engineering the Future");
    }

    @Test(description = "Positive test scenario. Go to Service/Engineer page")
    public void visitEngineerPageByService_EngineerMenuItemUsage() {
        homePage.useServiceEngineerMenuItem();
        assertThat(engineerPage.getMainMessage().getText()).isEqualTo("Engineer");
    }
}
