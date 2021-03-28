package org.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.pom.CheckoutPage;
import org.pom.PomManager;
import org.pom.TimpsonLgnpojo;
import org.pom.Zaccesspojo;
import org.pom.Zippolightrspojo;
import org.utilis.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExecutableClass extends BaseClass {

	PomManager p;
	TimpsonLgnpojo l;
	Zippolightrspojo zipp;
	Zaccesspojo zacc;
	CheckoutPage ck;

	@Given("User is in Timpson page")
	public void user_is_in_Timpson_page() {
		loadurl("https://www.timpson.co.uk/");
	}

	@When("User enters valid emailId & password and clicks login")
	public void user_enters_valid_emailId_password_and_clicks_login(io.cucumber.datatable.DataTable dt) {
		p = PomManager.getPm();
		l = p.getL();
		
		List<String> li = dt.asList();
		moveto(l.getMyAcc());
		toclick(l.getLoinbtn());
		String eml = li.get(0);
		String pass = li.get(1);
		totype(l.getEmladds(), eml);
		totype(l.getPass(), pass);
		toclick(l.getLinbtn2());

	}

	@When("User searchs Zippo Lighters and add to cart")
	public void user_searchs_Zippo_Lighters_and_add_to_cart() throws AWTException {
		zipp = p.getZipp();
		totype(l.getSearchbox().get(1), "Zippo Lighters");
		pressEnter();
		toclick(zipp.getP1());
		toclick(zipp.getTobasket());
	}

	@When("User searchs Zippo Accessories and add to cart")
	public void user_searchs_Zippo_Accessories_and_add_to_cart() throws AWTException {
		zacc = p.getZacc();
		totype(l.getSearchbox().get(1), "Zippo Accessories");
		pressEnter();
		toclick(zacc.getWick());
		toclick(zacc.getAddkart());
	}

	@When("User gives add to cart")
	public void user_gives_add_to_cart() {
		moveto(l.getMybasket());
		toclick(l.getCheckout().get(0));
	}
	@When("User enters personal detials")
	public void user_enters_personal_detials() throws IOException {
		ck = p.getCk();
		String addrs = fetchSingleExcell("C:\\Users\\PROBOOK\\eclipse-workspace\\GIT PROJTS\\SampleGit\\Excell\\CUCU.xlsx", "Sheet1", 1, 5);
		totype(ck.getAddress(), addrs);
		String city = fetchSingleExcell("C:\\Users\\PROBOOK\\eclipse-workspace\\GIT PROJTS\\SampleGit\\Excell\\CUCU.xlsx", "Sheet1", 1, 6);
		totype(ck.getCity(), city);
		String pin = fetchSingleExcell("C:\\Users\\PROBOOK\\eclipse-workspace\\GIT PROJTS\\SampleGit\\Excell\\CUCU.xlsx", "Sheet1", 1, 7);
		totype(ck.getZip(), pin);
		String phno = fetchSingleExcell("C:\\Users\\PROBOOK\\eclipse-workspace\\GIT PROJTS\\SampleGit\\Excell\\CUCU.xlsx", "Sheet1", 1, 4);
		totype(ck.getPhno(), phno);
		toclick(ck.getContinu());
	}

	@Then("User displyed with Payment Detials")
	public void user_displyed_with_Payment_Detials() {
		System.out.println("succes");
	}

}
