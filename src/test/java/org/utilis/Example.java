package org.utilis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Example extends BaseClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		tolaunch();
		loadurl("https://www.facebook.com/");
		WebElement user = dri.findElement(By.id("email"));
		String value = toDataBase("select*from employees", 0);
		totype(user, value);
	
	}
}
