package server;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class ServerStart_2 
{

	AppiumDriverLocalService server;

	@BeforeMethod
	public void startServer() {
		server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingPort(4723)
			//	.withTimeout(Duration)
				.withLogFile(new File ("../APPIUM_NEW/Serverlogs/New.log"))
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
			//	.withAppiumJS()
				);
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
