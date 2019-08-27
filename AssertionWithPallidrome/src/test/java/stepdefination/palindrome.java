package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class palindrome {
	public String testPal;
	public boolean isPal;
	
	
	
	@Given("I entered string {string}")
	public void i_entered_string(String test ) {
		testPal= test;
	}

	
	
	@When("I test it for pallindrome")
	public void i_test_it_for_pallindrome() {
		 isPal=testPal.equalsIgnoreCase(new StringBuffer(testPal).reverse().toString());
	}

	@Then("the result should be {string}")
	public void the_result_should_be(String string) throws Throwable {
	   boolean estRes= Boolean.parseBoolean(string);
	   if(estRes) {
		   Assert.assertTrue(isPal);
	   }
	   else {
		   Assert.assertFalse(isPal);
	   }
	   
	}


}
