package co.com.choucair.certification.ChoucairTest.tasks;

import co.com.choucair.certification.ChoucairTest.userinterface.UtestWebsite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUtestWebsite implements Task {
    private UtestWebsite utestWebsite;

    public static OpenUtestWebsite Page() {
        return Tasks.instrumented(OpenUtestWebsite.class);
    }

    //These are the actor actions
    //Actor will open the browser and click on the button Join Today
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestWebsite),
                Click.on(UtestWebsite.JOIN_TODAY));
    }
}
