package com.pruebasdesoftware.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import com.pruebasdesoftware.userinterfaces.Simulation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickSimulate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Simulation.SIMULATE_BTN)
        );
    }
    public static ClickSimulate makeInformation(){
        return instrumented(ClickSimulate.class);
    }
}
