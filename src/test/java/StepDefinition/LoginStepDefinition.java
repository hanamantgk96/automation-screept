package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import Utils.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {	
//public	 WebDriver driver;
	 
 public TestSetup testsetup;
 	
	public LoginStepDefinition(TestSetup testsetup) {
		this.testsetup = testsetup;
		
	}
	
	@Given("^Launch the browser$")
    public void launch_the_browser() throws Throwable {
		 System.out.println("Launch the browser");
		 Thread.sleep(6000);
    }

	@When("^Login with PhoneNumber \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void login_with_phonenumber_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	 LoginPage loginPage = testsetup.objectmanager.getLoginPageObject();
    	 Thread.sleep(4000);
		 loginPage.enterphNum(strArg1);
		 Thread.sleep(4000);
		 loginPage.enterPassword(strArg2);
		 Thread.sleep(3000);
		 loginPage.clickOnLoginButton();
    }

	 @Then("^Verify the Login is success$")
	    public void verify_the_login_is_success() throws Throwable {
    	System.out.println("login is success");
    }
	
	
}
