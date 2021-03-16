package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MojarChoraPage extends BasePage{

    @AndroidFindBy(id = "mojar_chora")
    public MobileElement categoryMojarChora;

    @AndroidFindBy(id = "next_kobite")
    public MobileElement choraNext;



    public void setCategoryMojarChora(){
        categoryMojarChora.click();
    }



}
