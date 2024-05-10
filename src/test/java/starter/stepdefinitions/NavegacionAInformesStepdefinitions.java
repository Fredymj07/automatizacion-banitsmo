package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.steps.NavegacionAInformesSteps;

public class NavegacionAInformesStepdefinitions {

    @Steps
    NavegacionAInformesSteps navegacionAInformesSteps;

    @Given("el usuario se encuentra en la pantalla principal de la banca virtual")
    public void abrirAppWeb() {
        navegacionAInformesSteps.abrirAppWeb();
    }

    @When("el usuario ingresa a la sección corporativos")
    public void ingresarACoporativos() {
        navegacionAInformesSteps.ingresarACoporativos();
    }

    @When("el usuario está en corporativos hace clic en la opción Capital inteligente de la navegación")
    public void ingresarACapitalInteligente() throws InterruptedException {
        navegacionAInformesSteps.ingresarACapitalInteligente();
    }

    @Then("el usuario ingresa a la sección Actualidad económica")
    public void ingresarEnActualidadEconomica() {
        navegacionAInformesSteps.ingresarEnActualidadEconomica();
    }
}
