package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    String accionControl = "//*[@id=\"accion_de_medios_de_control\"]/div";
    String optionAccionControl = "//span[text()='EJECUTIVO']";
    String buttonDocSop = "//button[@class='documentos-soporte-btn border']";
    String clicRadicate = "//body/ngb-modal-window[1]/div[1]/div[1]/ek-modal-soporte[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]";
    String buttonSearch = "//button[contains(text(),'Buscar')]";
    String buttonClose = "/html/body/ngb-modal-window/div/div/ek-modal-soporte/div/div/div/div[9]/button";
    String partes = "#partes_tipo_de_parte div[class='ng-select-container']";
    String entidad = "//span[contains(text(),'ENTIDAD')]\n";
    String tipoCalidad = "#partes_calidad div[class='ng-select-container']";
    String calidad = "//span[contains(text(),'CONVOCANTE')]\n";
    String calidad2 = "//span[contains(text(),'CONVOCADO')]\n";
    String entidades = "#partes_entidad div[class='ng-select-container']";
    String clicEntidad = "//span[contains(text(),'ADMINISTRADORA DE LOS RECURSOS DEL SISTEMA GENERAL DE SEGURIDAD SOCIAL EN SALUD')]\n";
    String clicEntidad2 = "//span[contains(text(),'PAR BANCO DEL ESTADO EN LIQUIDACION')]\n";
    String adicionarParte = "//body/ek-main[1]/div[2]/div[1]/div[1]/ek-perfil-abogada-analista[1]/main[1]/div[2]/ek-abogada-analista-informacion-basica-del-proceso[1]/section[1]/form[1]/article[3]/form[1]/div[1]/button[1]";
    String clicVictima = "#victima_tipo_de_documento div[class='ng-select-container']";
    String optionVictima = "//span[text()='CEDULA DE CIUDADANIA']";
    String clicIdentificacion = "#victima_identificacion";
    String sendIdentificacion = "//*[@id='victima_identificacion']";
    String clicAñadirVictima = "//body/ek-main[1]/div[2]/div[1]/div[1]/ek-perfil-abogada-analista[1]/main[1]/div[2]/ek-abogada-analista-informacion-basica-del-proceso[1]/section[1]/form[1]/article[4]/form[1]/div[1]/button[1]";
    String usuario = "/html/body/ek-main/div[2]/div/div/ek-perfil-abogada-analista/main/div[2]/ek-abogada-analista-informacion-basica-del-proceso/section/form/article[4]/form/label[1]/span";
    String actosAdmin = "//*[@id=\"formulario-registro-informacion-basica\"]/article[6]/div[2]/button";
    String listActos = "//select[@formcontrolname='idTpActo']\n";
    String optionActo = "//option[@value='12']\n";
    String observaciones = "//*[@id=\"observacion\"]";
    String numActo = "//*[@id='numero_de_acto']";
    String fechPresentActo = "//*[@id=\"calendar-actos-administrativos\"]";
    String selecFechPresenActo = "//div[contains(@class, 'today')]";
    String saveActos = "//button[@type='submit' and text()='Guardar']\n";
    String next = "//button[@type='submit' and text()='Continuar']\n";
    String fechaHechos = "//*[@id=\"calendar-fecha-hechos\"]";
    String selecFechaHechos = "//*[@id=\"calendar-fecha-hechos\"]/div/div/div[2]/div[2]/div[9]";
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
    String selectErogacion = "//span[text()='NACIONAL']\n";
    String presentiones = "//*[@id=\"tipo_pretension\"]/div";
    String selectPresention = "//span[text()='DAÑO INMATERIAL - DAÑO MORAL']\n";
    String unidades = "//*[@id=\"unidad_monetaria\"]/div";
    String selectUnidades = "//span[text()='PESOS']\n";
    String valorPretension = "//*[@id=\"valor\"]";
    String adicionarPretension = "//*[@id=\"form\"]/article[2]/div[1]/button";
    String next4 = "//*[@id=\"form\"]/div[2]/button[2]";
    String dateActuacion = "//*[@id=\"performanceDate\"]";
    String selectDateActuacion = "//div[contains(@class, 'today')]";
    String dateAudiencia = "//input[@id='calendar-fecha-audiencia-conciliacion']";
    String selectDateAudiencia = "//*[@id=\"calendar-fecha-audiencia-conciliacion\"]/div/div/div[2]/div[2]/div[31]";
    String solicitud = "//ng-select[@bindlabel='padoDescripcion']\n";
    String selectSolicitud = "//span[text()='MINISTERIO PUBLICO']\n";
    String docSoportAdmision = "//button[@class='documentos-soporte-btn']\n";
    String clicRadicate2 = "/html/body/ngb-modal-window/div/div/ek-modal-soporte/div/div/div/div[2]/div[2]/input";
    String observacionesAdmision = "//*[@id=\"story\"]";
    String finalizar = "//button[@type='submit']\n";
    String buttonSi = "//button[@class='button-save']";
    String spinner = "ngx-spinner";
    String divActos = "/html/body/ngb-modal-window/div/div/ek-modal-registro-de-actos-administrativos";
    String activo = "/html/body/ek-main/div[2]/div/div/ek-home/ek-informacion-proceso/section/div[1]/div/div[1]/div[2]/p";
    String numEkogui = "//*[@id=\"idEkogui\"]";

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
        this.esperaExplicita(spinner);
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
        this.esperaExplicita(spinner);
        this.clickElement(formaPresent);
    }

    public void clicOptionFormPresent() {
        this.clickElement(optionPresent);
    }

    public void clicAccionControl() {
        this.esperaExplicita(spinner);
        this.clickElement(accionControl);
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
        this.clickElement(adicionarParte);
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
        this.esperaExplicita(spinner);
        this.clickElement(clicAñadirVictima);
    }
    public void clicText() {
        this.clickElementClic(usuario);
    }
    public void clicDivActos()  {
        this.clickElement(divActos);
    }
    public void clicActosAdmin()  {
        this.clickElementClic(actosAdmin);
        this.esperaExplicita(spinner);
    }
    public void esperaAndClic()  {
        this.esperaExplicita(spinner);
        this.clickElementClic(listActos);
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
    }
    public void clicFechaHechos() {
        this.esperaExplicita(spinner);
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
    public void nextValorEconomico(){
        this.clickElement(next);
        this.esperaExplicita(spinner);
    }
    public void valorEconomico() {
        this.clickElement(valor);
    }
    public void selectValorEconomico() {
        this.clickElement(selectValor);
    }
    public void erogacion() {
        this.clickElement(erogacion);
    }
    public void selecErogacion() {
        this.clickElement(selectErogacion);
    }
    public void pretension() {
        this.clickElement(presentiones);
    }
    public void selecPretension() {
        this.clickElement(selectPresention);
    }
    public void unidad() {
        this.clickElement(unidades);
    }
    public void selectUnidad() {
        this.clickElement(selectUnidades);
    }
    public void selectValorPretension() {
        this.clickElement(valorPretension);
    }
    public void sendValorPretension(String value) {
        this.write(valorPretension, value);
    }
    public void adicionarPretension() {
        this.clickElement(adicionarPretension);
    }
    public void nextPestaña4() {
        this.clickElement(next4);
    }
    public void clicDateActuacion() {
        this.esperaExplicita(spinner);
        this.clickElement(dateActuacion);
    }
    public void selectDateActuacion() {
        this.clickElement(selectDateActuacion);
    }
    public void clicDateAudiencia() {
        this.clickElement(dateAudiencia);
    }
    public void selectDateAudiencia() {
        this.clickElement(selectDateAudiencia);
    }
    public void solicitudConciliacion() {
        this.clickElement(solicitud);
    }
    public void selectSolicitudConciliacion() {
        this.clickElement(selectSolicitud);
    }
    public void docSoportAdmi() {
        this.clickElement(docSoportAdmision);
        this.esperaExplicita(spinner);
    }
    public void clicObservacioAdmisi() {
        this.clickElement(observacionesAdmision);
    }
    public void sendObservaciAdmisi() {
        this.writeAndSubmit(observacionesAdmision, "OCURADURIA 1 DELEGADA ANTE EL CONSE");
    }
    public void clicFinalizar() {
        this.clickElement(finalizar);
    }
    public void clicFinalizarSi() {
        this.clickElement(buttonSi);
    }
    // Método para cerrar el modal de soporte
    public void closeModalSoporte() {
        WebElement closeModalButton = driver.findElement(By.xpath(buttonClose));
        scrollToElement(closeModalButton);  // Usa el método de BasePage para hacer scroll
        closeModalButton.click();  // Luego haces clic en el botón
    }
    public void textValidateConciliaciónCreada() {
        this.textValidate(activo);
    }
    public void textoEscritura(){
        this.esperaExplicita(spinner);
        this.valorTextoCaso();
        this.valorTextoEkogui();

    }
}

