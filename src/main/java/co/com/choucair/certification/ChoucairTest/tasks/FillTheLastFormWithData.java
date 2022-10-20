package co.com.choucair.certification.ChoucairTest.tasks;

import co.com.choucair.certification.ChoucairTest.model.Data;
import co.com.choucair.certification.ChoucairTest.userinterface.FinalStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.ChoucairTest.userinterface.FinalStep.*;

public class FillTheLastFormWithData implements Task {
    private List<Data> dataList;

    public FillTheLastFormWithData(List<Data> dataList) {
        this.dataList = dataList;
    }

    public static FillTheLastFormWithData Page(List<Data> dataList) {
        return Tasks.instrumented(FillTheLastFormWithData.class,dataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataList.get(0).getStrPassword()).into(FinalStep.PASSWORD),
                Enter.theValue(dataList.get(0).getStrPassword()).into(FinalStep.CONFIRM_PASSWORD),
                Click.on(FIRST_CHECK),
                Click.on(SECOND_CHECK),
                Click.on(THIRD_CHECK),
                Click.on(FINAL_BUTTON)
        );
    }
}
