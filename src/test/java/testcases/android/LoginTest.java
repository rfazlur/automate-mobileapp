package testcases.android;

import base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.android.CarousellScreen;

public class LoginTest extends TestBase {

    @BeforeTest
    public void init(){
        carousellScreen = new CarousellScreen(driver);
    }

    @Test
    public void LoginUsingUsername(){
        carousellScreen.tapBtnNext();
        carousellScreen.tapBtnNext();
        carousellScreen.tapBtnNext();
        carousellScreen.tapBtnStartedNow();
    }

}
