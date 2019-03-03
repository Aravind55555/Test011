package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPageObject extends BasePage {

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccNum;

	@FindBy(id = "cc_type")
	private WebElement ccType;

	@FindBy(id = "cc_exp_month")
	private WebElement ccMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ccYear;

	@FindBy(id = "cc_cvv")
	private WebElement ccCVV;

	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	@FindBy(id = "order_no")
	private WebElement orderNo;

	public BookingPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void setFirstName(String value) {
		firstName.sendKeys(value);
	}

	public void setLastName(String value) {
		lastName.sendKeys(value);
	}

	public void setAddress(String value) {
		address.sendKeys(value);
	}

	public void setCVV(String value) {
		ccCVV.sendKeys(value);
	}

	public void setCCNo(String value) {
		ccNum.sendKeys(value);
	}

	public void setCardType(String value) {
		selectFromDropDown(ccType, value);
	}

	public void setCardMonth(String value) {
		selectFromDropDown(ccMonth, value);
	}

	public void setCardYear(String value) {
		selectFromDropDown(ccYear, value);
	}

	public void clickBookNow() {
		btnBookNow.click();
	}

	public WebElement getElementOrderNo() {
		return orderNo;
	}

	public String getTxtOrderNo() {
		return orderNo.getAttribute("value");
	}

}
