package testmtds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Tc23 {
WebDriver driver;
	
	public  Tc23(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")public WebElement NewUser;
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
	
	
	@FindBy (xpath="(//div//a[@data-product-id='1'])[1]") WebElement addToCart;
	@FindBy (xpath="//u[contains(text(),'View Cart')]") WebElement viewCart;
	@FindBy (xpath="//a[contains(text(),'Blue Top')]") WebElement cartProduct;
	@FindBy (xpath="//a[contains(text(),'Proceed To Checkout')]") WebElement proceedToCheckout;
	@FindBy (xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]") WebElement deleteAcc;
	@FindBy (xpath="//b[contains(text(),'Account Deleted!')]") WebElement successMsgDeleteAcc;
	
	
	
	
	public void billingAddress(String SearchInput) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);

			signup.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			NewUser.isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			System.out.println(NewUser.getText());
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
			zipcode.sendKeys("5689798");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			mobileNum.sendKeys("12282178222");
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
			
			addToCart.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			viewCart.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			cartProduct.isDisplayed();
			System.out.println(cartProduct.getText()+"visible in cart");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			proceedToCheckout.click();
			
			
			
			
			WebElement BillingName = driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]"));
			WebElement GivenName = driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]"));
			
			
			BillingName.isDisplayed();
			System.out.println("Billing name" + BillingName.getText() + " Matches with " + "Given Name" + GivenName.getText());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			
			deleteAcc.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			successMsgDeleteAcc.isDisplayed();
			System.out.println(successMsgDeleteAcc.getText());
			
			
			
}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}	


}
