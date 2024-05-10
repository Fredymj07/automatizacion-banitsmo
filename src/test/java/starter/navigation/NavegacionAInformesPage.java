package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class NavegacionAInformesPage extends PageObject {


    By linkCorporativos = By.xpath("//*[@id='header-empresas']");
    By linkCapitalInteligente = By.xpath("//*[@id='headerMain']/div[2]/div[1]/nav/ul/li[5]/a");
    By linkActualidadEconomica = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a");

    public void abrirAppWeb() {
        open();
    }

    public void ingresarACoporativos() {
        find(linkCorporativos).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public void navigateInWindowAdded() throws InterruptedException {
        String mainWindowHandle = getDriver().getWindowHandle();
        Set<String> allWindowHandles = getDriver().getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
                getDriver().switchTo().window(childWindow);
            }
        }
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public void ingresarACapitalInteligente() throws InterruptedException {
        find(linkCapitalInteligente).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        navigateInWindowAdded();
    }

    public void ingresarEnActualidadEconomica() {
        find(linkActualidadEconomica).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
}
