package br.edu.sr.ifes.bdd.teste.outline;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import static org.junit.Assert.assertEquals;


/**
 * Created by paulo on 01/03/15.
 */
public class StepOutline {

    private int balance;
    private int withdraw;
    private int receive;

    @Given("^I have (\\d+) in my account$")
    public void theBalance(int balance) throws Throwable {

        this.balance = balance;

    }

    @When("^I choose to withdraw the fixed amount of (\\d+)$")
    public void theWithdraw(int withdraw) throws Throwable {
        this.withdraw = withdraw;
    }

    @Then("^I should receive (\\d+) cash$")
    public void theReceive(int receive) throws Throwable {
        this.receive = receive;

    }

    @And("^the balance of my account should be (\\d+)$")
    public void theBalanceAccount(int finalBalance) throws Throwable {
        int value = balance - receive;
        assertEquals(value,finalBalance);
    }
}
