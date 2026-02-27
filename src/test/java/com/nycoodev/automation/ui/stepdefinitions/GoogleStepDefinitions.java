package com.nycoodev.automation.ui.stepdefinitions;

import com.nycoodev.automation.ui.questions.TheTitle;
import com.nycoodev.automation.ui.tasks.OpenGoogle;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.annotations.Managed;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class GoogleStepDefinitions {

    Actor usuario = Actor.named("User");

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("el usuario abre la pagina de Google")
    public void abrirGoogle() {
        usuario.attemptsTo(
                OpenGoogle.thePage()
        );
    }

    @Then("deberia ver el titulo correcto")
    public void validarTitulo() {
        String titulo = usuario.asksFor(TheTitle.is()).toString();
        assertThat(titulo, containsString("Google"));
    }
}