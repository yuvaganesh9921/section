package pom;

import org.openqa.selenium.WebDriver;

import baseclass.Base_Class_Ipt2;

public class Pom extends Base_Class_Ipt2 {
 public Pom(WebDriver xdriver) {
	 this.driver=xdriver;
	 
}

public locator.Form_Fill getForm_Fill() {
	if(Form_Fill==null) {
		Form_Fill= new locator.Form_Fill(driver);
	}
	return Form_Fill;
}

private locator.Form_Fill Form_Fill;
}
