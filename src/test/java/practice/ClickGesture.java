package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ClickGesture 
{
	@Test
	public void click() throws MalformedURLException, InterruptedException {
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

		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));

		views.click();
		String av="WebView";
		String an="text";

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))"));

		driver.findElement(AppiumBy.accessibilityId("WebView")).click();

		Thread.sleep(3000);
		Set<String> handles=driver.getContextHandles();

		for(String handle:handles)
		{
			System.out.println(handle);
		}

		driver.context("WEBVIEW_io.appium.android.apis");

		String msg=driver.findElement(By.xpath("//h1")).getText();


		System.out.println(msg);





		// Java
		//		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		//				"elementId", ((RemoteWebElement) views).getId()
		//				));
		//
		//		// Java
		//		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		//			"x",200,
		//			"y",300
		//				));
		//		
		//		ScreenOrientation sc= driver.getOrientation();
		//		System.out.println(sc);
		//		
		//		driver.rotate(ScreenOrientation.PORTRAIT);
		//		



	}
}