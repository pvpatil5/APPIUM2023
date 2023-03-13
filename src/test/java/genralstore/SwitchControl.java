package genralstore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchControl {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
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

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("pavan");


		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/ancestor::android.widget.RelativeLayout//android.widget.TextView[@text='ADD TO CART']")).click();

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();

		Thread.sleep(4000);

		Set<String> contexthandles=driver.getContextHandles();

		System.out.println(contexthandles.size());

		for(String contexthandle : contexthandles) 
		{
			System.out.println(contexthandle);	
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium"+Keys.ENTER);

	}

}
