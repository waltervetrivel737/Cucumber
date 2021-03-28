package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class Zippolightrspojo extends BaseClass{
	public Zippolightrspojo() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(xpath="//div[text()=' Zippo Accessories']")
	private WebElement Zasseris ;
	
	@FindBy(xpath="//div[text()=' Day Of The Dead Zippo Lighters']")
	private WebElement DoDzippo ;
	
	@FindBy(xpath="//div[text()=' Non Zippo Led Lighters']")
	private WebElement Nonziplighter;
	
	@FindBy(xpath="//div[text()=' Zippo Outdoor Line']")
	private WebElement ODlightrs;
	
	@FindBy(id="product-collection-image-3079")
	private WebElement p1;
	
	@FindBy(xpath="//span[text()='Add to Basket']")
	private WebElement tobasket;
	
	
	public WebElement getTobasket() {
		return tobasket;
	}

	public WebElement getP1() {
		return p1;
	}

	public WebElement getZasseris() {
		return Zasseris;
	}

	public WebElement getDoDzippo() {
		return DoDzippo;
	}

	public WebElement getNonziplighter() {
		return Nonziplighter;
	}

	public WebElement getODlightrs() {
		return ODlightrs;
	}
	
	
}
