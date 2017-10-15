package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class getChromeHomePage implements Chrome {

    public getChromeHomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "buttonStartWebview")
    public MobileElement startChrome;

    @FindBy(id = "name_input")
    public MobileElement nameField;

    @FindBy (xpath = "//android.widget.Button[@content-desc='Send me your name!']")
    public MobileElement submitInfo;

//    @FindBy (xpath = "//*[@class='android.view.WebView' and @index='0']/[@class='android.view.View' and @index='1']")
//    @FindBy (xpath ="//*[@text='\" + Mohammad + \"']")
    @FindBy (xpath = "//android.view.View[contains(@Text, '\" + Mohammad + \"')]")
    //@FindBy (xpath = "//*[@class='android.webkit.WebView'] and [contains(.,'Mohammad')]")
    public MobileElement namePresent;

    @FindBy (xpath = "//android.view.View[contains(@content-desc,'volvo')]")
    //@FindBy (xpath = "//*[@class='android.webkit.WebView'] and [contains(.,'Volvo')]")
    public MobileElement carPresent;


    public void runChrome() {
        startChrome.click();
    }

    public void enterName(String name)  {
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void submit()   {
        submitInfo.click();
    }

    public String getName()   {
        return namePresent.getText();
    }

    public String getCar()  {
        return carPresent.getText();
    }
}
