package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RejectOrderItems {
	
	public WebDriver driver;

	public RejectOrderItems(WebDriver driver) {
		this.driver = driver;	
	}
	// Already generated invoice orders 
	    By clickmoreoption = By.xpath("//*[@id=\"2\"]/td[17]/div/button");
	    By clickRejectorder = By.xpath("//*[@id=\"2\"]/td[17]/div/ul/li[11]");
	    By clickcheckbox = By.xpath("//input[@name=\"jqg_list_order_edit_grid_1\"]");
	    By enetrqty = By.xpath("//input[@name=\"rej_prd_qty\"]");
	    By clickreasonbox = By.xpath("//*[@id=\"1_rej_reasons\"]");
	    By selectreason = By.xpath("//*[@id=\"1_rej_reasons\"]/option[3]");
	    By clickactiontype = By.xpath("//*[@id=\"1_rej_type\"]");
	    By re_stock = By.xpath("//*[@id=\"1_rej_type\"]/option[2]");
	    By givecomment = By.xpath("//*[@id=\"1_rej_comment\"]");
	    
	    public void clickmoreoption() {
	    	driver.findElement(clickmoreoption).click();
	    	}
	    	
//	    	public String Expectedpopupvalidation() throws InterruptedException {
//	    		Thread.sleep(3000);
//	    		String actualName=driver.findElement(popup).getText();
//	    		return actualName;
//	    	}	
	    		
	    	public void clickRejectorderItems() {
	    		driver.findElement(clickRejectorder).click(); 
	    	} 
	    	
	    	public void clickcheckbox() {
	    		driver.findElement(clickcheckbox).click(); 
	    	}
	    	
	    	public void enetrqty() {
	    		driver.findElement(enetrqty).sendKeys("1");
	    	}
	    	
	    	public void clickreasonbox() {
	    		driver.findElement(clickreasonbox).click(); 
	    	}
	    	
	    	public void selectreason() {
	    		driver.findElement(selectreason).click(); 
	    	}
	    	
	    	public void clickactiontype() {
	    		driver.findElement(clickactiontype).click(); 
	    	}
	    	
	    	public void selectactiontype() {
	    		driver.findElement(re_stock).click(); 
	    	}
	    	
	    	public void givesomecomment() {
	    		driver.findElement(givecomment).sendKeys("Test");
	    	}
}
