package co.com.choucair.certification.ChoucairTest.tasks;

import co.com.choucair.certification.ChoucairTest.model.Data;
import co.com.choucair.certification.ChoucairTest.userinterface.StepOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.ChoucairTest.userinterface.StepOne.*;

public class FillTheFirstFormWithData implements Task {

    private List<Data> dataList;

    public FillTheFirstFormWithData(List<Data> dataList) {
        this.dataList = dataList;
    }

    public static FillTheFirstFormWithData Page(List<Data> dataList) {
        return Tasks.instrumented(FillTheFirstFormWithData.class, dataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataList.get(0).getStrFName()).into(StepOne.FIRST_NAME),
                Enter.theValue(dataList.get(0).getStrLName()).into(StepOne.LAST_NAME),
                Enter.theValue(dataList.get(0).getStrEmail()).into(StepOne.EMAIL),
                SelectFromOptions.byVisibleText(dataList.get(0).getStrMonth()).from(MONTH_DATE),
                SelectFromOptions.byVisibleText(dataList.get(0).getStrDay()).from(DAY_DATE),
                SelectFromOptions.byVisibleText(dataList.get(0).getStrYear()).from(YEAR_DATE),
                Click.on(NEXT_BUTTON)
                );
    }
}
