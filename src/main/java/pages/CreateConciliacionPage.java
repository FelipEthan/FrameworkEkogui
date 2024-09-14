package pages;

import org.openqa.selenium.WebDriver;

public class CreateConciliacionPage extends BasePage {

    String selectTipoDoc = "//select[@id='tipoDoc']";
    String element1 = "//input[@id='document-number']";
    String element2 = "//input[@id='password']";
    String element5 = "//body/ek-main[1]/div[2]/div[1]/div[1]/ek-home[1]/ek-home[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]";
    String element6 = "//b[contains(text(),'Ingrese el identificador único del caso de la conc')]";
    String element7 = "//input[@id='year_field']";
    String element8 = "//input[@id='consecutivo_field']";
    String element9 = "//button[@id='btnConsultar']";
    String element10 = "//*[@id=\"warningPresentationDateToAndje\"]";
    String element3 = "//button[@id='send']";
    String selectAutor = "//body/ek-main[1]/div[2]/div[1]/div[1]/ek-perfil-abogada-analista[1]/main[1]/div[2]/ek-abogada-analista-informacion-basica-del-proceso[1]/section[1]/form[1]/article[2]/label[1]/ng-select[1]/div[1]";
    String sendAutoridad = "//*[@id=\"autoridad_que_conoce\"]/div/div/div[2]/input";
    String sendJurisdiccion = "//*[@id=\"jurisdiccion\"]/div/div/div[2]/input";
    String formaPresent = "//*[@id=\"forma_de_presentacion\"]/div";
    String optionPresent = "//span[text()='INDIVIDUAL']";
    String datePresent = "//*[@id=\"undefined\"]";
    String clicDay = "//div[contains(@class, 'today')]";
    String accionControl = "#accion_de_medios_de_control div[class='ng-select-container']";
    String optionAccionControl = "//span[text()='EJECUTIVO']";
    String buttonDocSop = "//button[@class='documentos-soporte-btn border']";
    String clicRadicate = "//body/ngb-modal-window[1]/div[1]/div[1]/ek-modal-soporte[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]";
    String buttonSearch = "//button[contains(text(),'Buscar')]";
    String buttonClose = "//button[contains(text(),'Cerrar')]";
    String partes = "#partes_tipo_de_parte div[class='ng-select-container']";
    String entidad = "//span[contains(text(),'ENTIDAD')]\n";
    String tipoCalidad = "#partes_calidad div[class='ng-select-container']";
    String calidad = "//span[contains(text(),'CONVOCANTE')]\n";
    String calidad2 = "//span[contains(text(),'CONVOCADO')]\n";
    String entidades = "#partes_entidad div[class='ng-select-container']";
    String clicEntidad = "//span[contains(text(),'ADMINISTRADORA DE LOS RECURSOS DEL SISTEMA GENERAL DE SEGURIDAD SOCIAL EN SALUD')]\n";
    String clicEntidad2 = "//span[contains(text(),'FISCALIA GENERAL DE LA NACION')]\n";
    String adicionarParte = "html > body > ek-main > div:nth-of-type(2) > div > div > ek-perfil-abogada-analista > main > div:nth-of-type(2) > ek-abogada-analista-informacion-basica-del-proceso > section > form > article:nth-of-type(3) > form > div > button";
    String clicVictima = "#victima_tipo_de_documento div[class='ng-select-container']";
    String optionVictima = "//span[text()='CEDULA DE CIUDADANIA']";
    String clicIdentificacion = "#victima_identificacion";
    String sendIdentificacion = "//*[@id='victima_identificacion']";
    String clicAñadirVictima = "//*[@id=\"warningMessageOppositeParts\"]/button";
    String usuario = "li[display='dynamic']";
    String actosAdmin = "//*[@id=\"formulario-registro-informacion-basica\"]/article[6]/div[2]/button";
    String listActos = "//select[@formcontrolname='idTpActo']\n";
    String optionActo = "//option[@value='12']\n";
    String observaciones = "//*[@id=\"observacion\"]";
    String numActo = "//*[@id='numero_de_acto']";
    String fechPresentActo = "//*[@id=\"calendar\"]";
    String selecFechPresenActo = "//div[contains(@class, 'today')]";
    String saveActos = "//button[@type='submit' and text()='Guardar']\n";
    String next = "//button[@type='submit' and text()='Continuar']\n";
    String fechaHechos = "//button[@class='btn bg-btn border']";
    String selecFechaHechos = "//div[@ngbdatepickerdayview and contains(@class, 'btn-light') and text()='9']\n";
    String departamento = "#departamento div[class='ng-select-container']";
    String selectDepartamento = "//span[text()='BOGOTA']";
    String municipio = "#municipio";
    String selectMunicipio = "//span[text()='BOGOTA, D.C.']";
    String añadirCiudad = "/html/body/ek-main/div[2]/div/div/ek-perfil-abogada-analista/main/div[2]/ek-abogada-analista-hechos-y-causas/section/form/article[1]/div[1]/button";
    String descripHechos = "//*[@id=\"descripcion_de_los_echos\"]";
    String pretensionDeclara = "//*[@id='presentasiones_declarativas']";
    String causa = "//*[@id=\"causa\"]/div";
    String selectCausa = "//span[contains(.,'ACCESO CARNAL O ACTO SEXUAL VIOLENTO')]";
    String subCausa = "//input[@id='subcausa']";
    String buttonAñadirCausa = "//*[@id=\"form\"]/article[3]/div[1]/button";
    String valor = "//*[@id=\"valor_economico\"]/div";
    String selectValor = "//span[contains(.,'Determinado')]";
    String erogacion = "//*[@id=\"genera_erogacion_economica\"]/div";
    String selectErogacion = "//span[contains('NACIONAL')]";

