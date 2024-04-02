package MobileTesting.Appium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Utils.AppiumUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BaseTest extends AppiumUtils{
 
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
  @BeforeClass
  public void configureAppium() throws IOException {
	  //Create an object for an Andriod driver;
      //starting appium server
      Properties prop=new Properties();
      FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resources//data.properties");
      prop.load(fis);
      String ipAddress=prop.getProperty("ipAddress");
      String port=prop.getProperty("port");
      String deviceName=prop.getProperty("deviceName");
      service=startAppium(ipAddress,Integer.parseInt(port));
	  UiAutomator2Options options =new UiAutomator2Options();
	  options.setDeviceName(deviceName);		
	  options.setApp(System.getProperty("user.dir")+"//src//test//java//resources//theScore_24.5.0_apkcombo.com.apk");
	  driver=new AndroidDriver(service.getUrl(),options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
  }
  
  @AfterClass
  public void tearDown() {
	  //this will stop the server and quit driver
	  driver.quit();
	  service.stop();	
  }
  
  
  
  
  

}
