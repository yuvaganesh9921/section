package fb.stepdefnition;

import baseclass.Base_Class_Ipt2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Pom;

public class stepclass extends Base_Class_Ipt2{
	Pom obj = new Pom(driver);
	@Given("user launch browser")
	public void user_launch_browser() {
	   browser_Launch();
	    
	}
	@Given("go to url")
	public void go_to_url() {
	   get("https://www.facebook.com/");
	    
	}
	@When("fb creat account")
	public void fb_creat_account() throws InterruptedException {
		ThreadSleepForSecond(5);
	 select(obj.getForm_Fill().create);
	 
	    
	}
	@When("fullname fb account")
	public void fullname_fb_account() throws InterruptedException {
		ThreadSleepForSecond(5);
	   elementSendKeys(obj.getForm_Fill().fullname, "YuvaGanesh");
	    
	}
	@When("sunname fb accoud")
	public void sunname_fb_accoud() throws InterruptedException {
		ThreadSleepForSecond(5);
		elementSendKeys(obj.getForm_Fill().lastname, "Shiva");
	    
	}
	@Then("mobile number otherwise email")
	public void mobile_number_otherwise_email() throws InterruptedException {
		ThreadSleepForSecond(5);
		elementSendKeys(obj.getForm_Fill().mobilenumber,"654379657");
	    
	}
	@Then("creat password")
	public void creat_password() throws InterruptedException {
		ThreadSleepForSecond(5);
	   elementSendKeys(obj.getForm_Fill().password, "Ambika@9086");
	    
	}
	@Then("data fb account")
	public void data_fb_account() throws InterruptedException {
		ThreadSleepForSecond(5);
		SelectDropdown(obj.getForm_Fill().date, "value", "8");
	    
	}
	@Then("month fb account")
	public void month_fb_account() throws InterruptedException {
		ThreadSleepForSecond(5);
		SelectDropdown(obj.getForm_Fill().month, "value", "9");
	    
	}
	@Then("Year fb account")
	public void year_fb_account() throws InterruptedException {
		ThreadSleepForSecond(5);
		SelectDropdown(obj.getForm_Fill().year, "value", "1996");
	    
	}
	@Then("gender fb account")
	public void gender_fb_account() throws InterruptedException {
		ThreadSleepForSecond(5);
		select(obj.getForm_Fill().gender);
	    
	}
	@Then("click fb button")
	public void click_fb_button() throws InterruptedException {
		ThreadSleepForSecond(5);
		select(obj.getForm_Fill().singin);
	    
	}

}
