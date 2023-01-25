package hook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.Base_Class_Ipt2;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hook extends Base_Class_Ipt2{
	@Before
	public void BefoeHooks() {
		System.out.println("Iam Start..");
	}
	@After
	public void AfterHooks(Scenario scenario) {
		System.out.println("hi");
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "screenshot");
		driver.close();
	}

}
