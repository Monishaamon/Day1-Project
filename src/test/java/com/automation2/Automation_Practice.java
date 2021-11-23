package com.automation2;

import com.automation.Base_Class;
import com.pom.Login_Page;

public class Automation_Practice extends Base_Class {

	public static void main(String[] args) {

		getbrowser("chrome");
		geturl("http://automationpractice.com/index.php");

		Login_Page l = new Login_Page(driver);

		click(l.getSignin());
		sendkeys(l.getUsername(), "shamoni033@gmail.com");
		sendkeys(l.getPassword(), "Master65#");
		click(l.getLogin());
		click(l.getDresses());
		click(l.getCasualDresses());
		actions(l.getModel(), "moveToElement");
		click(l.getAddToCart());
		click(l.getProceed_1());
		click(l.getProceed_2());
		click(l.getProceed_3());
		click(l.getCheckbox());
		click(l.getProceed_4());
		click(l.getPay());
		click(l.getConfirmOrder());
		click(l.getBack());
		click(l.getHome());
		click(l.getSignout());

	}

}
