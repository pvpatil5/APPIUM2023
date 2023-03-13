package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollGesture {

	@Test
	public void scroll() throws MalformedURLException, InterruptedException 
	{
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

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();

		WebElement element=driver.findElement(AppiumBy.id("android:id/list"));
		boolean canScrollMore=true;
		while(canScrollMore) {
			canScrollMore = (Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
					//"elementId", ((RemoteWebElement) element).getId(),
					"left", 300, "top", 650, "width", 500, "height", 1200,
					"direction", "down",
					"percent", 1.00
					));
			System.out.println(canScrollMore);
			
		}

		//((Object) driver).findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click(); //scroll down to the element and click

		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");



		//		driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
		//				"left", 300, "top", 650, "width", 500, "height", 1200,
		//				"direction", "down",
		//				"percent", 1.0
		//				));

		//		WebElement element=driver.findElement(AppiumBy.accessibilityId("Animation"));
		//		driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
		//				"elementId", ((RemoteWebElement) element).getId(),
		//				"direction", "down",
		//				"percent", 1.0
		//				));

		//		WebElement element=driver.findElement(AppiumBy.id("android:id/list"));
		//		driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
		//				"elementId", ((RemoteWebElement) element).getId(),
		//				"direction", "down",
		//				"percent", 1.0
		//				));


		//		WebElement gallery=driver.findElement(AppiumBy.accessibilityId("Gallery"));
		//		gallery.click();
		//
		//		WebElement photos=driver.findElement(AppiumBy.accessibilityId("1. Photos"));
		//		photos.click();
		//
		//		WebElement img1 = driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
		//
		//		boolean canScrollMore =true;
		//
		//		while(canScrollMore) {
		//			canScrollMore = (Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
		//					"elementId", ((RemoteWebElement) img1).getId(),
		//					"direction", "right",
		//					"percent", 1.0
		//					));
		//			System.out.println(canScrollMore);
		//
		//		}









	}}
