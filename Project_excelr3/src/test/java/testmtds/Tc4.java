package testmtds;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc4 {
WebDriver driver;
	
	public  Tc4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")public WebElement email;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")public WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login')]")public WebElement loginbutton;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")public WebElement user;
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]")public WebElement logout;
	
	
	public void logout(String mail) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);

			
			signup.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			email.sendKeys("avvannavarjyoti@gmail.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			password.sendKeys("jyoti123");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			loginbutton.click();
			user.isDisplayed();
						System.out.println(user.getText());
			logout.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			System.out.println("User loggedout successfully and is in home page");
			
		
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}



}
