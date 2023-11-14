package com.pruebasdesoftware.questions;
import com.pruebasdesoftware.userinterfaces.Simulation;
import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Question;
        import net.serenitybdd.screenplay.questions.Visibility;

public class SimulationResultIsShown implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(Simulation.SIMULATION_DONE_TEXT).viewedBy(actor).asBoolean();
    }

    public static SimulationResultIsShown onThePage() {
        return new SimulationResultIsShown();
    }
}