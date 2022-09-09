package metodo;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import factory.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void scroll(int n1, int n2) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(" + n1 + ", " + n2 + ")");
	}

	public void validarTexto(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertTrue(textoEsperado == texto);
	}

	public void evidencia(String nome) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./src/evidencias/" + nome + ".png");

			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			System.err.println("-----ERRO AO TIRAR EVIDENCIA-----");
			e.printStackTrace();
		}

	}

	public void espera(By elemento) {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	public void fechar() {
		driver.quit();
	}

}
