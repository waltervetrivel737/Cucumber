package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class CreatAcc extends BaseClass {
	public CreatAcc() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="firstname")
	private WebElement Fname ;
	
	@FindBy(id="lastname")
	private WebElement Lname ;
	
	@FindBy(id="email_address")
	private WebElement Emladdrs ;
	
	@FindBy(id="password")
	private WebElement Pass;
	
	@FindBy(id="confirmation")
	private WebElement Cnfpass ;
	
	@FindBy(xpath="//span[text()='Register']")
	private WebElement Regstbtn;

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getEmladdrs() {
		return Emladdrs;
	}

	public WebElement getPass() {
		return Pass;
	}

	public WebElement getCnfpass() {
		return Cnfpass;
	}

	public WebElement getRegstbtn() {
		return Regstbtn;
	}
	
	
	
}
