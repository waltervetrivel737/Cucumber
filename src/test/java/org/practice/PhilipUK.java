package org.practice;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilis.BaseClass;

public class PhilipUK extends BaseClass {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		tolaunch();
		loadurl("https://www.facebook.com/");
		tomax();
		towait();
		String v = toDataBase("select employee_id from employees", 1);
		WebElement user = dri.findElement(By.id("email"));
		totype(user, v);
		
		
	}
	

}
