package testmtds;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc18 {
WebDriver driver;
	
	public  Tc18(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;

	@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]")public WebElement womenCategory;

	@FindBy(xpath = "(//a[contains(text(),'Tops')])[1]")public WebElement tops;
	
	
	@FindBy(xpath = "//h2[contains(text(),'Women - Tops Products')]")public WebElement title;
	
	@FindBy(xpath = "//body/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]/span[1]/i[1]")public WebElement men;
	
	
	@FindBy(xpath = "//a[contains(text(),'Jeans')]")public WebElement menSubCategory;
	
	@FindBy(xpath = "//h2[contains(text(),'Men - Jeans Products')]")public WebElement menJeans;
	
	
	public void viewCategory(String SearchInput) {
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
	
	womenCategory.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	tops.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	title.isDisplayed();
	System.out.println(title.getText());
	
	men.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	menSubCategory.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	menJeans.isDisplayed();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	System.out.println(menJeans.getText());
		}	

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}


}
