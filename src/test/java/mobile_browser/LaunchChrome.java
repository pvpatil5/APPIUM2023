package mobile_browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchChrome {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N91KGFEH");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		desiredCapabilities.setCapability("unlockType", "pin");
		desiredCapabilities.setCapability("unlockKey", "4488");
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\Pavan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("m_login_email")).sendKeys("pavan");
		
		
	}

}
