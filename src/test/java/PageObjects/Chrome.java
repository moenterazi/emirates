package PageObjects;

import io.appium.java_client.MobileElement;

public interface Chrome {

    public void runChrome();
    public void enterName(String name);
    public void submit();
    public String getName();
    public String getCar();
    }
