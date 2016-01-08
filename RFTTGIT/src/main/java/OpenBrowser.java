import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class OpenBrowser {
@BeforeSuite
public void openBrowser(){
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	String baseURL = "https://testrtt.softwaydev.com/version_8/";
	driver.get(baseURL );
}
@AfterSuite
public void closeBrowser(){
	
}

}
