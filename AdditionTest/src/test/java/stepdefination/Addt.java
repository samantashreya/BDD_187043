package stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class Addt {
	@Given("^I want to verify (\\d+) plus (\\d+) equals (\\d+)$")
	public void i_want_to_verify_plus_equals(int a, int b, int c) throws Throwable {
	    if((a+b)==c) {
	    	System.out.println("Matches");
	    }
	    else {
	    	System.err.println("Not Matches");
	    }
	    throw new PendingException();
	}


}
