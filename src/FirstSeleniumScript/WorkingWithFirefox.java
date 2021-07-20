package FirstSeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefox {
	
	FirefoxDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\libs\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("http://qatechhub.com");
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	public void printYes()
	{
		String titlevalue="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		if(driver.getTitle().equals(titlevalue))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
			
		}
		System.out.println(driver.getTitle());
	}
	public static void main(String[] args) {
		WorkingWithFirefox wf=new WorkingWithFirefox();
		wf.invokeBrowser();
		wf.printYes();
		//wf.closeBrowser();
		
			//wf.printYes();
		}
		
		
	
}
