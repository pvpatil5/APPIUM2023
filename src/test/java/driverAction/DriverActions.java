package driverAction;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import androidGestures.BaseClass;
import io.appium.java_client.AppiumBy;



public class DriverActions extends BaseClass
{


	@Test
	public void actions() throws InterruptedException 
	{
		// terminate app	
		Thread.sleep(3000);
		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();

		//driver.terminateApp("io.appium.android.apis");

		//to check app is installed or not
		//System.out.println(	driver.isAppInstalled("io.appium.android.apis"));

		// install application
		//driver.installApp("/Users/johndoe/path/to/app.apk" );

		//run app in back ground
		//		driver.runAppInBackground(Duration.ofSeconds(10));
		//		System.out.println(driver.queryAppState("Api demos="+"io.appium.android.apis"));
		//
		//		// actiovate other app
		//		driver.activateApp("com.androidsample.generalstore");
		//		System.out.println(driver.queryAppState("Api demos="+"io.appium.android.apis"));
		//		Thread.sleep(3000);
		//		driver.activateApp("Api demos="+"io.appium.android.apis");
		//
		//		System.out.println(driver.queryAppState("general store="+"com.androidsample.generalstore"));
		//	

	}

}
