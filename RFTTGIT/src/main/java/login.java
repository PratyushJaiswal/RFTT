import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import config.constansts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.*;

public class login extends OpenBrowser{
@Test
public login() throws IOException{
	FileInputStream fis = new FileInputStream(constansts.Path_OR);
	  Properties p = new Properties();
	  p.load(fis);
	  
	driver.findElement(By.xpath(p.getProperty("Login_Email_Address"))).sendKeys("daniel@yopmail.com");
	driver.findElement(By.xpath(p.getProperty("Login_Password")));
}
}
