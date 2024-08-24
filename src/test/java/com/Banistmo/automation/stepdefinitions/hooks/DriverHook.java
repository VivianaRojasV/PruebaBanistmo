package com.Banistmo.automation.stepdefinitions.hooks;

import com.Banistmo.automation.utils.WebDriverFactory;
import io.cucumber.java.BeforeAll;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class DriverHook {
    @BeforeAll
    public static void setup() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(WebDriverFactory.goToWeb("https://www.bancolombia.com/personas"))));
        OnStage.theActorCalled("Automation");
    }
}
