package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class TimpsonLgnpojo extends BaseClass {
	public TimpsonLgnpojo() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(xpath="//div[@class='icon']")
	private List<WebElement> myAcc ;
	
	@FindBy(xpath="//a[text()='Create Account']")
	private WebElement crtAcc ;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement loutbtn ;

	public List<WebElement> getMyAcc() {
		return myAcc;
	}

	public WebElement getCrtAcc() {
		return crtAcc;
	}

	public WebElement getLoutbtn() {
		return loutbtn;
	}
	
	
	
	
//	
//	@FindBy()
//	private WebElement ;
//	
//	@FindBy()
//	private WebElement ;
//	
//	@FindBy()
//	private WebElement ;
//	
//	@FindBy()
//	private WebElement ;
	
	
}
