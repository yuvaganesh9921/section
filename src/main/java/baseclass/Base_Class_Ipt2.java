package baseclass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_Ipt2 {
	static public WebDriver driver;
	static public void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvag\\New folder\\demo_sction\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	static public void browser_Launch1() {
		System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	static public void get(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("get url"+e.getMessage());
		}
	}
	public static boolean isdisplay(WebElement element) {
		boolean displayed= false;
		try {
	
		displayed = element.isDisplayed();
		System.out.println(displayed);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return displayed;
	}
	public static void elementSendKeys(WebElement element,String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
		System.out.println("Invalid username"+e.getMessage());
		}
	}
		
public static void select(WebElement element) {
	element.click();
}
public static void SelectDropdown(WebElement element, String option, String value) {
	Select sc=new Select(element);
	if (option.equals("value")) {
		sc.selectByValue(value);
	}else if (option.equals("text")) {
		sc.selectByVisibleText(value);
	}else if (option.equals("index")) {
		sc.selectByIndex(Integer.parseInt(value));
	}
	}


public static void ThreadSleepForSecond(int Sec) throws InterruptedException {
	TimeUnit.SECONDS.sleep(Sec);
}
public static void movetoElement(WebElement element) {
	try {
		waituntilElementVisibility(element);
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("connt move"+e.getMessage());

	}
}
public static void Window_Handle(String handle) {
	Set<String> windowHandles = driver.getWindowHandles();
	for (String id : windowHandles) {
		String Act_titile = driver.switchTo().window(id).getTitle();
		if (Act_titile.equals(handle)) {
			break;
		}
	}
}

private static void waituntilElementVisibility(WebElement element) {
	// TODO Auto-generated method stub
	
}
}
