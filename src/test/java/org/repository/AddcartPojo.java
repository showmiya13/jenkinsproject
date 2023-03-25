package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class AddcartPojo extends BaseClass{
	public AddcartPojo() {
		PageFactory.initElements(driver,this);
}
	@FindBy(id="search")
	private WebElement simbasearch;
	
	@FindBy(xpath="//a[text()='Simba Toys Super Mario - Mario 30cm Plush Toy']")
	private WebElement searchingsimba;
	
	
	@FindBy(xpath="//button[@class='action search']")
	private WebElement searchbtn;
	
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement addcart;
	
	@FindBy(xpath="//div[@class='qty-button increase']")
	private WebElement increasepress;
	
	@FindBy(xpath="//span[text()='£15.99']")
	private WebElement asrupees;
	
	@FindBy(xpath="//span[text()='Add to Wish List']")
	private WebElement aswishlist;
	
	public WebElement getAsrupees() {
		return asrupees;
	}

	public WebElement getAswishlist() {
		return aswishlist;
	}

	public WebElement getIncreasecount() {
		return increasecount;
	}
	@FindBy(xpath="//strong[text()='Details']")
	private WebElement increasecount ;
	
	public WebElement getSimbasearch() {
		return simbasearch;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSearchingsimba() {
		return searchingsimba;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getincreasepress() {
		return increasepress;
}
}