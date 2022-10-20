package co.com.choucair.certification.ChoucairTest.stepdefinitions;

import co.com.choucair.certification.ChoucairTest.model.Data;
import co.com.choucair.certification.ChoucairTest.questions.Answer;
import co.com.choucair.certification.ChoucairTest.tasks.*;
import co.com.choucair.certification.ChoucairTest.tasks.FillTheSecondFormWithData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinition {

    //Here, we must create the scenary of the actor

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    // Given = Pre-conditions
    @Given("^that a new user wants to register in Utest website$")
    public void thatANewUserWantsToRegisterInUtestWebsite() {
        theActorCalled("User").wasAbleTo(OpenUtestWebsite.Page());
    }


    @When("^user complete the four steps of the registration forms$")
    // Here, we use the data to fill the form
    public void userCompleteTheFourStepsOfTheRegistrationForms(List<Data> StepOneData) {
        theActorInTheSpotlight().attemptsTo(FillTheFirstFormWithData.Page(StepOneData), FillTheSecondFormWithData.Page(StepOneData), FillTheThirdFormWithData.Page(StepOneData), FillTheLastFormWithData.Page(StepOneData));
    }

    @Then("^user will be successfully registered$")
    public void userWillBeSuccessfullyRegistered(List<Data> StepOneData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.To(StepOneData)));
    }
}
