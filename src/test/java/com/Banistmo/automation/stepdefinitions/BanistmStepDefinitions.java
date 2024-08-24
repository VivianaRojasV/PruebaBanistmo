package com.Banistmo.automation.stepdefinitions;

import com.Banistmo.automation.interactions.Cambio;
import com.Banistmo.automation.interactions.Wait;
import com.Banistmo.automation.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class BanistmStepDefinitions {

    @Given("Selecciona personas")
    public void searchAprender() {
        theActorInTheSpotlight().attemptsTo(ClickButtonPersonasTasks.clickButtonAprender());
    }
    @When("Ir a boton de producto y servicios")
    public void searchLegales() {
        theActorInTheSpotlight().attemptsTo(ClickButtonProductosTasks.clickButtonLegales());
    }

    @When("Oprime boton inversiones")
    public void searchFact() {
        theActorInTheSpotlight().attemptsTo(ClickButtonInversionesTasks.clickButtonFack());
    }

    @When("Oprimir Inversion virtual")
    public void searchVirtu() {
        theActorInTheSpotlight().attemptsTo(ClickButtonInversionVirtualTasks.clickButtonInversionVirtual());
    }

    @When("Descarga  “Reglamento Inversion Virtual Bancolombia.pdf”")
    public void downloadPdf() {
        theActorInTheSpotlight().attemptsTo(ClickButtonDescargaTasks.clickButtonDownload());
    }

    @Then("Validar pdf")
    public void pestanaPdf() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));
        theActorInTheSpotlight().attemptsTo(Cambio.aLaPestana(1));
    }
}
