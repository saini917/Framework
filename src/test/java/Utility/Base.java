package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


//System.setProperty("webdriver.chrome.drive", "C://Users//deepak.saini//Downloads//chromedriver_win32//chromedriver.exe");
//System.setProperty("webdriver.chrome.driver", "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe");
//driver=new ChromeDriver();

public class Base {

	public static WebDriver driver;
	public static WebDriverManager manager;
	public static Properties prop;

	@SuppressWarnings("static-access")
	public static WebDriver getDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis =new FileInputStream("C://Users//deepak.saini//workspace//Hphds_27-04-2021//src//test//java//Utility//global.properties");
		prop.load(fis);
		
		manager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
