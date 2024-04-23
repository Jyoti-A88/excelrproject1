package testmtds;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Testcase1 {
WebDriver driver;
	
	public Testcase1 (WebDriver driver) {
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
	@FindBy(xpath = "//a[text()=' Delete Account']") public WebElement DeleteAcc;
	@FindBy(xpath = "//b[text()='Account Deleted!']") public WebElement DeleteMsg;
	@FindBy(xpath = "//a[text()='Continue']") public WebElement continueLast;
	
	
	
	public void loginPage(String SearchInput) {
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
			name.sendKeys("Jyoti");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			email.sendKeys("jyotinaveen8884@gmail.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			submit.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			title.isDisplayed();
			System.out.println(title.getText());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			gender.click();
			password.sendKeys("cear888");
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
			
			firstName.sendKeys("Jyoti");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			lastName.sendKeys("A");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			address.sendKeys("Banalore");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			Select countryDropDown = new Select(country);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			countryDropDown.selectByVisibleText("India");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			state.sendKeys("Karnataka");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			city.sendKeys("Bangalore");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			zipcode.sendKeys("5120124");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			mobileNum.sendKeys("9632625746");
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
			
			
			  DeleteAcc.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			  
			  DeleteMsg.isDisplayed(); System.out.println(DeleteMsg.getText());
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			  continueLast.click();
			 
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}	
	
}



