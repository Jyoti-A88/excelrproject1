package testmtds;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Tc14 {
WebDriver driver;
	
	public  Tc14(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;	
	@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")public WebElement viewProduct;
	
	@FindBy(xpath= "//button[@type='button']") public WebElement addToCart;
	@FindBy(xpath= "//a//u[text()='View Cart']") public WebElement viewCartClick;
	
	
	@FindBy(xpath= "//a[contains(text(),'Proceed To Checkout')]") public WebElement proceedCheck;
	@FindBy(xpath= "//u[contains(text(),'Register / Login')]") public WebElement Signup;	
	@FindBy(name = "name")public WebElement name;
	@FindBy (xpath="//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")public WebElement email;
	@FindBy(xpath = "//button[contains(text(),'Signup')]") public WebElement submit;
	
	@FindBy(xpath = "//b[contains(text(),'Enter Account Information')]") public WebElement title;
	@FindBy(id = "id_gender2") public WebElement gender;
	@FindBy(id = "password") public WebElement password;
	@FindBy(id = "days") public WebElement days;
	@FindBy(id = "months") public WebElement months;
	@FindBy(id = "years") public WebElement years;
	@FindBy(xpath = "//input[@id='newsletter']") public WebElement checkbox1;
	@FindBy(xpath = "//input[@id='optin']") public WebElement checkbox2;
	
	
	@FindBy(xpath = "//input[@id='first_name']") public WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']") public WebElement lastName;
	@FindBy(xpath = "//input[@id='address1']") public WebElement address;
	@FindBy(id = "country") public WebElement country;
	@FindBy(xpath = "//input[@id='state']") public WebElement state;
	@FindBy(xpath = "//input[@id='city']") public WebElement city;
	@FindBy(xpath = "//input[@id='zipcode']") public WebElement zipcode;
	@FindBy(xpath = "//input[@id='mobile_number']") public WebElement mobileNum;
	@FindBy(xpath = "//button[contains(text(),'Create Account')]") public WebElement createAcc;
	
	@FindBy(xpath = "//b[text()='Account Created!']") public WebElement successMsg;
	@FindBy(xpath = "//a[text()='Continue']") public WebElement continueBtn;
		@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]") public WebElement loggedIn;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]") public WebElement cart;
	@FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]") public WebElement proceedToCheckout;
	@FindBy(xpath = "//h2[contains(text(),'Address Details')]") public WebElement addressDetails;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[6]/textarea[1]") public WebElement description;
	@FindBy(xpath = "//a[contains(text(),'Place Order')]") public WebElement placeOrder;
	
	
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]") public WebElement nameOnCard;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]") public WebElement cardNum;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]") public WebElement cvc;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]") public WebElement expiry;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]") public WebElement year;
	@FindBy(xpath = "//button[@id='submit']") public WebElement payAndConfirm;
	
		
	@FindBy(xpath = "//a[text()=' Delete Account']") public WebElement DeleteAcc;
	@FindBy(xpath = "//b[text()='Account Deleted!']") public WebElement DeleteMsg;
	@FindBy(xpath = "//a[text()='Continue']") public WebElement continueLast;
	
	
	public void placeOrder14(String SearchInput) {
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
	
	
	viewProduct.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	addToCart.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	viewCartClick.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	proceedCheck.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	System.out.println("added");
		
	Signup.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	name.sendKeys("jyoti");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	email.sendKeys("avvannavarjyoti@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	submit.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	title.isDisplayed();
	System.out.println(title.getText());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	gender.click();
	password.sendKeys("jyoti123");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	Select daysDropDown = new Select(days);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	daysDropDown.selectByVisibleText("4");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	Select monthDropDown = new Select(months);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	monthDropDown.selectByVisibleText("July");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	Select yearDropDown = new Select(years);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	yearDropDown.selectByVisibleText("1990");
	
	checkbox1.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	checkbox2.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	firstName.sendKeys("jyoti");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	lastName.sendKeys("a");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	address.sendKeys("whitefield");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	Select countryDropDown = new Select(country);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	countryDropDown.selectByVisibleText("India");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	state.sendKeys("Karnataka");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	city.sendKeys("Bangalore");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	zipcode.sendKeys("56789089");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	mobileNum.sendKeys("7675645453");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	createAcc.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	successMsg.isDisplayed();
	System.out.println(successMsg.getText());
	
	continueBtn.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	loggedIn.isDisplayed();
	System.out.println(loggedIn.getText());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	cart.click();
	proceedToCheckout.click();
	
	addressDetails.isDisplayed();
	System.out.println(addressDetails.getText());
	
	description.sendKeys("Ordering now!");
	placeOrder.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	nameOnCard.sendKeys("jyoti");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	cardNum.sendKeys("756564545");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	cvc.sendKeys("123");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	expiry.sendKeys("July");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	year.sendKeys("2028");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	payAndConfirm.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	DeleteAcc.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	DeleteMsg.isDisplayed();
	System.out.println(DeleteMsg.getText());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	continueLast.click();
	
		}
		

	catch (Exception e) {
		System.out.println("Exception Caught "+ e.getMessage());
	}
		}


}
