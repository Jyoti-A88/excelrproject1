package testmtds;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc21 {

WebDriver driver;
	
	public  Tc21(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")public WebElement viewProduct;
	
	@FindBy(xpath = "//a[contains(text(),'Write Your Review')]")public WebElement review;
	
	@FindBy(xpath = "//input[@id='name']")public WebElement name;
	@FindBy(xpath = "//input[@id='email']")public WebElement email;
	@FindBy(xpath = "//textarea[@id='review']")public WebElement comments;
	@FindBy(xpath = "//button[@id='button-review']")public WebElement submit;
	@FindBy(xpath = "alert-success alert")public WebElement success;

	
	public void reviewProd(String SearchInput) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);


	if(homepage.isDisplayed()) {
		System.out.println("User landed to homepage successfully");
	}
	else {
		System.out.println("User is not in homepage");
	}
	
	
	products.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	viewProduct.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	review.isDisplayed();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	System.out.println(review.getText());
	
	name.sendKeys("jyoti");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	email.sendKeys("avvannavarjyoti@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	comments.sendKeys("Good Product and Worth the money, highly recommended");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	submit.click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	success.isDisplayed();
	System.out.println(success.getText());
	
	
		}

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}
}
