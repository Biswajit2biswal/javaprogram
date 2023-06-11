package Testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configs.TestBase;

public class LoginPgae extends TestBase{
	
	private @FindBy(xpath ="//textarea[@id='APjFqb']") WebElement inputbox;
	
	
	
	public LoginPgae() {
		PageFactory.initElements(driver,this);
		
	}
	public void search() {
	inputbox.sendKeys("IPL");
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("ipl");
	}
	
	public static void main(String [] args)
	{
		initialization();
		
		LoginPgae l=new LoginPgae();
		
		l.search();
		
	}
	
}



