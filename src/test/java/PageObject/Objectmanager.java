package PageObject;

import org.openqa.selenium.WebDriver;

public class Objectmanager {
	
public WebDriver driver;
	
	public LoginSnoc loginPage;
	public RejectOrderItems order;
	
	public Objectmanager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginSnoc getLoginPage() {
		loginPage = new LoginSnoc(driver);
		return loginPage;
	}
	
	public RejectOrderItems getorder() {
		order = new RejectOrderItems(driver);
		return order;
	}


}
