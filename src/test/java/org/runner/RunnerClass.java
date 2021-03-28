package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilis.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\PROBOOK\\eclipse-workspace\\GIT PROJTS\\SampleGit\\FeatureFile", glue = "org.stepdefinition", plugin = {
		"pretty",
		"json:C:\\Users\\PROBOOK\\eclipse-workspace\\GIT PROJTS\\SampleGit\\Reports\\Timpson.json", }, dryRun = false, monochrome = true, strict = true, tags = "@Smoke")
public class RunnerClass {

	@AfterClass
	public static void report() {
		JvmReports.togenrtJvmreport(
				"C:\\Users\\PROBOOK\\eclipse-workspace\\GIT PROJTS\\SampleGit\\Reports\\Timpson.json");

	}
}
