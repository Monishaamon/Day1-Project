package com.automation;

import com.pom.Login_Page;

public class Automation_Practice extends Base_Class{
	
	public static void main(String[] args) {
	        
		    getbrowser("chrome");
			geturl("http://automationpractice.com/index.php");
			
			Login_Page l = new Login_Page(driver);
			
			click(l.getSignin());
			sendkeys(l.getUsername(), "shamoni033@gmail.com");
			sendkeys(l.getPassword(), "Master65#");
			click(l.getLogin());
			
		
		}

	}

