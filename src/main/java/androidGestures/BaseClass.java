package androidGestures;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass 
{
	public AppiumDriver driver;

	
	@BeforeSuite
	public void launchApp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N91KGFEH");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity", ".ApiDemos");
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\APPIUM_Stuff\\Appium_Docs\\ApiDemos-debug.apk");


		URL url = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(url, desiredCapabilities);
		
		
	

	}
}
