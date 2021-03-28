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

	@FindBy(id="header-menu-account")
	private WebElement myAcc;
	
	@FindBy(xpath="//a[text()='Create Account']")
	private WebElement crtAcc ;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Loinbtn;
	
	@FindBy(id="email")
	private WebElement emladds;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(id="send2")
	private WebElement linbtn2;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement loutbtn ;
	
	@FindBy(id="search")
	private List<WebElement> searchbox;

	@FindBy(xpath="//h2[text()='Zippo Lighters']")
	private WebElement zippoLight ;
	
	@FindBy(xpath="//h2[text()='Key Cutting Online']")
	private WebElement Keycutting ;
	
	@FindBy(xpath="//h2[text()='Engraved Trophies']")
	private WebElement Trophs ;
	
	@FindBy(xpath="//h2[text()='Shoe care']")
	private WebElement shoecare ;
	
	@FindBy(id="header-menu-about")
	private WebElement Menu ;
	
	@FindBy(xpath="//a[text()='In-Store Services']")
	private WebElement Store ;
	
	@FindBy(id="header-menu-cart")
	private WebElement mybasket;
	
	@FindBy(xpath="//a[@title='Checkout']")
	private List<WebElement> checkout;
	
	
	public List<WebElement> getCheckout() {
		return checkout;
	}

	public WebElement getMybasket() {
		return mybasket;
	}

	public WebElement getMyAcc() {
		return myAcc;
	}

	public WebElement getCrtAcc() {
		return crtAcc;
	}

	public WebElement getLoutbtn() {
		return loutbtn;
	}

	public WebElement getZippoLight() {
		return zippoLight;
	}

	public WebElement getKeycutting() {
		return Keycutting;
	}

	public WebElement getTrophs() {
		return Trophs;
	}

	public WebElement getShoecare() {
		return shoecare;
	}

	public WebElement getMenu() {
		return Menu;
	}

	public WebElement getLoinbtn() {
		return Loinbtn;
	}

	public WebElement getStore() {
		return Store;
	}

	public WebElement getEmladds() {
		return emladds;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLinbtn2() {
		return linbtn2;
	}

	public List<WebElement> getSearchbox() {
		return searchbox;
	}
	
	
	
	
	
	
	
	
	
	
	
}
