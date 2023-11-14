package com.pruebasdesoftware.stepdefinitions;

import com.pruebasdesoftware.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import com.pruebasdesoftware.questions.SimulationResultIsShown;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoanSimulationStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver driver;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Santiago");
    }
    @Given("^I am on the Bancolombia's CDT simulator website$")
    public void iAmOnTheBancolombiaWebsite() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bancolombia.com/personas/productos-servicios/inversiones/cdts/fisicos/simulador-cdt"));
    }


    @When("^I click on \"([^\"]*)\" button$")
    public void iClickOnContinuar(String arg1) {
        theActorInTheSpotlight().attemptsTo(ClicksContinue.makeInformation());
    }

    @When("^I enter an invest amount between (\\d+) and (\\d+)$")
    public void iEnterAnInvestAmountBetweenAnd(int arg0, int arg1) {
        theActorInTheSpotlight().attemptsTo(EntersInvestAmount.makeInformation());
    }

    @And("^I select \"([^\"]*)\" for the question \"([^\"]*)\"$")
    public void iSelectSiForTheQuestion(String arg1, String arg2) {
        theActorInTheSpotlight().attemptsTo(SelectsYesOption.makeInformation());
    }
    @And("^I enter a deadline of between (\\d+) and (\\d+) days$")
    public void iEnterADeadlineOfBetweenAndDays(int arg0, int arg1) {
        theActorInTheSpotlight().attemptsTo(EntersDeadline.makeInformation());
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOnSimular(String arg1) {
        theActorInTheSpotlight().attemptsTo(ClickSimulate.makeInformation());
    }

    @Then("^I should see the estimated monthly payment$")
    public void iShouldSeeTheEstimatedMonthlyPayment() {
        theActorInTheSpotlight().should(seeThat(SimulationResultIsShown.onThePage()));
    }
}
