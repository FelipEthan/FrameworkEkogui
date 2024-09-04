package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CreateConciliacionPage;


public class CreateConciliacionSteps {
    private WebDriver driver;
    private CreateConciliacionPage createConciliacion;

    public CreateConciliacionSteps() {
        this.driver = BasePage.initializeDriver();
        this.createConciliacion = new CreateConciliacionPage(this.driver);
    }
    @Given("^El usuario está en la página de inicio$")
    public void toEkogui() {
        this.createConciliacion.navegarEkogui();
    }
    @When("^Selecciona tipo documento, ingresa cedula y la contraseña$")
    public void enterDataAdmin() {
        this.createConciliacion.selectTipoDocumento("CC");
        this.createConciliacion.sendUser("17642332");
        this.createConciliacion.sendPass("Agentesoporte_16");
    }
    @And("^Hace clic en el botón de Entrar y hace clic en Crear registro$")
    public void clickEntrarAdmin() {
        this.createConciliacion.clickSubmit();
        this.createConciliacion.clicCreateRecord();

    }
    @Then("^El sistema solicita el numero identificador unico del caso$")
    public void screenIdentificador() {
        this.createConciliacion.textValidatePGN();
    }

    @And("^Ingresa año y consecutivo y hace clic en consultar$")
    public void enterPGN() {
        this.createConciliacion.sendYear("2020");
        String numeroAleatorio = createConciliacion.numeroAleatorio();
        this.createConciliacion.sendConsecutive(numeroAleatorio);
        this.createConciliacion.clickConsult();
    }
    @Then("^El sistema muestra la pestaña Información Básica$")
    public void screenPesta1() {
        this.createConciliacion.textValidatePesta1();
    }
    @When("^Se diligencia la información y hace clic en Continuar$")
    public void enterDataPesta1() {
        this.createConciliacion.datePresent();
        this.createConciliacion.sendDate();
        this.createConciliacion.clicAutoridad();
        this.createConciliacion.sendAutoridad();
        this.createConciliacion.clicJurisdiccion();
        this.createConciliacion.sendJurisdiccion();
        this.createConciliacion.clicFormPresent();
        this.createConciliacion.clicOptionFormPresent();
        this.createConciliacion.clicAccionControl();
        this.createConciliacion.clicOptionAccionControl();
        this.createConciliacion.clicDocSopor();
        this.createConciliacion.clicRadicate();
        this.createConciliacion.sendRadicate();
        this.createConciliacion.clicSearch();
        this.createConciliacion.clicClose();
        this.createConciliacion.clicParts();
        this.createConciliacion.clicParte();
        this.createConciliacion.clicTipCalidad();
        this.createConciliacion.clicCalidad();
        this.createConciliacion.clicDocSopor();
        this.createConciliacion.clicClose();
        this.createConciliacion.clicEntidades();
        this.createConciliacion.clicEntidad();
        this.createConciliacion.clicDocSopor();
        this.createConciliacion.clicClose();
        this.createConciliacion.clicAdicionarParte();
        this.createConciliacion.clicParts();
        this.createConciliacion.clicParte();
        this.createConciliacion.clicTipCalidad();
        this.createConciliacion.clicCalidad2();
        this.createConciliacion.clicEntidades();
        this.createConciliacion.clicEntidad2();
        this.createConciliacion.clicAdicionarParte();
        this.createConciliacion.clicListVictima();
        this.createConciliacion.optionVictima();
        this.createConciliacion.clicIdentificacion();
        this.createConciliacion.sendIdentificacion("93202179");
        this.createConciliacion.clicText();
        this.createConciliacion.clicAñadirVictimas();
        this.createConciliacion.clicActosAdmin();
        this.createConciliacion.clicObservaciones();
        this.createConciliacion.clicListActos();
        this.createConciliacion.clicActo();
        this.createConciliacion.clicNumActo();
        this.createConciliacion.sendNumActo("21302124");
        this.createConciliacion.sendObservaciones("PRUEBAS");
        this.createConciliacion.clicFechPresentActo();
        this.createConciliacion.selectFechPresenActo();
        this.createConciliacion.saveActo();
        this.createConciliacion.nextPestaña();
    }
}
