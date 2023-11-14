package com.pruebasdesoftware.tasks;

import com.pruebasdesoftware.userinterfaces.Simulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class ClicksContinue implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Simulation.CONTINUE_BTN)
        );
    }
    public static ClicksContinue makeInformation(){
        return instrumented(ClicksContinue.class);
    }
}
