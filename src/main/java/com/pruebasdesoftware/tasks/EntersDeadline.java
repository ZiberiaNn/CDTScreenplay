package com.pruebasdesoftware.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import com.pruebasdesoftware.userinterfaces.Simulation;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EntersDeadline implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int maxDays=540, minDays=60;
        int deadlineDays = new Random().nextInt(maxDays - minDays) + minDays;
        actor.attemptsTo(
                Enter.theValue(String.valueOf(deadlineDays)).into(Simulation.DEADLINE_INPUT)
        );
    }
    public static EntersDeadline makeInformation(){
        return instrumented(EntersDeadline.class);
    }
}

