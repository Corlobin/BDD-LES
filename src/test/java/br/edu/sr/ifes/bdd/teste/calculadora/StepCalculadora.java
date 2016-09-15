package br.edu.sr.ifes.bdd.teste.calculadora;

/**
 * Created by paulo on 23/02/15.
 */

import br.edu.sr.ifes.bdd.teste.*;
import br.edu.sr.ifes.bdd.Belly;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StepCalculadora {
    
    private int resultado;
    private int numero1;
    private int numero2;
    
    @Given("^Eu tenho o numero (\\d+) e (\\d+)$")
    public void euTenhoONumeroE(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        numero1 = arg1;
        numero2 = arg2;
    }

    @When("^Eu realizo uma soma$")
    public void euRealizoUmaSoma() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        resultado = numero1 + numero2;
    }

    @Then("^eu tenho como resultado o (\\d+)$")
    public void euTenhoComoResultadoO(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertThat(resultado, is(arg1));
    }

    @When("^Eu realizo uma subtracao$")
    public void euRealizoUmaSubtracao() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        resultado = numero1 - numero2;
    }
   
    @When("^Eu realizo uma multiplicacao$")
    public void euRealizoUmaMultiplicacao() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        resultado = numero1 * numero2;
    }

    @When("^Eu realizo uma divisao$")
    public void euRealizoUmaDivisao() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        resultado = numero1 / numero2;
    }
}
