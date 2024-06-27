package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLiabrary.OpenWebUrl;

public class OpenWeb_Page extends OpenWebUrl {
	
	WebDriver driver;
	 public OpenWeb_Page(WebDriver driver)
	{
		 this.driver=driver;
		
		 PageFactory.initElements(driver, this);
		 	
	}
	 
	 
	 @FindBy(id="nav_cs_fashion")
	  WebElement fasion;
	 
	 public void clickOnFasion()
	 {
		 fasion.click();
		   
	 }

}
