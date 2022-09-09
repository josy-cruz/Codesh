

@tag01
Feature: Como usuario no site codesh
				 Quero fazer uma pesquisa
				 Para visualizar vagas
				 
@nExecuta
  Scenario: Como usuario quero visualizar a tela inicial da aplicacao
    Given que eu esteja no site da codesh	
    When visualizar a pagina inicial do site
    Then valido home page
    
 
@nExecuta
    Scenario: Visualizar vagas
    Given que eu esteja no site da codesh	
    When seleciono opcao ver vagas
    Then visualizo pagina de vagas
    
    
@nExecuta
  Scenario: Buscar por uma vaga em determinada empresa
    Given eu esteja no site da codesh	
    When seleciono opcao vagas
    And digito uma empresa no campo pesquisa
    And clico na opcao buscar
    Then visualizo informacoes sobre empresa e vaga 
    
    

  Scenario: Vizualizar vaga especifica
    Given que eu esteja no site da codesh	
    When seleciono opcao vagas
    And digito uma empresa no campo pesquisa
    And clico na opcao buscar
    And clico em ver vaga
    Then vizualizo informacoes sobre empresa e vaga
    
    
    