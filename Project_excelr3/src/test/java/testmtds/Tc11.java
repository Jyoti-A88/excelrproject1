package testmtds;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc11 {

	WebDriver driver;
	
	public  Tc11(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]")public WebElement cart;
	
	@FindBy(xpath = "//h2[contains(text(),'Subscription')]")public WebElement subscription;
	@FindBy(xpath = "//input[@id='susbscribe_email']")public WebElement email;
	@FindBy(xpath = "//button[@id='subscribe']")public WebElement subscribeBtn;
	@FindBy(id = "success-subscribe")public WebElement successMsg;
	
	public void subscriptionCart(String SearchInput) {
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
	
	cart.click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", subscription);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	System.out.println("Subscription displayed successfully");
	
	
	email.sendKeys("avvannavarjyoti@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	subscribeBtn.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	successMsg.isDisplayed();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	System.out.println(successMsg.getText());
	
		}
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
		
		}

}
