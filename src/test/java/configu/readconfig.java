package configu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readconfig {
	
	Properties p;
	public readconfig()  {
		
	
	//String src="C:\\Users\\sekhar\\eclipse-workspace\\WebDriver3\\America\\src\\test\\java\\configu\\c.properties";
		try {
		FileInputStream f= new FileInputStream("C:\\Users\\sekhar\\eclipse-workspace\\WebDriver3\\America\\src\\test\\java\\configu\\c.properties");
		p= new Properties();
		p.load(f);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
	public String openurl()
	{
		
		return p.getProperty("Url");
		
	}
}
