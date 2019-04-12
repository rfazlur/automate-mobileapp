package base;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import screens.android.CarousellScreen;
import utils.CommonUtils;

import java.io.IOException;

public class TestBase {

    public static AppiumDriver driver;
    public static String loadPropertyFile = "android_configuration.properties";
    public static CarousellScreen carousellScreen;
    public static Logger log = Logger.getLogger("devpinoyLogger");


    @BeforeSuite
    public void setUp() throws IOException {
        if (driver == null){
            log.debug("Appium server started");
            if (loadPropertyFile.startsWith("android")){
                CommonUtils.loadAndroidConfigProp(loadPropertyFile);
                CommonUtils.setAndroidCapabilities();
                driver = CommonUtils.getAndroidDriver();
            } else if (loadPropertyFile.startsWith("ios")){
                CommonUtils.loadIOSConfigProp(loadPropertyFile);
                CommonUtils.setIOSCapabilities();
                driver = CommonUtils.getIOSDriver();
            }
        }
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
        log.debug("Shutdown appium server");
    }
}
