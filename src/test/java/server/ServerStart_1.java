package server;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ServerStart_1 
{

	AppiumDriverLocalService server;

	@BeforeMethod
	public void startServer() {
		server = AppiumDriverLocalService.buildDefaultService();
		server.start();
		server.clearOutPutStreams();
	}


	@AfterMethod
	public void stopserver() {
		server.stop();
	}


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

		URL url = new URL("http://localhost:4723");

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);


	}

}
