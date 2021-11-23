package com.pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin {

	public static WebDriver driver;

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;
	
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(xpath = "(//select[@name='room_nos'])")
	private WebElement noOfRooms;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement checkIn;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement checkOut;

	@FindBy(name = "adult_room")
	private WebElement adults;
	
	@FindBy(id = "child_room")
	private WebElement children;
	
	@FindBy(name = "Submit")
	private WebElement search;
	
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	
	@FindBy(name = "continue")
	private WebElement next;
	
	@FindBy(name = "first_name")
	private WebElement firstName;
	
	@FindBy(id = "last_name")
	private WebElement lastName;
	
	@FindBy(className = "txtarea")
	private WebElement billingAddress;
	
	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement creditCardNum;
	
	@FindBy(name = "cc_type")
	private WebElement creditCartType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(xpath = "(//input[@maxlength='4'])")
	private WebElement ccvNum;
	
	@FindBy(id = "book_now")
	private WebElement bookNow;
	
	@FindBy(id = "logout")
	private WebElement logout;
	
	public AdactinLogin(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getNext() {
		return next;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCreditCardNum() {
		return creditCardNum;
	}
	public WebElement getCreditCartType() {
		return creditCartType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCcvNum() {
		return ccvNum;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public WebElement getLogout() {
		return logout;
	}
	
}
