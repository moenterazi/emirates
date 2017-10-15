package Test;

import AppiumSupport.AppiumBaseClass;
import PageObjects.*;
import org.junit.After;
import org.junit.Before;

import AppiumSupport.AppiumController;

public class BaseTestClass extends AppiumBaseClass{
    protected Chrome chromePage;
    protected PopUpPage popupPage;

    @Before
    public void setUp() throws Exception {
        AppiumController.instance.start();
                chromePage = new getChromeHomePage(driver());
                popupPage = new PopupPageDisplay(driver());
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
