package com.nycoodev.automation.ui.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheTitle implements Question{

    @Override
    public String answeredBy(Actor actor) {
        return actor.abilityTo(
                net.serenitybdd.screenplay.abilities.BrowseTheWeb.class
        ).getDriver().getTitle();
    }

    public static TheTitle is() {
        return new TheTitle();
    }
}
