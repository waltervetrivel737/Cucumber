package org.stepdefinition;

import java.io.IOException;

import org.utilis.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	@Before
	public void beforeexecution() {
		tolaunch();
		tomax();
		towait();
	}
	
	@After
	public void afterexecution() throws IOException {
		totakescreenshort("C:\\Users\\PROBOOK\\eclipse-workspace\\GIT PROJTS\\SampleGit\\Screenshort\\page.png");
		toclose();
	}
}
