package testmtds;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc9 {
WebDriver driver;
	
	public  Tc9(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;
		@FindBy(id = "search_product")public WebElement search;
	@FindBy(id = "submit_search")public WebElement searchbtn;
	@FindBy(xpath = "//h2[contains(text(),'Searched Products')]")public WebElement searchedProducts;
	@FindBy(id = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]")public WebElement Prod1name;
	@FindBy(id = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/p[1]")public WebElement Prod2name;
	@FindBy(id = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/p[1]")public WebElement Prod3name;
	
	
	public void searchProduct(String SearchInput) {
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

	search.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	search.sendKeys("Saree");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	searchbtn.click();
	
	
	if(searchedProducts.isDisplayed()) {
		System.out.println("Searched Products displayed successfully");
	}else {
		System.out.println("Searched products didnt displayed");
	}
	
	Prod1name.isDisplayed();
		System.out.println(Prod1name.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

	Prod2name.isDisplayed();
		System.out.println(Prod2name.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
	Prod3name.isDisplayed();
		System.out.println(Prod3name.getText());
	
		}

	catch (Exception e) {
		System.out.println("Exception Caught "+ e.getMessage());
	}
	}	
}
