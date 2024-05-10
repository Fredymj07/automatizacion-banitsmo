package starter.steps;

import net.serenitybdd.annotations.Step;
import starter.navigation.NavegacionAInformesPage;

public class NavegacionAInformesSteps {

    NavegacionAInformesPage navegacionAInformesPage = new NavegacionAInformesPage();

    @Step
    public void abrirAppWeb() {
        navegacionAInformesPage.abrirAppWeb();
    }

    @Step
    public void ingresarACoporativos() {
        navegacionAInformesPage.ingresarACoporativos();
    }

    @Step
    public void ingresarACapitalInteligente() throws InterruptedException {
        navegacionAInformesPage.ingresarACapitalInteligente();
    }

    @Step
    public void ingresarEnActualidadEconomica() {
        navegacionAInformesPage.ingresarEnActualidadEconomica();
    }
}
