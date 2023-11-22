package com.pruebasdesoftware.tasks;

import com.pruebasdesoftware.userinterfaces.Simulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.ThreadLocalRandom;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EntersIncorrectInvestAmount implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        long maxAmount=999999L, minAmount=0L;
        long randomValue = ThreadLocalRandom.current().nextLong(minAmount,maxAmount);
        actor.attemptsTo(
                Enter.theValue(String.valueOf(randomValue)).into(Simulation.AMOUNT_INPUT)
        );
        actor.attemptsTo(SendKeys.of(Keys.TAB).into(Simulation.AMOUNT_INPUT));
    }
    public static EntersIncorrectInvestAmount makeInformation(){
        return instrumented(EntersIncorrectInvestAmount.class);
    }
}

