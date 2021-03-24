package com.epam.pages.services;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class EngineerPage {

    public SelenideElement mainMessage = $(By.cssSelector("h1.title-ui"));
    public SelenideElement tileTable = $(By.cssSelector("a.multi-level-tabs__sub-link.js-tabs-link--sub"));
    public SelenideElement testAutomationTile = $(By.xpath("//*[contains(text(), 'Test Automation')]"));
    public SelenideElement testAutomationPageHeader = $(By.xpath("//*[contains(text(), 'Test Automation')]"));

    @Step
    public void goToTestAutomationChapter() {
        tileTable.scrollTo();
        testAutomationTile.click();
    }
}

