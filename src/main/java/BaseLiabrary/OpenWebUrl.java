package BaseLiabrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectTesting.LandingPage;

public class OpenWebUrl 
{
	
	public static WebDriver driver;
	
	  
      public static void launchUrl() 
   
   {
	
	   driver = new ChromeDriver();
	   
	   driver.get("https://www.amazon.in/");
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  
	  
   }
      
      
}
