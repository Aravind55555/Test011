package com.adactin.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.adactin.pages.BasePage;
import com.adactin.pages.BookingPageObject;
import com.adactin.pages.LoginPageObject;
import com.adactin.pages.SearchPageObject;

public class BookingPageTest {

	LoginPageObject lp;
	SearchPageObject sp;
	BookingPageObject book;
	BasePage bp;

	public BookingPageTest() {
		lp = new LoginPageObject();
		sp = new SearchPageObject();
		book = new BookingPageObject();
		bp = new BasePage();
	}

	@Test
	public void bookHotels() throws Exception {
		lp.logintoApp();
		for (int i = 1; i<= 3; i++) {		
			sp.selectLocation(bp.readValueFromExcelSheet().get(i).get("Location"));		
			sp.selectHotels(bp.readValueFromExcelSheet().get(i).get("Hotel"));		
			sp.selectAdultRoom(bp.readValueFromExcelSheet().get(i).get("Adults Per Room"));		
			sp.selectRoomType(bp.readValueFromExcelSheet().get(i).get("RoomType"));
	sp.selecNoOfRoom(bp.readValueFromExcelSheet().get(i).get("No Of Rooms"));
	sp.clickSubmit();
	sp.clickRadioBtn();
	sp.clickContinue();
	book.setFirstName(bp.readValueFromExcelSheet().get(i).get("First Name"));
	book.setLastName(bp.readValueFromExcelSheet().get(i).get("Last Name"));
			book.setAddress(bp.readValueFromExcelSheet().get(i).get("Address"));
	book.setCCNo(bp.readValueFromExcelSheet().get(i).get("Card No"));
	book.setCardType(bp.readValueFromExcelSheet().get(i).get("Cart Type"));
	book.setCardMonth(bp.readValueFromExcelSheet().get(i).get("Expiry Date"));
	book.setCardYear(bp.readValueFromExcelSheet().get(i).get("Expiry Year"));
	book.setCVV(bp.readValueFromExcelSheet().get(i).get("CVV Number"));
	book.clickBookNow();
	bp.isElementVisible(book.getElementOrderNo());
	bp.writeValueExcelSheet("OrderNo", book.getTxtOrderNo(), i);
	sp.clickSearchHotel();

		}
	}

	
@AfterClass
	public void afterClass() {
		bp.quitDriver();
	}

	
}
