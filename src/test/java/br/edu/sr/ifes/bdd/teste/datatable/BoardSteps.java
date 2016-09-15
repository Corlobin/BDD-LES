package br.edu.sr.ifes.bdd.teste.datatable;

/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
 ***/


import cucumber.api.java.en.*;
import cucumber.api.DataTable;
import java.util.ArrayList;
import java.util.List;

public class BoardSteps {
    private List<List<String>> board;

    @Given("^a board like this:$")
    public void aBoardLikeThis(DataTable table) throws Throwable {
        this.board = new ArrayList<List<String>>();
        for (List<String> row : table.raw()) {
            this.board.add(new ArrayList<String>(row));
        }
    }

    @When("^player x plays in row (\\d+), column (\\d+)$")
    public void playerXPlaysInRowColumn(int row, int col) throws Throwable {
        board.get(row).set(col, "x");
    }

    @Then("^the board should look like this:$")
    public void theBoardShouldLookLikeThis(DataTable expectedTable) throws Throwable {
        expectedTable.diff(board);
    }
}
