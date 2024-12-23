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
        this.createConciliacion.sendUser("79799824");//79150488
        this.createConciliacion.sendPass("Agentesoporte_16");//Cap_Linktic2024
    }

    @And("^Hace clic en el botón de Entrar y hace clic en Crear registro$")
    public void clickEntrarAdmin() {
        this.createConciliacion.clickSubmit();
        this.createConciliacion.clickConciliacionExtrajudicial();
        this.createConciliacion.clickConciliacionExtrajudicialHome();
        this.createConciliacion.clicCreateRecord();

    }

    @Then("^El sistema solicita el numero identificador unico del caso$")
    public void screenIdentificador() {
        this.createConciliacion.textValidatePGN();
    }

    @And("^Ingresa año y consecutivo y hace clic en consultar$")
    public void enterPGN() {
        this.createConciliacion.sendYear("2000");
        String numeroAleatorio = createConciliacion.numeroAleatorio();
        this.createConciliacion.sendConsecutive(numeroAleatorio);
        this.createConciliacion.clickConsult();

    }

    @Then("^El sistema muestra la pestaña Información Básica$")
    public void screenPesta1() {
        this.createConciliacion.textValidatePesta1();
    }

    @And("^Se diligencia la información básica y se hace clic en Continuar$")
    public void enterDataPestaña1() throws InterruptedException {
        this.createConciliacion.datePresent();
        this.createConciliacion.sendDate();
        this.createConciliacion.clicAutoridad();
        this.createConciliacion.sendAutoridad();
        this.createConciliacion.clicJurisdiccion();
        this.createConciliacion.sendJurisdiccion();
        this.createConciliacion.clicAccionControl();
        this.createConciliacion.clicOptionAccionControl();
        this.createConciliacion.clicFormPresent();
        this.createConciliacion.clicOptionFormPresent();
        this.createConciliacion.clicDocSopor();
        this.createConciliacion.clicRadicate();
        this.createConciliacion.sendRadicate();
        this.createConciliacion.clicSearch();
        this.createConciliacion.closeModalSoporte();
        this.createConciliacion.clicParts();
        this.createConciliacion.clicParte();
        this.createConciliacion.clicTipCalidad();
        this.createConciliacion.clicCalidad();
        this.createConciliacion.clicEntidades();
        this.createConciliacion.clicEntidad();
        this.createConciliacion.clicAdicionarParte();
        this.createConciliacion.clicDocSopor();
        this.createConciliacion.clicSearch();
        this.createConciliacion.closeModalSoporte();
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
        this.createConciliacion.clicDivActos();
        this.createConciliacion.esperaAndClic();
        this.createConciliacion.clicObservaciones();
        this.createConciliacion.sendObservaciones("PRUEBAS");
        this.createConciliacion.clicNumActo();
        this.createConciliacion.sendNumActo("21302124");
        this.createConciliacion.clicActo();
        this.createConciliacion.clicFechPresentActo();
        this.createConciliacion.selectFechPresenActo();
        this.createConciliacion.saveActo();
        this.createConciliacion.nextPestaña();
    }

    @And("^Se diligencia Hechos y causas de la solicitud y se hace clic en Continuar$")
    public void enterDataPestaña2() {
        this.createConciliacion.clicFechaHechos();
        this.createConciliacion.clicSelectFechaHechos();
        this.createConciliacion.clicDepartamentos();
        this.createConciliacion.selecDepartamento();
        this.createConciliacion.clicMunicipio();
        this.createConciliacion.selecMunicipio();
        this.createConciliacion.clicAñadirMunicipio();
        this.createConciliacion.clicDescripHechos();
        this.createConciliacion.sendDescripHechos();
        this.createConciliacion.clicPretenDecla();
        this.createConciliacion.sendPretenDecla();
        this.createConciliacion.clicCausa();
        this.createConciliacion.selectCausa();
        this.createConciliacion.sendSubCausa();
        this.createConciliacion.añadirCausa();
        this.createConciliacion.nextValorEconomico();
    }

    @And("^Se diligencia Valor económico de la solicitud y se hace clic en Continuar$")
    public void enterDataPestaña3() {
        this.createConciliacion.valorEconomico();
        this.createConciliacion.selectValorEconomico();
        this.createConciliacion.erogacion();
        this.createConciliacion.selecErogacion();
        this.createConciliacion.pretension();
        this.createConciliacion.selecPretension();
        this.createConciliacion.unidad();
        this.createConciliacion.selectUnidad();
        this.createConciliacion.selectValorPretension();
        this.createConciliacion.sendValorPretension("100000000");
        this.createConciliacion.adicionarPretension();
        this.createConciliacion.nextPestaña4();
    }

    @And("^Se diligencia Admisión de la solicitud y se hace clic en Continuar$")
    public void enterDataPestaña4() {
        this.createConciliacion.clicDateActuacion();
        this.createConciliacion.selectDateActuacion();
        this.createConciliacion.clicDateAudiencia();
        this.createConciliacion.selectDateAudiencia();
        this.createConciliacion.docSoportAdmi();
        this.createConciliacion.clicRadicate();
        this.createConciliacion.sendRadicate();
        this.createConciliacion.clicSearch();
        this.createConciliacion.closeModalSoporte();
        this.createConciliacion.docSoportAdmi();
        this.createConciliacion.closeModalSoporte();
        this.createConciliacion.solicitudConciliacion();
        this.createConciliacion.selectSolicitudConciliacion();
        this.createConciliacion.clicObservacioAdmisi();
        this.createConciliacion.sendObservaciAdmisi();
        this.createConciliacion.clicFinalizar();
        this.createConciliacion.clicFinalizarSi();
        this.createConciliacion.textValidateConciliaciónCreada();
    }
    @Then("^El sistema radica la conciliación extrajudicial$")
    public void radicacionExitosa(){
        this.createConciliacion.textoEscritura();
    }
}
