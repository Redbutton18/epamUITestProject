package com.epam;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import static com.epam.helpers.properties.UrlLinkProp.MAIN_URL;

@Listeners({})
public class BaseTest {
    public String baseUrl = MAIN_URL;

    @BeforeTest
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
        Configuration.reportsFolder = "target/test-result/reports";
    }
}
