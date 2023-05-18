package Bank.America;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import configu.readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	readconfig r= new readconfig();
	public String url=r.openurl();
	public static WebDriver d;
	@BeforeTest
	public void browser()
	{
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.manage().window().maximize();
		//d.get(url);
	}
	
	

}
