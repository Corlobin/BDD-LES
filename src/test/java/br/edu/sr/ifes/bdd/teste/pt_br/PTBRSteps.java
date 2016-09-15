package br.edu.sr.ifes.bdd.teste.pt_br;

import br.edu.sr.ifes.bdd.Belly;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by paulo on 02/03/15.
 */
public class PTBRSteps {

    private Belly belly;
    private int waitingTime;

    @Dado("^Eu tenho (\\d+) pepinos na minha barriga$")
    public void i_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }

    @Quando("^Eu espero (\\d+) hora$")
    public void i_wait_hour(int waitingTime) throws Throwable {
        this.waitingTime = waitingTime;
    }

    @Então("^Minha barriga deve (.*)$")
    public void my_belly_should_growl(String expectedSound) throws Throwable {
        String actualSound = belly.getSound2(waitingTime);
        assertThat(actualSound, is(expectedSound));
    }
}
