package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base_Class_Ipt2;

public class Form_Fill extends Base_Class_Ipt2{
	public  Form_Fill(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	public WebElement create;
	@FindBy(name="firstname")
	public WebElement fullname;
	@FindBy(name="lastname")
	public WebElement lastname;
	@FindBy(name="reg_email__")
	public WebElement mobilenumber;
	@FindBy(name="reg_passwd__")
	public WebElement password;
	@FindBy(name="birthday_day")
	public WebElement date;
	@FindBy(name="birthday_month")
	public WebElement month;
	@FindBy(name="birthday_year")
	public WebElement year;
	@FindBy(xpath = "//label[text()='Male']")
	public WebElement gender;
	@FindBy(name="websubmit")
	public WebElement singin;
	
}
