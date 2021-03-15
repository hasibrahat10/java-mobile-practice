package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SadaronGaanPage extends BasePage{

    @AndroidFindBy(id = "gk")
    public MobileElement generalKnowledge;

    @AndroidFindBy(id = "prani")
    public MobileElement generalKnowledge_prani;

    @AndroidFindBy(id = "prani_image")
    public MobileElement generalKnowledge_praniImage;

    @AndroidFindBy(id = "prani_next")
    public MobileElement generalKnowledge_praniNext;

    @AndroidFindBy(id = "prani_previous")
    public MobileElement generalKnowledge_praniPrev;

    @AndroidFindBy(id = "prani_close")
    public MobileElement generalKnowledge_praniClose;

    @AndroidFindBy(id = "prani_home")
    public MobileElement generalKnowledge_praniHome;


    public void setGeneralKnowledge(){
        generalKnowledge.click();
    }

    public void setPraniName(){
        generalKnowledge_prani.click();
    }

    public void setGeneralKnowledgeSteps(){
        generalKnowledge_praniImage.click();
        sleepFor(4);
        generalKnowledge_praniNext.click();
        sleepFor(3);
        generalKnowledge_praniPrev.click();
    }

    public void setGeneralKnowledge_praniClose(){
        generalKnowledge_praniClose.click();
    }








}
