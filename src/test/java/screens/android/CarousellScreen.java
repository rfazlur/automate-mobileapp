package screens.android;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CarousellScreen extends ScreenBase {

    public CarousellScreen(AppiumDriver driver) {
        super(driver);
    }

    public void tapBtnNext(){
        WebElement btnNext = driver.findElement(By.id("com.fdbr.android.debug:id/rel_next"));
        btnNext.click();
    }

    public void tapBtnStartedNow(){
        WebElement btnStartedNow = driver.findElement(By.id("com.fdbr.android.debug:id/rel_start"));
        btnStartedNow.click();
    }
}
