package Test;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;

public class Test_SelDroid_App extends BaseTestClass {

    @Test
    public void testChrome() {
        //Search for contact
     //   searchPage.search("Sara");
        chromePage.runChrome();
        chromePage.enterName("Mohammad");
        chromePage.submit();

        //Verify Result
        Assert.assertEquals("Mohammad", chromePage.getName());
        Assert.assertEquals("Volvo", chromePage.getCar());
    }

    @Test
    public void testPopUp() {
        popupPage.clickPopup();
//        Assert.assertEquals("Dismiss", popupPage.g);
    }

}
