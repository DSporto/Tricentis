package pagess;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl, String descricaoPasso) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void digitar(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void click(By elemento) {
		driver.findElement(elemento).click();
	}

	

	public void fecharBrowser(String close) {

		driver.quit();
	}


	public void espera(By elementos) {

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	public void validarTexto(String textoEsperado, By elementos) {
		
		String texto = driver.findElement(elementos).getText();
		assertTrue(textoEsperado == texto);
	}

	
}