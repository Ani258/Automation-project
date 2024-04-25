package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignPF {

	@FindBy(css="button[id='wzrk-cancel']") WebElement nt;
	@FindBy(css="span[class='icon-ic_account']") WebElement popup;	
	@FindBy(css="input[type='tel']") WebElement mb;
	@FindBy(xpath="//span[@class='MuiFab-label']") WebElement ar;
	@FindBy(xpath="//span[@class='icon-ic_arrow_forward']") WebElement af;
	
	@FindBy(xpath="//input[@name='firstName']") WebElement fn;
	@FindBy(xpath="//input[@name='lastName']") WebElement ln;
	@FindBy(xpath="//input[@placeholder='dd/mm/yyyy']") WebElement dob;
	@FindBy(xpath="//button[@value='FEMALE']") WebElement gender;
	@FindBy(name="emailAddress") WebElement email;
	@FindBy(xpath="//input[@placeholder='Enter Referral Code']") WebElement rc;
	@FindBy(xpath="//button[@type='submit']") WebElement sub;
	 
public void nt() {
	
	nt.click();
}
public void popup() {
	 popup.click();
}
public void mb() {
	 mb.sendKeys("7339044883");
}
public void ar() {
	 ar.click(); 
}
public void af() {
	 af.click();
}
public void fn() {
	fn.sendKeys("Ani");
}
public void ln() {
	ln.sendKeys("cg");
}
public void dob() {
	dob.sendKeys("01022000");
}
public void gender() {
	gender.click();
}
public void email() {
	email.sendKeys("abc@gmail.com");
}
public void rc() {
	rc.sendKeys("23456");
}
public void sub() {
	sub.click();
}
}












	
		

	


