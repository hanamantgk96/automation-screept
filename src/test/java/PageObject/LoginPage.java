package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By phNum = By.xpath("//*[@id=\"root\"]/div[2]/div/div/form/div[1]/div/input");  //div//input[@type='text']
	By PassWord = By.xpath("//*[@id=\"root\"]/div[2]/div/div/form/div[2]/div/input");  //div//input[@type='password']
	By login = By.xpath("//*[@id=\"root\"]/div[2]/div/div/form/div[4]/button");  //div//button[@class='button button-primary']
	
	public void enterphNum(String PhoneNumber) {
		driver.findElement(phNum).clear();
		driver.findElement(phNum).sendKeys(PhoneNumber);
	}
	public void enterPassword(String password) {
		driver.findElement(PassWord).clear();
		driver.findElement(PassWord).sendKeys(password);
		
	}
	public void clickOnLoginButton() {
		driver.findElement(login).click();
		
	
	}
	

}
