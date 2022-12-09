package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.PageObjectManager;

public class TestSetup {
	
	public  WebDriver driver;
	public PageObjectManager objectmanager;
	public TestBase testBase;
	
	public TestSetup() throws IOException {
		testBase = new TestBase();
		objectmanager = new PageObjectManager(testBase.webDriverManager());
		
	}
	

	
}
