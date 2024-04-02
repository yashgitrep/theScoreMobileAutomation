package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LeadersPage {
	AndroidDriver driver;

	public LeadersPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='LEADERS']")
	private WebElement leadersBtn;     //leadersbtn
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id='com.fivemobile.thescore:id/big_leader']")
	private WebElement leaderTile;
	
	@AndroidFindBy(accessibility="Navigate up")
	private WebElement goBackBtn;
	
	 //Action Methods
	 public void clickOnLeadersBtn()
	 {
		 leadersBtn.click();
	 }
	 
	 public boolean verifyIfLeaderTileDisplayed()
	 {
		 return leaderTile.isDisplayed();
	 }
	 
	 public void goToPreviusPage()
	 {
		 goBackBtn.click();
	 }
}

 
