package MobileTesting.Appium;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LeadersPage;
import pageObjects.NavigationsPage;

public class TestCase_001 extends BaseTest{
	
	
	@Test(priority=1)
	public void NaviagteToLeaugesPage()
	{
		NavigationsPage np=new NavigationsPage(driver);
		HomePage hp=new HomePage(driver);
		np.navigateToHomePage();
		hp.clickOnLeaguesBtn();
		String mainPage=hp.PageTitle();
		Assert.assertEquals(mainPage, "Leagues");    //verifies if user landed on Leauges page
	}
	
	@Test(dataProvider="getData",priority=2,enabled=true)
	public void verifyDifferentLeagues(String myLeauge) 
	{
		HomePage hp=new HomePage(driver);
		LeadersPage lp=new LeadersPage(driver);
		hp.clickOnLeaguesBtn();
	    scrollIntoViewwithText(myLeauge,driver);
		hp.clickOnLeauges(myLeauge);
		String subPage=hp.subPageTitle();
		Assert.assertEquals(subPage, myLeauge);    //verifies if user landed on correct leauge subpage
		
		lp.clickOnLeadersBtn();
		boolean leaderTile=lp.verifyIfLeaderTileDisplayed();
		Assert.assertTrue(leaderTile);              //verifies if user landed on leaders subpage 
		
		lp.goToPreviusPage();
		String mainPage=hp.PageTitle();
		Assert.assertEquals(mainPage, "Leagues");    //verifies if user landed on Leauges page again.
	}
	
	
	 @DataProvider
	 public Object[][] getData()
	 {
		 return new Object[][] {{"NCAA Football"},{"PGA Tour"}}; 
	 }
    
}
