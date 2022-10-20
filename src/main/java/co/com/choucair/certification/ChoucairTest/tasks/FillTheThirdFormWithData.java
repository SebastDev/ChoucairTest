package co.com.choucair.certification.ChoucairTest.tasks;

import co.com.choucair.certification.ChoucairTest.model.Data;
import co.com.choucair.certification.ChoucairTest.userinterface.StepThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.ChoucairTest.userinterface.StepThree.*;

public class FillTheThirdFormWithData implements Task {

    private List<Data> dataList;

    public FillTheThirdFormWithData(List<Data> dataList) {
        this.dataList = dataList;
    }

    public static FillTheThirdFormWithData Page(List<Data> stepOneData) {
        return Tasks.instrumented(FillTheThirdFormWithData.class, stepOneData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StepThree.COMPUTER_CONTAINER),
                Enter.theValue(dataList.get(0).getStrComputerOS()).into(COMPUTER).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(StepThree.VERSION_CONTAINER),
                Enter.theValue(dataList.get(0).getStrComputerVersion()).into(VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(StepThree.LANGUAGE_CONTAINER),
                Enter.theValue(dataList.get(0).getStrComputerOSLang()).into(LANGUAGE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(StepThree.MOBILE_CONTAINER),
                Enter.theValue(dataList.get(0).getStrMobileBrand()).into(MOBILE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(StepThree.MODEL_CONTAINER),
                Enter.theValue(dataList.get(0).getStrMobileModel()).into(MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(StepThree.OS_CONTAINER),
                Enter.theValue(dataList.get(0).getStrMobileOS()).into(OS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(NEXT_BUTTON_THREE)
        );
    }
}
