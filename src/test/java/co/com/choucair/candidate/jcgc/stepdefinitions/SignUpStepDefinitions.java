package co.com.choucair.candidate.jcgc.stepdefinitions;

import co.com.choucair.candidate.jcgc.questions.Answer;
import co.com.choucair.candidate.jcgc.tasks.OpenUp;
import co.com.choucair.candidate.jcgc.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SignUpStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Juan wants to sign up at website uTest$")
    public void thanJuanWantsToSignUpAtWebsiteUTest() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());

    }

    @When("^he search, click on the Join Today button and he fills the form to sign up$")
    public void heSearchTheJoinToday() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage());

    }

    @Then("^he finds (.*)$")
    public void heFindsIfTheUserExists(String question) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
