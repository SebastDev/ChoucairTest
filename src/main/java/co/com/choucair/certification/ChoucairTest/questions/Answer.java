package co.com.choucair.certification.ChoucairTest.questions;

import co.com.choucair.certification.ChoucairTest.model.Data;
import co.com.choucair.certification.ChoucairTest.userinterface.FinalStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
    private List<Data> StepOneData;

    public Answer(List<Data> stepOneData) {
        StepOneData = stepOneData;
    }

    public static Answer To(List<Data> stepOneData) {
        return new Answer(stepOneData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String FINAL_BUTTON = Text.of(FinalStep.FINAL_BUTTON).viewedBy(actor).asString();
        return StepOneData.get(0).getStrFinal().equals(FINAL_BUTTON);
    }
}
