package StepDefinition;

import org.testng.Assert;

import PageObject.LoginSnoc;
import Utils.Setuptest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSnocStepdefinition {
	
	public Setuptest testsetup;

	public LoginSnocStepdefinition(Setuptest testSetup) {
		this.testsetup = testSetup;
	}

	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
	}

	@When("^Login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		s1.enterusername(strArg1);
		s1.enterpassword(strArg2);
		Thread.sleep(2000);
		s1.clickOnLoginButton();
		System.out.println("loged in successfully");
	}

	@Then("^Verify the login is successful$")
	public void verify_the_login_is_successful() throws Throwable {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
	}
	
	@Given("Click dot symbol")
	public void click_dot_symbol() throws InterruptedException {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		s1.ClickThreeDot();
	}

	@When("click on order option")
	public void click_on_order_option() {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		s1.Clickorder();
	}
	
	@When("click on View Order Option")
	public void click_on_view_order_option() throws InterruptedException {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		Thread.sleep(2000);
		s1.ClickvieworderOption();
		Thread.sleep(2000);
		s1.Click_Create_Delivery_Schedule();
		Thread.sleep(5000);
		s1.dssd1();
		Thread.sleep(5000);
		
		s1.click_next();
		Thread.sleep(2000);
	
		//driver2
		s1.click_driverbox1();
		Thread.sleep(2000);
		s1.selec_driver1();
		Thread.sleep(2000);
		s1.click_vehiclebox1();
		Thread.sleep(2000);
		s1.select_vehicle1();
		//driver3
		Thread.sleep(3000);
		s1.click_driverbox23();
		Thread.sleep(3000);
		s1.selec_driver2();
		Thread.sleep(2000);
		s1.click_vehiclebox3();
		Thread.sleep(2000);
		s1.select_vehicle3();
		
		//driver4
		Thread.sleep(3000);
		s1.click_driverbox4();
		Thread.sleep(2000);
		s1.selec_driver4();
		Thread.sleep(2000);
		s1.click_vehiclebox4();
		Thread.sleep(2000);
		s1.select_vehicle4();
	//driver1
		s1.click_driverbox();
		Thread.sleep(2000);
		s1.selec_driver();
		Thread.sleep(2000);
		s1.click_vehiclebox();
		Thread.sleep(2000);
		s1.select_vehicle();
		
		Thread.sleep(2000);
		s1.click_finish();
		Thread.sleep(2000);
		s1.click_Ok();
		Thread.sleep(3000);
		s1.click_Ok();
	}
}

		
		
/*//nickname wise we can create
		s1.click_select_fiter_box();
		Thread.sleep(2000);
		s1.slect_Nick_Name_option();
		Thread.sleep(2000);
		s1.click_Go_Button();
		Thread.sleep(8000);
		s1.Nick_Name();
		Thread.sleep(5000);
		s1.click_next();
		
		
}
}*/



