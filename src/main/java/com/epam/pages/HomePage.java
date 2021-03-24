package com.epam.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class HomePage {

    public SelenideElement mainMessage = $(By.className("title-slider__slide-row"));
    public SelenideElement serviceMenuItem = $(By.className("top-navigation__item-link"));
    public SelenideElement engineerMenuItem = $(By.className("top-navigation__main-link"));

    @Step
    public void useServiceEngineerMenuItem() {
        serviceMenuItem.hover();
        engineerMenuItem.click();
    }
}
