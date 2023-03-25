package org.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchsteps extends BaseClass {
	
	//scenario2
	
	@When("user click the category {string} in homepage")
	public void user_click_the_category_in_homepage(String category) throws InterruptedException {
		Thread.sleep(3000);
	WebElement toyssearch = driver.findElement(By.xpath("(//span[text()='" + category + "'])[1]"));
	//WebElement toyssearch = driver.findElement(By.xpath("(//span[text()='Toys'])[1]"));
		moveToTheElement(toyssearch);

	}

	@When("user click the sub-category {string}")
	public void user_click_the_sub_category(String subcategory) throws InterruptedException {
		Thread.sleep(2000);
		WebElement sub = driver.findElement(By.xpath("//span[text()='" + subcategory + "']"));
		//WebElement sub = driver.findElement(By.xpath("//span[text()='Comic']"));
		javascriptClick(sub);

	}

	@Then("user sees the results based on {string} and {string}")
	public void user_sees_the_results_based_on_and(String string, String string2) {
WebElement shopping = driver.findElement(By.xpath("//strong[text()='Shopping Options']"));
Assert.assertTrue("Shopping options is not displayed", shopping.isDisplayed());

	}

}
