package testmtds;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Ts3 {
WebDriver driver;
	
	public Ts3 (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")public WebElement email;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")public WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login')]")public WebElement loginbutton;
	@FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")public WebElement error;
	
	
	public void invalidlogin(String mail) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);

			
			signup.click();
			email.sendKeys("jyoti123@gmail.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			password.sendKeys("123456");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			loginbutton.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			error.isDisplayed();
			System.out.println(error.getText());
			
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}


}
