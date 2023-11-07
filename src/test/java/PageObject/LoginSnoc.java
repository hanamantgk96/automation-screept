package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSnoc {
	
	public WebDriver driver;
//	WebDriver driver = new ChromeDriver();

	public LoginSnoc(WebDriver driver) {
		this.driver = driver;	
	}
		
	By phNum = By.xpath("//*[@id=\"username\"]");
	By passWord = By.xpath("//*[@id=\"password\"]");
	By login = By.xpath("/html/body/div/div/section/div/div[2]/div[1]/form/div[3]/div/input[4]");
	
	By clickdot= By.xpath("//*[@id=\"menu-toggle-button\"]/i");
	By clickDelivery = By.xpath("//*[@id=\"sidebar\"]/ul/li[7]/a/span");
	By clickSchedule = By.xpath("//*[@id=\"sidebar\"]/ul/li[7]/ul/li[1]/a/span");
	By creatDeliverySche = By.xpath("//*[@id=\"createMultiDeliveryScheduleByZone\"]");
	By clickPage = By.xpath("//input[@id='textPage_arrow']");
	By Click_NextPage = By.xpath("//div[@class='icon-angle-right bigger-143']");
	By click_past_farword_arrow = By.xpath("//*[@id=\"past_forward_arrow\"]");
	
	By drivers = By.xpath("//a[@class='accordion-toggle collapsed']/span/span");   //a[@class='accordion-toggle collapsed']/span/span //div[@class='accordion-style1 panel-group']
	By click_plusButton = By.xpath("//div[@class='panel-collapse in']//tbody//span[@class='ui-icon icon-plus ui-expand']"); //div[@class='panel-collapse in']//tbody//a[@href='javascript:void(0);'] //*[@id='1']/td[1]/a/span
	By select_checkBox = By.xpath("//tr[@class='ui-jqgrid-labels']//input[@type='checkbox']");
	   
	By click_next = By.xpath("//*[@id=\"wizardSave\"]");
	By click_driverbox = By.xpath("//*[@id=\"uname_34661\"]");//abhishek
	By selec_driver = By.xpath("//*[@id=\"uname_34661\"]/option[3]");
	By click_vehiclebox = By.xpath("//*[@id=\"vehicle_34661\"]");
	By select_vehicle = By.xpath("//*[@id=\"vehicle_34661\"]/option[11]");
	By click_finish = By.xpath("//*[@id=\"wizardSave\"]");
	By click_Ok = By.xpath("//*[text()=\"OK\"]");
	
	By otherDriBox = By.xpath("//*[@id=\"uname_0\"]");
	By selOtherDriver=By.xpath("//*[@id=\"uname_0\"]/option[6]");
	By clickvehicle =By.xpath("//*[@id=\"vehicle_0\"]");
	By selevehicle=By.xpath("//*[@id=\"vehicle_0\"]/option[6]");
	
	By yasudeen=By.xpath("//*[@id=\"uname_33883\"]");
	By seledriver=By.xpath("//*[@id=\"uname_33883\"]/option[10]");
	By clickvehicle2 =By.xpath("//*[@id=\"vehicle_33883\"]");
	By selevehicle2 =By.xpath("//*[@id=\"vehicle_33883\"]/option[2]");
	
	By Ryan =By.xpath("//*[@id=\"uname_34211\"]");
	By seledriver2=By.xpath("//*[@id=\"uname_34211\"]/option[7]");
	By clickRyvehicle=By.xpath("//*[@id=\"vehicle_34211\"]");
	By selvehicle =By.xpath("//*[@id=\"vehicle_34211\"]/option[3]");
	
    public void enterusername(String s1) {
		driver.findElement(phNum).sendKeys(s1);
	}

	public void enterpassword(String s2) {
		driver.findElement(passWord).sendKeys(s2);		
	}
	
	public void clickOnLoginButton() {
		driver.findElement(login).click();
	}
	
	public void ClickThreeDot() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(clickdot).click();
	}
	
	public void Clickorder() {
		driver.findElement(clickDelivery).click();
	}
	
	public void ClickvieworderOption() {
		driver.findElement(clickSchedule).click();
	}
	
	public void Click_Create_Delivery_Schedule() throws InterruptedException {		
		driver.findElement(creatDeliverySche).click();

		}
	public void dssd1() throws InterruptedException {
	    for (int page = 1; page <= 10; page++) {
	    	
	    	List<WebElement> elements = driver.findElements(drivers);
		    for (int i = 0; i < elements.size(); i++) {
		        WebElement element = elements.get(i);
		        String data = element.getText();
		        System.out.println("Fetched data: " + data);
		        double numericValue = Double.parseDouble(data);
		        
		        if (numericValue > 0) {
		            Thread.sleep(3000);
		            element.click();
		            System.out.println("Clicked on the element with data: " + data);

		            List<WebElement> plusButtons = driver.findElements(click_plusButton);
		            for (WebElement plusButton : plusButtons) {
		            	Thread.sleep(1000);
		                plusButton.click();

//		                WebElement checkbox = driver.findElement(select_checkBox);
		                Thread.sleep(3000);
		                List<WebElement> checkboxes = driver.findElements(select_checkBox);		               
		                for (WebElement checkbox : checkboxes) {		   
		                if (checkbox.isEnabled()) {
		                   Thread.sleep(2000);
	                	   checkbox.click();		         		                   
		                    System.out.println("Clicked on the checkbox");	
		                    
		                    JavascriptExecutor js1 = (JavascriptExecutor) driver;
                            js1.executeScript("arguments[0].scrollIntoView(true);", element);                            
		                } 
		                else {
		                    System.out.println("Checkbox is disabled, moving to the next item");
		                }
		            }
		        }
		    }			            
	    }
		    
		    WebElement pageElement = driver.findElement(Click_NextPage);
			pageElement.click();
			Thread.sleep(6000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            System.out.println("Scrolled down the page.");
	}
	    
  }
	public void click_next() {
		driver.findElement(click_next).click();
	}
//	//driver1
	public void click_driverbox() {
	driver.findElement(click_driverbox).click();
   }
    public void selec_driver() {
	driver.findElement(selec_driver).click();
  }
     public void click_vehiclebox() { 
	driver.findElement(click_vehiclebox).click();
  }
     public void select_vehicle() {
	driver.findElement(select_vehicle).click();
 }
     //Otherdriver2
     public void click_driverbox1() {
    		driver.findElement(otherDriBox).click();
    	}
    	    public void selec_driver1() {
    		driver.findElement(selOtherDriver).click();
    	}
    	     public void click_vehiclebox1() { 
    		driver.findElement(clickvehicle).click();
    	}
    	     public void select_vehicle1() {
    		driver.findElement(selevehicle).click();
    		
    	}  
         //Yasdriver3
    	     
    	     public void click_driverbox23() {
    	    		driver.findElement(yasudeen).click();
    	    	}
    	    	    public void selec_driver2() {
    	    		driver.findElement(seledriver).click();
    	    	}
    	    	     public void click_vehiclebox3() { 
    	    		driver.findElement(clickvehicle2).click();
    	    	}
    	    	     public void select_vehicle3() {
    	    		driver.findElement(selevehicle2).click();
    }	  
    	     //driver4  
    	    	     public void click_driverbox4() {
    	    	    		driver.findElement(Ryan).click();
    	    	    	}
    	    	    	    public void selec_driver4() {
    	    	    		driver.findElement(seledriver2).click();
    	    	    	}
    	    	    	     public void click_vehiclebox4() { 
    	    	    		driver.findElement(clickRyvehicle).click();
    	    	    	}
    	    	    	     public void select_vehicle4() {
    	    	    		driver.findElement(selvehicle).click();
    	  	     }
    public void click_finish() {
	driver.findElement(click_finish).click();
}
    public void click_Ok() {
	driver.findElement(click_Ok).click();
  }
}

	
/*//Nick Name wise we can create delivery schedule

	By click_select_fiter_box = By.xpath("//*[@id=\"data_filter_query\"]/div/div[1]/h4/a");
	By slect_Nick_Name_option = By.xpath("//*[@id=\"orderFiltrationType\"]/option[2]");
	By click_Go_Button = By.xpath("//*[@id=\"filterOrderedProductsListGrid\"]");
	
	public void click_select_fiter_box() {
		driver.findElement(click_select_fiter_box).click();
	}
	public void slect_Nick_Name_option() {
		driver.findElement(slect_Nick_Name_option).click();
	}
	public void click_Go_Button() {
		driver.findElement(click_Go_Button).click();
	}
//}

public void Nick_Name() throws InterruptedException {
  for (int page = 1; page <= 10; page++) {
	  
  	Thread.sleep(5000);
  	List<WebElement> elements = driver.findElements(drivers);
	    for (int i = 0; i < elements.size(); i++) {
	        WebElement element = elements.get(i);
	        String data = element.getText();
	        System.out.println("Fetched data: " + data);
	        double numericValue = Double.parseDouble(data);

	        if (numericValue > 0) {
	            Thread.sleep(3000);
	            element.click();
	            System.out.println("Clicked on the element with data: " + data);

	            List<WebElement> plusButtons = driver.findElements(click_plusButton);
	            for (WebElement plusButton : plusButtons) {
	            	Thread.sleep(2000);
	                plusButton.click();

//	                WebElement checkbox = driver.findElement(select_checkBox);
	                List<WebElement> checkboxes = driver.findElements(select_checkBox);		               
	                for (WebElement checkbox : checkboxes) {
	                if (checkbox.isEnabled()) {
	                   Thread.sleep(2000);
	                	checkbox.click();
	                    System.out.println("Clicked on the checkbox");

	                    JavascriptExecutor js = (JavascriptExecutor) driver;
                      js.executeScript("arguments[0].scrollIntoView(true);", element);
                      
	                } else {
	                    System.out.println("Checkbox is disabled, moving to the next item");
	                }
	            }
	        }
	    }
	  }      
	    WebElement pageElement = driver.findElement(Click_NextPage);
		pageElement.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      System.out.println("Scrolled down the page.");
  }
}
}*/

	
	