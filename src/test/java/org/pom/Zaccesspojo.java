package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class Zaccesspojo extends BaseClass {
	public Zaccesspojo() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="product-collection-image-1032")
	private WebElement wick;
	
	@FindBy(xpath="//span[text()='Add to Basket']")
	private WebElement addkart;

	public WebElement getWick() {
		return wick;
	}

	public WebElement getAddkart() {
		return addkart;
	}
	
	
	
	
	
	
}
