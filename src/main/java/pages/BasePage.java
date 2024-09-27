package pages;
// Importaciones necesarias para el funcionamiento de Selenium y la configuración del WebDriver.
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

// Definición de la clase BasePage
public class BasePage {
    // Definición de variables protegidas para WebDriver, WebDriverWait y Actions
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    // Constructor de la clase BasePage que inicializa las variables con el WebDriver pasado como argumento
    public BasePage(WebDriver driver) {
        // Asigna el WebDriver recibido al campo 'driver' de la clase
        this.driver = driver;
        // Inicializa WebDriverWait con un tiempo de espera de 30 segundos
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Inicializa Actions para realizar acciones avanzadas del usuario
        this.actions = new Actions(driver);
        // Inicializa los elementos de la página usando PageFactory
        PageFactory.initElements(driver, this);
        // Maximiza la ventana del navegador
        driver.manage().window().maximize();
    }
    // Método estático que inicializa y configura el WebDriver
    public static WebDriver initializeDriver() {
        // Configura las opciones para el navegador Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        // Utiliza WebDriverManager para configurar el controlador de Chrome automáticamente
        WebDriverManager.chromedriver().setup();
        // Retorna una nueva instancia de ChromeDriver con las opciones configuradas
        return new ChromeDriver(chromeOptions);
    }

    // Método que navega a la URL especificada usando el WebDriver
    public void navigateTo(String url) {
        driver.get(url);
    }
    public void closeBrowser() {
        driver.quit();
    }
    public String numeroAleatorio() {
        // Generar número aleatorio de 7 dígitos
        Random random = new Random();
        int numeroAleatorio = 1000000 + random.nextInt(9000000); // Rango de 7 dígitos: 1000000 a 9999999
        return String.valueOf(numeroAleatorio); // Retorna el número como String
    }
    private WebElement find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    private WebElement findCss(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public void clickElement(String locator) {
        find(locator).click();
    }
    public void clickElementCss(String locator) {
        findCss(locator).click();
    }

    public Boolean textValidate(String locator) {
        return find(locator).isDisplayed();
    }

    public void write(String locator, String texto) {
        find(locator).sendKeys(texto);
    }
    public void selectDropdownOption(String locator, String value) {
        WebElement dropdown = find(locator);
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }
    public void writeAndSubmit(String locator, String texto) {
        WebElement element = find(locator);
        element.sendKeys(texto);
        element.sendKeys(Keys.ENTER);
    }
    // Método para hacer scroll hasta un elemento
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

