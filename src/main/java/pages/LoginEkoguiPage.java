package pages;

import org.openqa.selenium.WebDriver;

public class LoginEkoguiPage extends BasePage {

    String selectTipoDoc = "//select[@id='tipoDoc']";
    String element1 = "//input[@id='document-number']";
    String element2 = "//input[@id='password']";
    String element3 = "//button[@id='send']";
    String element4 = "//div[contains(text(),'FISCALIA GENERAL DE LA NACION')]";

    public LoginEkoguiPage(WebDriver driver) {
        super(driver);
    }
    public void navigateToEkogui() {
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
    public void clickSubmit(){
        this.clickElement(element3);
    }
    public void textValidate(){
        this.textValidate(element4);
    }
    public void closessBrowser(){
        this.closeBrowser();
    }

}
