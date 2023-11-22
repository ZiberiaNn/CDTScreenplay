package com.pruebasdesoftware.stepdefinitions;

import com.pruebasdesoftware.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CdtSimulationStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver driver;

    @Given("^I am on the Bancolombia's CDT simulator website$")
    public void iAmOnTheBancolombiaWebsite() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bancolombia.com/personas/productos-servicios/inversiones/cdts/fisicos/simulador-cdt"));
    }


    @When("^I click on \"([^\"]*)\" button$")
    public void iClickOnContinuar(String arg1) {
        theActorInTheSpotlight().attemptsTo(ClicksContinue.makeInformation());
    }

}
