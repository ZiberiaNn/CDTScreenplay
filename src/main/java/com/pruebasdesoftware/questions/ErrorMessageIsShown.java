package com.pruebasdesoftware.questions;

import com.pruebasdesoftware.userinterfaces.Simulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ErrorMessageIsShown implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(Simulation.ERROR_TEXT).viewedBy(actor).asBoolean();
    }

    public static ErrorMessageIsShown onThePage() {
        return new ErrorMessageIsShown();
    }
}