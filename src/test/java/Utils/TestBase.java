package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\Resources\\global.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("qa");
		
		if (driver == null) {
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\Resources\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			}
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			}
		}
		return driver;
			}
		
				

}
