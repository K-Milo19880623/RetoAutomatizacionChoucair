package co.com.choucair.candidate.jcgc.tasks;

import co.com.choucair.candidate.jcgc.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SignUp implements Task {

    public static SignUp onThePage() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UTestSignUpPage.SIGNUP_BUTTON),
                Enter.theValue("Camilo").into(UTestSignUpPage.INPUT_FIRSTNAME),
                Enter.theValue("Giraldo").into(UTestSignUpPage.INPUT_LASTNAME),
                Enter.theValue("juancorrea0623@gmail.com").into(UTestSignUpPage.EMAIL),
                SelectFromOptions.byVisibleText("June").from(UTestSignUpPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText("23").from(UTestSignUpPage.BIRTH_DAY),
                SelectFromOptions.byVisibleText("1988").from(UTestSignUpPage.BIRTH_YEAR),
                Click.on(UTestSignUpPage.NEXT_LOCATION_BUTTON),
                Enter.theValue("050031").into(UTestSignUpPage.INPUT_ZIP),
                Click.on(UTestSignUpPage.NEXT_DEVICES_BUTTON),
                Click.on(UTestSignUpPage.NEXT_PASSWORD_BUTTON),
                Enter.theValue("HelloWorld2022").into(UTestSignUpPage.INPUT_PASSWORD),
                Enter.theValue("HelloWorld2022").into(UTestSignUpPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestSignUpPage.CHECKBOX_TERMS_USE),
                Click.on(UTestSignUpPage.CHECKBOX_PRIVACY_SECURITY_POLICY),
                Click.on(UTestSignUpPage.COMPLETE_SETUP_BUTTON)
                );
    }
}
