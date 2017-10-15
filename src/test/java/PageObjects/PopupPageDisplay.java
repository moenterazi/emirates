package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPageDisplay implements PopUpPage {

    public PopupPageDisplay(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBy(id = "showPopupWindowButton")
    public MobileElement popUpPage;

    public void clickPopup()    {
        popUpPage.click();
    }

    //TODO:    Pop up is not being detected by inspector
/*    @FindBy(id = "popUpId")
    public String getPopupText() {
        popUpPage.getText();
    }*/
}
