package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility="Leagues")
	private WebElement leaguesBtn;     //leagues
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/titleTextView")
	public WebElement titleTile;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/league_name_text']")
	private List<WebElement> leaugenames;
	
	@AndroidFindBy(id="com.fivemobile.thescore:id/titleTextView")
	private WebElement subPageTitleTile;
	
	
	//Action methods
	public void clickOnLeaguesBtn()
	{
		leaguesBtn.click();
	}
	
	public String PageTitle() {
		return titleTile.getText();
	}
	
	public void clickOnLeauges(String myLeauge)
	{
		for(WebElement e: leaugenames)
		{
			String leaugeanme=e.getText();
			if(leaugeanme.equals(myLeauge))
			{
				e.click();
				break;
			}
		}
	}
	
	public String subPageTitle()
	{
		return subPageTitleTile.getText();
	}

}


