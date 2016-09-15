package br.edu.sr.ifes.bdd.teste;

/**
 * Created by paulo on 22/02/15.
 */


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty", snippets = SnippetType.CAMELCASE, features="src/test/resources")
public class BDDTest {


}
