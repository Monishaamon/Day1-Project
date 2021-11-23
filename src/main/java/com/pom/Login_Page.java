package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement login;

	@FindBy(xpath = "(//a[text()='Dresses'])[2]")
	private WebElement dresses;

	@FindBy(xpath = "(//a[text()='Casual Dresses'])[4]")
	private WebElement casualDresses;

	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement model;

	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addToCart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed_1;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed_2;

	@FindBy(name = "processAddress")
	private WebElement proceed_3;

	@FindBy(name = "cgv")
	private WebElement checkbox;

	@FindBy(name = "processCarrier")
	private WebElement proceed_4;

	@FindBy(className = "bankwire")
	private WebElement pay;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirmOrder;

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement back;

	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(className = "logout")
	private WebElement signout;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSignin() {
		return signin;
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

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCasualDresses() {
		return casualDresses;
	}

	public WebElement getModel() {
		return model;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getProceed_1() {
		return proceed_1;
	}

	public WebElement getProceed_2() {
		return proceed_2;
	}

	public WebElement getProceed_3() {
		return proceed_3;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed_4() {
		return proceed_4;
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public WebElement getBack() {
		return back;
	}

	public WebElement getHome() {
		return home;
	}
	
	public WebElement getSignout() {
		return signout;
	}

}
