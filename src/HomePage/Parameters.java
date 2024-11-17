package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {
WebDriver driver = new ChromeDriver();
String URL = "https://www.almosafer.com/en";
String expectedlang="en";
Assertion myassert = new Assertion();
String ExprectedCurrency="SAR";
String ExpectedNumber= "+966554400000";

}
