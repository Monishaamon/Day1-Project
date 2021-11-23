package com.test.adactin;

import com.automation.Base_Class;
import com.pom2.AdactinLogin;

public class AdactinHotel extends Base_Class {

	public static void main(String[] args) {

		getbrowser("chrome");
		geturl("https://adactinhotelapp.com/");

		AdactinLogin al = new AdactinLogin(driver);

		sendkeys(al.getUsername(), "Monishaanisha");
		sendkeys(al.getPassword(), "Vapas#9");
		click(al.getLogin());
		dropDown(al.getLocation(), "byValue", "Paris");
		dropDown(al.getHotel(), "byVisibleText", "Hotel Sunshine");
		dropDown(al.getRoomType(), "byIndex", "4");
		dropDown(al.getNoOfRooms(), "byindex", "2");
		clear(al.getCheckIn());
		clear(al.getCheckOut());
		sendkeys(al.getCheckIn(), "23/10/2021");
		sendkeys(al.getCheckOut(), "24/10/2021");
		dropDown(al.getAdults(), "byValue", "2");
		dropDown(al.getChildren(), "byVisibleText", "1 - One");
		click(al.getSearch());

		click(al.getSelect());
		click(al.getNext());

		sendkeys(al.getFirstName(), "Monisha");
		sendkeys(al.getLastName(), "Thanigachalam");
		sendkeys(al.getBillingAddress(), "No.2, XYZ Street,ABC Apartment,London-432009");
		sendkeys(al.getCreditCardNum(), "4572901863830957");
		dropDown(al.getCreditCartType(), "byValue", "MAST");
		dropDown(al.getExpiryMonth(), "byVisibleText", "March");
		dropDown(al.getExpiryYear(), "byindex", "12");
		sendkeys(al.getCcvNum(), "101");
		click(al.getBookNow());

		click(al.getLogout());

		close();

	}

}
