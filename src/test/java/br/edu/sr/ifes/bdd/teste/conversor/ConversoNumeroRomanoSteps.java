package br.edu.sr.ifes.bdd.teste.conversor;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import br.edu.sr.ifes.bdd.ConversorNumeroRomano;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConversoNumeroRomanoSteps {
	
	private String numeroRomano = "";
	private int resultado;
	
	@Given("^Eu tenho o número \"(.*?)\"$")
	public void euTenhoONúmero(String numero) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.numeroRomano = numero;
	}

	@When("^Eu quero converter para um número natural$")
	public void euQueroConverterParaUmNúmeroNatural() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    resultado = ConversorNumeroRomano.converter(numeroRomano);
	}

	@Then("^Eu tenho o número (\\d+) com resultado$")
	public void euTenhoONúmeroComResultado(int resultadoEsperado) throws Throwable {
		assertThat(resultado, is(resultadoEsperado));
	    
	}

}
