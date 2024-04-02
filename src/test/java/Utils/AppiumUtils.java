package Utils;

import java.io.File;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumUtils {
	public AppiumDriverLocalService service;
 
  public AppiumDriverLocalService startAppium(String ipAddress,int port){
	        //Create an object for an Andriod driver;
	        //starting appium server
			service=new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Yashwanth//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
					.withIPAddress(ipAddress).usingPort(port).build(); //add appium server main.js path from your local
			service.start();
			return service;
			
  }
  
//ScrollIntoView until the element is visible. 
  public void scrollIntoViewwithText(String mytext,AndroidDriver driver) {
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+mytext+"\"));"));
	 
  }
 //Json To DataProviders
  
}
