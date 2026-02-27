package com.nycoodev.automation.ui.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;



public class OpenGoogle implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.google.com")
        );
    }

    public static OpenGoogle thePage() {
        return instrumented(OpenGoogle.class);
    }
}
