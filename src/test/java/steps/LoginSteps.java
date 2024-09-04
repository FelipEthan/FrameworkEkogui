package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginEkoguiPage;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginEkoguiPage loginPage;

    public LoginSteps() {
        this.driver = BasePage.initializeDriver();
        this.loginPage = new LoginEkoguiPage(this.driver);
    }

    @Given("^El usuario está en la página de inicio de sesión$")
    public void navigateEkogui() {
        this.loginPage.navigateToEkogui();
    }

    @When("El usuario {string} y la contraseña {string}")
    public void enterData(String cedula, String contraseña) {
        this.loginPage.selectTipoDocumento("CC");
        this.loginPage.sendUser(cedula);
        this.loginPage.sendPass(contraseña);
    }

    @And("^El usuario hace clic en el botón de Entrar$")
    public void clickEntrar() {
        this.loginPage.clickSubmit();
    }

    @Then("^El usuario debe ser redirigido a Ekogui$")
    public void screenEkogui() {
        this.loginPage.textValidate();
    }


}
