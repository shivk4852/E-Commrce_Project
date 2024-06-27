import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLiabrary.OpenWebUrl;
import PageObject.OpenWeb_Page;

public class FasionModule_Test extends OpenWebUrl
{
 @Test
  public void ClickOnFasionOption()
  {
	  
	  launchUrl();
	  OpenWeb_Page ob = new OpenWeb_Page(driver);
	  ob.clickOnFasion();
  }
}
