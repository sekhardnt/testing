package Bank.America;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pom.objectclasss;

public class register extends Baseclass {
	
	@Test
	public void openingurl()
	{
		d.get(url);
	}
	
	objectclasss o=new objectclasss(d);
	@Test
	public void Account() throws InterruptedException
	{
		//o.openaccount();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='open']")).click();
//		WebElement s=d.findElement(By.xpath("//*[@id='open']"));
//		s.click();
//		Actions a=new Actions(d);
//		a.doubleClick(s).perform();
	}

}