    public void navegarEkogui() {
        navigateTo("http://3.223.39.119:8081/ekogui-gateway/");
    }

    public void selectTipoDocumento(String value) {
        selectDropdownOption(selectTipoDoc, value);
    }

    public void sendUser(String value) {
        this.write(element1, value);
    }

    public void sendPass(String value) {
        this.write(element2, value);
    }

    public void clickSubmit() {
        this.clickElement(element3);
    }

    public CreateConciliacionPage(WebDriver driver) {
        super(driver);
    }

    public void clicCreateRecord() {
        this.clickElement(element5);
    }

    public void textValidatePGN() {
        this.textValidate(element6);
    }

    public void sendYear(String value) {
        this.write(element7, value);
    }

    public void sendConsecutive(String value) {
        this.write(element8, value);
    }

    public void clickConsult() {
        this.clickElement(element9);
    }

    public void textValidatePesta1() {
        this.textValidate(element10);
    }

    public void clicAutoridad() {
        this.clickElement(selectAutor);
    }

    public void sendAutoridad() {
        this.writeAndSubmit(sendAutoridad, "PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO");
    }

    public void datePresent() {
        this.clickElement(datePresent);
    }

    public void sendDate() {
        this.clickElement(clicDay);
    }

    public void clicJurisdiccion() {
        this.clickElement(sendJurisdiccion);
    }

    public void sendJurisdiccion() {
        this.writeAndSubmit(sendJurisdiccion, "ORDINARIO CIVIL");
    }

    public void clicFormPresent() {
        this.clickElement(formaPresent);
    }

    public void clicOptionFormPresent() {
        this.clickElement(optionPresent);
    }

    public void clicAccionControl() {
        this.clickElementCss(accionControl);
    }


    public void clicOptionAccionControl() {
        this.clickElement(optionAccionControl);
    }

    public void clicDocSopor() {
        this.clickElement(buttonDocSop);
    }

    public void clicRadicate() {
        this.clickElement(clicRadicate);
    }

    public void sendRadicate() {
            this.writeAndSubmit(clicRadicate, "20198002189312");
    }

    public void clicSearch() {
        this.clickElement(buttonSearch);
    }

    public void clicClose() {
        this.clickElement(buttonClose);
    }

