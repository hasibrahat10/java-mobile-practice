package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
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

    @AndroidFindBy(id = "img_switch")
    public MobileElement switchConversion;


    @AndroidFindBy(xpath = "//*[contains(@text, 'C')]")
    public MobileElement clearText;

    public void setNavigationDrawer() {
        navigationDrawer.click();
    }

    public void setCategoryLength() {
        categoryLength.click();
    }



    public void entryConversionValue(String SelectorValue) {
        selectDropDown.click();
        patientlyScrollMobile("text", SelectorValue, 5);
        clickElementByText(SelectorValue);
        switchConversion.click();
    }

    public void clickElementByText(String value) {
        driver.findElement(By.xpath("//*[contains(@text,'" + value + "')]")).click();

    }

    public  void entryKeyValues(String keyValue){
        driver.findElement(By.xpath("//*[contains(@text,'" + keyValue + "')]")).click();

    }


    public void enterValue(String value){
        String[] values = value.split("");
        for(int i=0; i<value.length(); i++){
            driver.findElement(By.xpath("//android.widget.Button[@text='"+values[i]+"']")).click();
        }
    }


    public void setClearText() {
        clearText.click();
    }


}
