package com.pruebasdesoftware.tasks;

import com.pruebasdesoftware.userinterfaces.Simulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.concurrent.ThreadLocalRandom;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EntersCorrectInvestAmount implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        long maxAmount=5000000000L, minAmount=1000000L;
        long randomValue = ThreadLocalRandom.current().nextLong(minAmount,maxAmount);
        actor.attemptsTo(
                Enter.theValue(String.valueOf(randomValue)).into(Simulation.AMOUNT_INPUT)
        );
    }
    public static EntersCorrectInvestAmount makeInformation(){
        return instrumented(EntersCorrectInvestAmount.class);
    }
}

