package steps;

import elemento.Elementos;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodo.Metodos;
import runner.Executa;

public class Steps {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
		
	}
	
	@Given("que eu esteja no site da codesh")
	public void queEuEstejaNoSiteDaCodesh() {
		metodo.clicar(el.getBotaoOk());
		
	}

	@When("visualizar a pagina inicial do site")
	public void visualizarAPaginaInicialDoSite() {
		metodo.clicar(el.getVerificacao());
		
	}

	@Then("valido home page")
	public void validoHomePage() {
		
		metodo.evidencia("Home Page");
		metodo.fechar();
		

	}

	@When("seleciono opcao ver vagas")
	public void selecionoOpcaoVerVagas() {
		metodo.clicar(el.getBotaoOk());
		metodo.clicar(el.getVerVagas());
		

	}

	@Then("visualizo pagina de vagas")
	public void visualizoPaginaDeVagas() {
		metodo.espera(el.getBuscar());
		metodo.evidencia("PAGINA VAGAS");
		metodo.espera(el.getBuscar());
		metodo.fechar();

	}

	@Given("eu esteja no site da codesh")
	public void euEstejaNoSiteDaCodesh() {
		metodo.clicar(el.getBotaoOk());
		
		
		
	}

	@When("seleciono opcao vagas")
	public void selecionoOpcaoVagas() {
		metodo.clicar(el.getVerVagas());

	}

	@When("digito uma empresa no campo pesquisa")
	public void digitoUmaEmpresaNoCampoPesquisa() {
		metodo.espera(el.getEmpresa());
		metodo.escrever("Pague Seguro", el.getEmpresa());
		

	}

	@When("clico na opcao buscar")
	public void clicoNaOpcaoBuscar() {
		metodo.espera(el.getBuscar());
		metodo.clicar(el.getBuscar());

	}

	@Then("visualizo informacoes sobre empresa e vaga")
	public void visualizoInformacoesSobreEmpresaEVaga() {
		metodo.espera(el.getAbrirvaga());
		metodo.evidencia("Empresa");
		metodo.fechar();

	}
  
	@When("clico em ver vaga")
	public void clicoEmVerVaga() {
		metodo.clicar(el.getBotaoOk());
		metodo.clicar(el.getVerVagas());
		metodo.espera(el.getEmpresa());
		metodo.escrever("Pague Seguro", el.getBuscar());
		metodo.espera(el.getAbrirvaga());
		metodo.clicar(el.getAbrirvaga());
		metodo.espera(el.getCandidatar());
		

	}

	@Then("vizualizo informacoes sobre empresa e vaga")
	public void vizualizoInformacoesSobreEmpresaEVaga() {
		metodo.evidencia("Candidatar-se");
		metodo.fechar();
	}

}