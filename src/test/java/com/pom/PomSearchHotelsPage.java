package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSearchHotelsPage extends PomLoginPage {
	
	public PomSearchHotelsPage() {
PageFactory.initElements(driver, this);
}
	@FindBy(id="location")
	protected WebElement locationw;
	
	@FindBy(id="hotels")
	protected WebElement hotelsw;
	
	@FindBy(id="room_type")
	protected WebElement roomtypew;
	
	@FindBy(id="room_nos")
	protected WebElement noofroomsw;
	
	@FindBy(id="datepick_in")
	protected WebElement checkinw;
	
	@FindBy(id="datepick_out")
	protected WebElement checkoutw;
	
	@FindBy(id="adult_room")
	protected WebElement adultsw;
	
	@FindBy(id="child_room")
	protected WebElement childw;
	
	@FindBy(id="Submit")
	protected WebElement submit;
	
	@FindBy(id="continue")
	protected WebElement contin;
	
	public WebElement getContin() {
		return contin;
	}
	
	
	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getLocationw() {
		return locationw;
	}

	public WebElement getHotelsw() {
		return hotelsw;
	}

	public WebElement getRoomtypew() {
		return roomtypew;
	}

	public WebElement getNoofroomsw() {
		return noofroomsw;
	}

	public WebElement getCheckinw() {
		return checkinw;
	}

	public WebElement getCheckoutw() {
		return checkoutw;
	}

	public WebElement getAdultsw() {
		return adultsw;
	}

	public WebElement getChildw() {
		return childw;
	}

	public WebElement getLocation() {
		return locationw;
	}

	public WebElement getHotels() {
		return hotelsw;
	}

	public WebElement getRoomtype() {
		return roomtypew;
	}

	public WebElement getNoofrooms() {
		return noofroomsw;
	}

	public WebElement getCheckin() {
		return checkinw;
	}

	public WebElement getCheckout() {
		return checkoutw;
	}

	public WebElement getAdults() {
		return adultsw;
	}

	public WebElement getChild() {
		return childw;
	}
	
	

}
