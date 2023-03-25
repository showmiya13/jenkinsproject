package org.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.repository.AddcartPojo;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addcartsteps extends BaseClass {
	public AddcartPojo a;
	@Given("user launches phillipstoys application")
	public void user_launches_phillipstoys_application() {
	    launchBrowser();
	    launchUrl("https://www.phillipstoys.co.uk/");
	    windowMaximize();

	}

	@When("user enter the product in search box")
	public void user_enter_the_product_in_search_box() throws InterruptedException {
		
		a=new AddcartPojo();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		enterText(a.getSimbasearch(),"Simba Toys Super Mario - Mario 30cm Plush Toy" );
		Thread.sleep(3000);
				
		// WebElement search = driver.findElement(By.id("search"));
		//	search.sendKeys("Simba Toys Super Mario - Mario 30cm Plush Toy");
	}



	@When("user click the search button")
	public void user_click_the_search_button() throws InterruptedException {
		//WebElement searchbtn = driver.findElement(By.xpath("//button[@class='action search']"));
		  // searchbtn.click();
		   
javascriptClick(a.getSearchbtn());
Thread.sleep(3000);
	}

	@Then("user sees the results based on selected product")
	public void user_sees_the_results_based_on_selected_product() throws InterruptedException {
	  WebElement rupees = driver.findElement(By.xpath("//a[text()='Create an Account']")); 
	  Thread.sleep(3000);

	  Assert.assertTrue("Rupees is not displayed",rupees.isDisplayed());
	}

	@When("user add the product to add to cart")
	public void user_add_the_product_to_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		javascriptClick(a.getSearchingsimba());
		//javascriptClick(driver.findElement(By.xpath("//a[text()='Simba Toys Super Mario - Mario 30cm Plush Toy']")));
		Thread.sleep(3000);
		javascriptClick(a.getAddcart());
		//javascriptClick(driver.findElement(By.xpath("//span[text()='Add to Cart']")));
 

	}

	@Then("user sees the add to cart page")
	public void user_sees_the_add_to_cart_page() {
		WebElement wishlist = driver.findElement(By.xpath("//span[text()='Add to Wish List']"));
		Assert.assertTrue("Wishlist is not displayed", wishlist.isDisplayed());
	  
	}

	@When("user increase the count in add to cart")
	public void user_increase_the_count_in_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		javascriptClick(a.getincreasepress());
		//WebElement inputbtn = driver.findElement(By.xpath("//div[@class='qty-button increase']"));
		// javascriptClick(inputbtn);
		 Thread.sleep(3000);
		 //javascriptClick(driver.findElement(By.xpath("//span[text()='Add to Cart']")));
	javascriptClick(a.getAddcart());
	
	}
	@Then("user sees the add to cart page with increase count")
	public void user_sees_the_add_to_cart_page_with_increase_count() {
	    WebElement increasecount = driver.findElement(By.xpath("//strong[text()='Details']"));
	    //Assert.assertTrue("Delivery is not displayed", increasecount.isDisplayed());

	}
	
	}

