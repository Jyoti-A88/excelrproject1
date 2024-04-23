package testmtds;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc25 {
WebDriver driver;
	
	public  Tc25(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;	
	@FindBy(xpath = "//h2[contains(text(),'Subscription')]")public WebElement footerele;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement topele;	
	
	
	
	
	public void scrollWithArrow(String SearchInput) {
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

	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("arguments[0].scrollIntoView();", footerele);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	System.out.println("Subscription displayed successfully");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
	
	js.executeScript("arguments[0].scrollIntoView();", topele);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	System.out.println("Automation Engineers displayed successfully");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	
		}
		
		
		
		

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}


}
