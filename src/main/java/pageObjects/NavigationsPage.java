package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NavigationsPage {
	
	AndroidDriver driver;

	public NavigationsPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*@AndroidFindBy(id="com.fivemobile.thescore:id/action_button_text")
	private WebElement continuebtn;*/     //continuebtn and //donebtn   //com.fivemobile.thescore:id/btn_primary
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/btn_primary")   //com.fivemobile.thescore:id/btn_primary
	private WebElement continuebtn;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/btn_disallow")
	private WebElement maybelaterbtnlocation;    //maybelater
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Toronto Raptors']")
	private WebElement raptorsbtn;    //selectingraptorsbtn
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-d='com.fivemobile.thescore:id/txt_name'")
	private List<WebElement> favourites;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/btn_secondary")
	private WebElement maybelaterbtnemail;     //maybelateremail
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_deny_button")
	private WebElement denyNotificationsBtn;       //denyNotification
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/dismiss_modal")
	private WebElement cancelDownloadSBETBtn;        //cancelDownloadSBETBtn
	
	//Action methods
	public void selectFavouriteGame(String myGame)
	{
		for(WebElement e: favourites)
		{
			String favouriteGame=e.getText();
			if(favouriteGame.equals(myGame));
			{ 
				e.click();
				break;
			}
		}
	}
  
	public void navigateToHomePage() {
		continuebtn.click();
		continuebtn.click();
		maybelaterbtnlocation.click();
		raptorsbtn.click();
		continuebtn.click();
		continuebtn.click();
		maybelaterbtnemail.click();
		denyNotificationsBtn.click();
		cancelDownloadSBETBtn.click();
		
	}
}

