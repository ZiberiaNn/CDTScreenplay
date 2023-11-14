package com.pruebasdesoftware.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Simulation {
    public static final Target CONTINUE_BTN = Target.the("continue simulation button")
            .locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target AMOUNT_INPUT = Target.the("CDT amount to invest input")
            .locatedBy("//*[@id=\"valor-simulacion\"]");
    public static final Target YES_CHECK = Target.the("yes option for the question if the user knows the deadline of the CDT")
            .locatedBy("//*[@id=\"opcion-si\"]");
    public static final Target DEADLINE_INPUT = Target.the("deadline input")
            .locatedBy("//*[@id=\"valor-plazo\"]\n");

    public static final Target SIMULATE_BTN = Target.the("simulate CDT investment button")
            .locatedBy("//*[@id=\"boton-simular\"]");
    public static final Target SIMULATION_DONE_TEXT = Target.the("simulation done text")
            .locatedBy("//*[@id=\"title\"]");
}


