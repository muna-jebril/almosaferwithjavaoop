package HomePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HomePageTestCases extends Parameters {

	
	@BeforeTest()
	public void mysetup() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(URL);
		
	WebElement popupmsg = driver.findElement(By.cssSelector(".sc-jvEmr.kQyrfP"));
	if(popupmsg.isDisplayed()) {
	WebElement	Sarbutton= driver.findElement(By.cssSelector("button[class='sc-jTzLTM hQpNle cta__button cta__saudi btn btn-primary']"));
	Sarbutton.click();
		}
	
	}
	
	
	
	@Test()
	public void CheckDefaultLangusage() {
		
	 String acutallang=	driver.findElement(By.tagName("html")).getAttribute("lang");
myassert.assertEquals(acutallang,expectedlang);	 
		
		
	}	
	
	
	
	@Test()
	
	public void CheckDefaultCurrency() {
		
		
	 String acutalCurrency=	driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']\r\n"
				+ "")).getText();
		
		myassert.assertEquals(acutalCurrency,ExprectedCurrency);
		
	}
@Test()
	
	public void CheckContactNumber() {
		
		
	 String acutalNumber= driver.findElement(By.tagName("strong")).getText();
		
		myassert.assertEquals(acutalNumber,ExpectedNumber);
		
	}
	
	
}
