package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    public MobileElement navigateDrawer;

    @AndroidFindBy(xpath = "//*[contains(@text, \"Length\")]")
    public MobileElement textLength;


    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Category icon'])[1]")
    private MobileElement star;

    @AndroidFindBy(id = "text_info_no_custom_conversions")
    public MobileElement conversionText;


    public boolean displayedText(boolean text){
        return conversionText.isDisplayed();
    }

    public void setNavigateDrawer() {
        navigateDrawer.click();
    }



}
