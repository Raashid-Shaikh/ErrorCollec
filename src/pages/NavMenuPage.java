package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NavMenuPage extends TestBase{
	
		@FindBy(xpath="//nav[@class='NavBar']//li[5]")
		public WebElement NavMenuButton;
		
		@FindBy(xpath="//div[@class='MenuModal__Content__Right']//li[4]")
		public WebElement BookTrip;
		
		@FindBy(id="oneid-secure-responder")
		public WebElement MenuFrame;
	
	public NavMenuPage() {
		PageFactory.initElements(driver, this);		
	}
		
		public void ClickMenu() {
			NavMenuButton.click();
		}
		
		public void ClickBookATrip() {
			
			/*Actions action = new Actions(driver);
			action.moveToElement(BookTrip).click().perform();*/
			
			JavascriptExecutor click =  (JavascriptExecutor) driver;
			click.executeScript("arguments[0].click();", BookTrip);
	
		}
		
	
	
}
