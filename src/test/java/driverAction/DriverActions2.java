package driverAction;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverActions2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N91KGFEH");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity", ".ApiDemos");

		// if you want to install a app
		//desiredCapabilities.setCapability("app", "Path of App");

		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);

		// Check App is installed or Not 
		//		boolean flag = driver.isAppInstalled("io.appium.android.apis");
		//		System.out.println(flag);
		//
		//		Thread.sleep(5000);
		//		
		//		// launches the reqd app
		//		driver.activateApp("jp.rallwell.siriuth.touchscreentest");
		//
		//		// install a application
		//		//driver.installApp("path of application");
		//
		//		// how to run the application in background
		//		driver.runAppInBackground(Duration.ofSeconds(10));
		//
		//		// verify whether the application is running in background
		//		// if it is runnig in background it will print background
		//		System.out.println(	driver.queryAppState("io.appium.android.apis"));

		// open notification bar
		driver.openNotifications();


		// closes current running app
		driver.closeApp();

		//context
		driver.context(null);

		driver.getContextHandles();
		
		// Setting orientation
		ScreenOrientation a = driver.getOrientation();

		driver.rotate(a.LANDSCAPE);
		
		
		driver.isDeviceLocked();
		
		driver.hideKeyboard();
		
		driver.resetApp();
		
		

	}

}
