package elemento;

import org.openqa.selenium.By;

public class Elementos {

	private By botaoOk = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
	private By verVagas = By.xpath("//*[@id=\"header-nav-bar\"]/ul/li[1]/a");
	private By buscar = By.xpath("//*[@id=\"content\"]/div/div[1]/form/div/div[3]/button");
	private By empresa = By.xpath("//*[@id=\"content\"]/div/div[1]/form/div/div[1]/div/input");
	private By abrirvaga = By.xpath("//*[@id=\"content\"]/div/div[3]/div[1]/a/div[1]/div[1]/div[1]/div[2]");
	private By candidatar = By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[2]/div/nav/div[2]/div[8]/div/button");
	private By verificacao = By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/h1");

	public By getBotaoOk() {
		return botaoOk;
	}

	public By getVerVagas() {
		return verVagas;
	}

	public By getBuscar() {
		return buscar;

	}

	public By getEmpresa() {
		return empresa;

	}

	public By getAbrirvaga() {
		return abrirvaga;
	}

	public By getCandidatar() {
		return candidatar;
	}
	
	public By getVerificacao() {
		return verificacao;
	}
}
