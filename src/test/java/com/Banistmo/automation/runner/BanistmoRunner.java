package com.Banistmo.automation.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Banistmo.feature",
        glue = "com.Banistmo.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class BanistmoRunner {
}