package co.com.choucair.candidate.jcgc.questions;

import co.com.choucair.candidate.jcgc.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private final String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String email = Text.of(UTestSignUpPage.EMAIL).viewedBy(actor).asString();
        result = question.equals(email);
        return result;
    }

}
