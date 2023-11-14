package com.pruebasdesoftware.tasks;

import com.pruebasdesoftware.userinterfaces.Simulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectsYesOption implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Simulation.YES_CHECK)
        );
    }
    public static SelectsYesOption makeInformation(){
        return instrumented(SelectsYesOption.class);
    }
}
