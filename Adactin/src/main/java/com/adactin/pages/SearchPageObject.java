package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPageObject extends BasePage {

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement noOfRoom;

	@FindBy(id = "adult_room")
	private WebElement adultRoom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	@FindBy(id = "continue")
	private WebElement btncontinue;

	@FindBy(xpath = "//input[contains(@name,'radiobutton')]")
	private WebElement btnRadio;

	@FindBy(linkText = "Search Hotel")
	private WebElement lnkSearchHotel;

	public SearchPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void selectLocation(String option) {
		selectFromDropDown(location, option);
	}

	public void selectHotels(String option) {
		selectFromDropDown(hotels, option);
	}

	public void selectRoomType(String option) {
		selectFromDropDown(roomType, option);
	}

	public void selecNoOfRoom(String option) {
		selectFromDropDown(noOfRoom, option);
	}

	public void selectAdultRoom(String option) {
		selectFromDropDown(adultRoom, option);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	public void clickRadioBtn() {
		btnRadio.click();
	}

	public void clickContinue() {
		btncontinue.click();
	}

	public void clickSearchHotel() {
		lnkSearchHotel.click();
	}

	
	
}
