package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class CheckoutPage extends BaseClass {
	public CheckoutPage() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="billing:street1")
	private WebElement address;
	
	@FindBy(id="billing:city")
	private WebElement city;
	
	@FindBy(id="billing:postcode")
	private WebElement zip;
	
	@FindBy(id="billing:country_id")
	private WebElement contry;
	
	@FindBy(id="billing:telephone")
	private WebElement phno;
	
	@FindBy(xpath="//button[@onclick='billing.save()']")
	private WebElement continu;

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getContry() {
		return contry;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getContinu() {
		return continu;
	}
	
	
	
}
