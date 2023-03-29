package genralstore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GenealStore_toastmsg {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		// Common DC (Android or IOS)
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		//desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"" );
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N91KGFEH");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		//DC for Android 
		desiredCapabilities.setCapability("appPackage", "com.androidsample.generalstore");
		desiredCapabilities.setCapability("appActivity", ".SplashActivity");

		// Appium Server Port No.
		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver	 driver = new AndroidDriver(url, desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		String msg=driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getText();

		System.out.println(msg);

		
	}

}
