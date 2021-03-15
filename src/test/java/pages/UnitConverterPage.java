package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Select;

public class UnitConverterPage extends BasePage {
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    public MobileElement navigationDrawer;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Length')]")
    public MobileElement categoryLength;


    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Drop down\"])[1]\n")
    public MobileElement selectDropDown; // Mile

    @AndroidFindBy(xpath = "\t\n" +
            "(//android.widget.ImageView[@content-desc=\"Drop down\"])[2]\n")
    public MobileElement expectDropDown; // Kilometer

    @AndroidFindBy(xpath = "//*[contains(@text, '5')]")
    public MobileElement convertValue;

    @AndroidFindBy(xpath = "//*[contains(@text, 'C')]")
    public MobileElement clearText;

    public void setNavigationDrawer(){
        navigationDrawer.click();
    }

    public void setCategoryLength(){
        categoryLength.click();
    }

    public void setConvertEntry(){

        Select givenValue = new Select(selectDropDown);
        givenValue.selectByVisibleText("Mile");
        swipeUp();
        Select expectValue = new Select(expectDropDown);
        expectValue.selectByVisibleText("Kilometer");
        sleepForSeconds(3);
        convertValue.click();
        sleepForSeconds(5);
    }

    public void setClearText(){
        clearText.click();
    }


}
