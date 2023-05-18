package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectclasss {
	WebDriver d;
	public objectclasss(WebDriver d)
	{
		d=this.d;
		PageFactory.initElements(d, this);
	}
@FindBy(xpath="//*[@id=\"open\"]")WebElement openaccount;

public void openaccount()
{
	openaccount.click();
}

	
}
