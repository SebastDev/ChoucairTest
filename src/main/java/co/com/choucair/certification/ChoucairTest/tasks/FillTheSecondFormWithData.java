package co.com.choucair.certification.ChoucairTest.tasks;

import co.com.choucair.certification.ChoucairTest.model.Data;
import co.com.choucair.certification.ChoucairTest.userinterface.StepTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.ChoucairTest.userinterface.StepTwo.*;

public class FillTheSecondFormWithData implements Task {
    private List<Data> dataList;

    public FillTheSecondFormWithData(List<Data> dataList) {
        this.dataList = dataList;
    }

    public static FillTheSecondFormWithData Page(List<Data> dataList) {
        return Tasks.instrumented(FillTheSecondFormWithData.class, dataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataList.get(0).getStrCity()).into(CITY),
                //Here, we are going to "bind" the arrow keys to select the city
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(dataList.get(0).getStrPostalCode()).into(POSTAL_CODE),
                Click.on(COUNTRY_CONTAINER),
                Enter.theValue(dataList.get(0).getStrCountry()).into(COUNTRY),
                Click.on(NEXT_BUTTON_TWO)
                );
    }
}
