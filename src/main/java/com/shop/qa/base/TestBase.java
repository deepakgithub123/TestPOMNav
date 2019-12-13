package  com.shop.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import  PageLayer.util.TestUtil;

public class TestBase{
	
public static WebDriver driver;
public static Properties prop;

public TestBase()
{
	try {
		prop=new Properties();
		FileInputStream ip= new FileInputStream("D:\\Sumit_Backup\\Automation\\Workspace\\TestPOMNav\\src\\main\\java\\com\\shop\\qa\\config\\config.properties");
		
//		FileInputStream ip= new FileInputStream("C:\\Users\\deepak.chamoli\\.jenkins\\TestPOMNav\\target\\classes\\com\\shop\\qa\\config\\config.properties");
		prop.load(ip);	 
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}

public static void initialize() {
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\Sumit_Backup\\Automation\\Workspace\\TestPOMNav\\src\\Browser\\chromedriver.exe");
		driver= new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepak.chamoli\\.jenkins\\TestPOMNav\\src\\Browser\\geckodriver.exe");
//		driver= new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
//		driver.manage().timeouts().pageLoadTimeout(TestUtil., arg1);
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

 	driver.get(prop.getProperty("url"));
		
	}
/*
	elseif(browserName.equals("firebox")) {
		System.setProperty("webdriver.gecko.driver", "D:\\Firefox\\geckodriver.exe");
		driver= new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
//		driver.manage().timeouts().pageLoadTimeout(TestUtil., arg1);
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

 	driver.get(prop.getProperty("url"));
		
	}
*/	
	
}

}
