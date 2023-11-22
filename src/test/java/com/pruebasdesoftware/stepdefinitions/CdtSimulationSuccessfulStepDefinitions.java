package com.pruebasdesoftware.stepdefinitions;

import com.pruebasdesoftware.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import com.pruebasdesoftware.questions.SimulationResultIsShown;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CdtSimulationSuccessfulStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver driver;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Santiago");
    }

    @When("^I enter an invest amount between (\\d+) and (\\d+)$")
    public void iEnterAnInvestAmountBetweenAnd(int arg0, int arg1) {
        theActorInTheSpotlight().attemptsTo(EntersCorrectInvestAmount.makeInformation());
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
