package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class DoDpojo extends BaseClass {
	public DoDpojo() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="product-collection-image-1046")
	private WebElement DoD;
	
	@FindBy(xpath="//span[text()='Add to Basket']")
	private WebElement addkatr;

	public WebElement getDoD() {
		return DoD;
	}

	public WebElement getAddkatr() {
		return addkatr;
	}
	
	
	
}