    public void clicParts() {
        this.clickElementCss(partes);
    }
    public void clicParte() {
        this.clickElement(entidad);
    }
    public void clicTipCalidad() {
        this.clickElementCss(tipoCalidad);
    }
    public void clicCalidad() {
        this.clickElement(calidad);
    }
    public void clicCalidad2() {
        this.clickElement(calidad2);
    }
    public void clicEntidades() {
        this.clickElementCss(entidades);
    }
    public void clicEntidad() {
        this.clickElement(clicEntidad);
    }
    public void clicAdicionarParte() {
        this.clickElementCss(adicionarParte);
    }
    public void clicEntidad2() {
        this.clickElement(clicEntidad2);
    }
    public void clicListVictima() {
        this.clickElementCss(clicVictima);
    }
    public void optionVictima() {
        this.clickElement(optionVictima);
    }
    public void clicIdentificacion() {
        this.clickElementCss(clicIdentificacion);
    }
    public void sendIdentificacion(String value) {
        this.write(sendIdentificacion, value);
    }
    public void clicAñadirVictimas() {
        this.clickElement(clicAñadirVictima);
    }
    public void clicText() {
        this.clickElementCss(usuario);
    }
    public void clicActosAdmin() {
        this.clickElement(actosAdmin);
    }

    public void clicListActos() {
        this.clickElement(listActos);
    }
    public void clicActo() {
        this.clickElement(optionActo);
    }
    public void clicNumActo() {
        this.clickElement(numActo);
    }
    public void sendNumActo(String value) {
        this.write(numActo, value);
    }
    public void clicObservaciones() {
        this.clickElement(observaciones);
    }
    public void sendObservaciones(String value) {
        this.write(observaciones, value);
    }
    public void clicFechPresentActo() {
        this.clickElement(fechPresentActo);
    }
    public void selectFechPresenActo() {
        this.clickElement(selecFechPresenActo);
    }
    public void saveActo() {
        this.clickElement(saveActos);
    }
    public void nextPestaña() throws InterruptedException {
        this.clickElement(next);
        Thread.sleep(9000);
    }
    public void clicFechaHechos() {
        this.clickElement(fechaHechos);
    }
    public void clicSelectFechaHechos() {
        this.clickElement(selecFechaHechos);
    }
    public void clicDepartamentos() {
        this.clickElementCss(departamento);
    }
    public void selecDepartamento() {
        this.clickElement(selectDepartamento);
    }
    public void clicMunicipio() {
        this.clickElementCss(municipio);
    }
    public void clicAñadirMunicipio() {
        this.clickElement(añadirCiudad);
    }
    public void selecMunicipio() {
        this.clickElement(selectMunicipio);
    }
    public void clicDescripHechos() {
        this.clickElement(descripHechos);
    }
    public void sendDescripHechos() {
        this.writeAndSubmit(descripHechos, "PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA A 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ES");
    }
    public void clicPretenDecla() {
        this.clickElement(pretensionDeclara);
    }
    public void sendPretenDecla() {
        this.writeAndSubmit(pretensionDeclara, "PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO DE ESTADO PROCURADURIA 1 DELEGADA ANTE EL CONSEJO");
    }
    public void clicCausa() {
        this.clickElement(causa);
    }
    public void selectCausa() {
        this.clickElement(selectCausa);
    }
    public void sendSubCausa() {
        this.writeAndSubmit(subCausa, "OCURADURIA 1 DELEGADA ANTE EL CONSE");
    }
    public void añadirCausa() {
        this.clickElement(buttonAñadirCausa);
    }
    public void nextValorEconomico() {
        this.clickElement(next);
    }
    public void valorEconomico() {
        this.clickElement(valor);
    }
    public void selectValorEconomico() throws InterruptedException {
        Thread.sleep(1000);
        this.clickElement(selectValor);
    }
    public void erogacion() {
        this.clickElement(valor);
    }
    public void selecErogacion() {
        this.clickElement(valor);
    }
}
