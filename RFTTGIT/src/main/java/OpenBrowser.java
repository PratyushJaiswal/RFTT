import config.constansts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class OpenBrowser {
	
	WebDriver driver ;
	
@BeforeSuite
public void openBrowser(){
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	//String baseURL = "https://testrtt.softwaydev.com/version_8/";
	driver.get(constansts.URL );
}
@AfterSuite
public void closeBrowser(){
	driver.quit();
}

}
