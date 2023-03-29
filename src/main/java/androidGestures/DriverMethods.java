package androidGestures;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class DriverMethods 
{




	/**
	 * Desc This method will start the server throungh cmd line
	 * @return
	 */
	public static AppiumDriverLocalService getAppiumServer() 
	{
		return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingPort(4723)
				.withLogFile(new File("../APPIUM_NEW/ServerLogs.log"))
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE) 
				);
	}


}
