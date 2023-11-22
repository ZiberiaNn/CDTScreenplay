package com.pruebasdesoftware.stepdefinitions;

import com.pruebasdesoftware.questions.ErrorMessageIsShown;
import com.pruebasdesoftware.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CdtSimulationErrorStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver driver;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Santiago");
    }

    @When("^I enter an invest amount that is under (\\d+)$")
    public void iEnterAnInvestAmountThatIsUnder(int arg0) {
        theActorInTheSpotlight().attemptsTo(EntersIncorrectInvestAmount.makeInformation());
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String arg0) throws Throwable {
        theActorInTheSpotlight().should(seeThat(ErrorMessageIsShown.onThePage()));
    }

}
