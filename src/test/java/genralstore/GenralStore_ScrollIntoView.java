package genralstore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GenralStore_ScrollIntoView {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		// Common DC (Android or IOS)
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
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

		//	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).click();

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//
		//		String av="India";
		//		String an="text";
		//
		//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))"));
		//
		//		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();


		//		while(canScrollMore) {
		//			canScrollMore = (Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
		//					//"elementId", ((RemoteWebElement) element).getId(),
		//					"direction", "down",
		//					"percent", 1.0
		//					));
		//			System.out.println(canScrollMore);
		//			
		//		}

		//((Object) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");

		//		driver.findElement(AppiumBy.androidUIAutomator(
		//				"new UiScrollable(new UiSelector()" + ".description(\"android.widget.ListView\")).scrollIntoView("
		//						+ "new UiSelector().description(\"//android.widget.TextView[@text='Congo']\"));"));

	}


}
