package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SadaronGaanPage extends BasePage {

    @AndroidFindBy(id = "gk")
    public MobileElement generalKnowledge;
    @AndroidFindBy(id = "gk_close")
    public MobileElement generalKnowledgeClose;
    @AndroidFindBy(id = "gk_home")
    public MobileElement generalKnowledgeHome;

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

    @AndroidFindBy(id = "fol")
    public MobileElement generalKnowledge_fol;

    @AndroidFindBy(id = "fol_image")
    public MobileElement generalKnowledge_folImage;
    @AndroidFindBy(id = "fol_next")
    public MobileElement generalKnowledge_folNext;

    @AndroidFindBy(id = "fol_previous")
    public MobileElement generalKnowledge_folPrev;

    @AndroidFindBy(id = "fol_close")
    public MobileElement generalKnowledge_folClose;

    @AndroidFindBy(id = "fol_home")
    public MobileElement generalKnowledge_folHome;

    @AndroidFindBy(id = "ful")
    public MobileElement generalKnowledge_ful;

    @AndroidFindBy(id = "ful_image")
    public MobileElement generalKnowledge_fulImage;

    @AndroidFindBy(id = "ful_next")
    public MobileElement generalKnowledge_fulNext;
    @AndroidFindBy(id = "ful_previous")
    public MobileElement generalKnowledge_fulPrev;
    @AndroidFindBy(id = "ful_close")
    public MobileElement generalKnowledge_fulClose;

    @AndroidFindBy(id = "ful_home")
    public MobileElement generalKnowledge_fulHome;


    @AndroidFindBy(id = "pakhi")
    public MobileElement generalKnowledge_pakhi;

    @AndroidFindBy(id = "pakhi_image")
    public MobileElement generalKnowledge_pakhiImage;

    @AndroidFindBy(id = "pakhi_next")
    public MobileElement generalKnowledge_pakhiNext;

    @AndroidFindBy(id = "pakhi_previous")
    public MobileElement generalKnowledge_pakhiPrev;
    @AndroidFindBy(id = "pakhi_close")
    public MobileElement generalKnowledge_pakhiClose;

    @AndroidFindBy(id = "pakhi_home")
    public MobileElement generalKnowledge_pakhiHome;


    @AndroidFindBy(id = "mach")
    public MobileElement generalKnowledge_mach;
    @AndroidFindBy(id = "mach_image")
    public MobileElement generalKnowledge_machImage;
    @AndroidFindBy(id = "mach_next")
    public MobileElement generalKnowledge_machNext;

    @AndroidFindBy(id = "mach_previous")
    public MobileElement generalKnowledge_machPrev;

    @AndroidFindBy(id = "mach_close")
    public MobileElement generalKnowledge_machClose;

    @AndroidFindBy(id = "mach_home")
    public MobileElement generalKnowledge_machHome;

    @AndroidFindBy(id = "sobji")
    public MobileElement generalKnowledge_sobji;

    @AndroidFindBy(id = "sobji_image")
    public MobileElement generalKnowledge_sobjiImage;

    @AndroidFindBy(id = "ajob_next")
    public MobileElement generalKnowledge_sobjiNext;

    @AndroidFindBy(id = "ajob_previous")
    public MobileElement generalKnowledge_sobjiPrev;
    @AndroidFindBy(id = "sobji_close")
    public MobileElement generalKnowledge_sobjiClose;

    @AndroidFindBy(id = "sobji_home")
    public MobileElement generalKnowledge_sobjiHome;


    public void setGeneralKnowledge() {
        generalKnowledge.click();
    }

    public void setPraniName() {
        generalKnowledge_prani.click();
    }

    public void setGeneralKnowledgeSteps() {
        generalKnowledge_praniImage.click();
        sleepFor(4);
        generalKnowledge_praniNext.click();
        sleepFor(3);
        generalKnowledge_praniPrev.click();
    }

    public void setGeneralKnowledge_praniClose() {
        generalKnowledge_praniClose.click();
        sleepFor(3);
        generalKnowledgeHome.click();
    }

    public void setGeneralKnowledgeFol() {
        generalKnowledge_fol.click();
    }

    public void setGeneralKnowledgeFolSteps() {
        generalKnowledge_folImage.click();
        sleepFor(4);
        generalKnowledge_folNext.click();
        sleepFor(3);
        generalKnowledge_folPrev.click();
    }

    public void setGeneralKnowledge_folClose() {
        generalKnowledge_folClose.click();
        sleepFor(3);
        generalKnowledgeHome.click();
    }

    public void setGeneralKnowledge_ful() {
        generalKnowledge_ful.click();
    }

    public void setGeneralKnowledgeFulSteps() {
        generalKnowledge_fulImage.click();
        sleepFor(3);
        generalKnowledge_fulNext.click();
        sleepFor(3);
        generalKnowledge_fulPrev.click();
    }

    public void setGeneralKnowledge_fulClose() {
        generalKnowledge_fulClose.click();
        sleepFor(2);
        generalKnowledgeHome.click();
    }

    public void setGeneralKnowledge_pakhi() {
        generalKnowledge_pakhi.click();
    }

    public void setGeneralKnowledgePakhiSteps() {
        generalKnowledge_pakhiImage.click();
        sleepFor(2);
        generalKnowledge_pakhiNext.click();
        sleepFor(3);
        generalKnowledge_pakhiPrev.click();

    }

    public void setGeneralKnowledge_pakhiClose() {
        generalKnowledge_pakhiClose.click();
        sleepFor(3);
        generalKnowledgeHome.click();
    }


    public void setGeneralKnowledge_mach() {
        generalKnowledge_mach.click();
    }

    public void setGeneralKnowledgeMachSteps() {
        generalKnowledge_machImage.click();
        sleepFor(2);
        generalKnowledge_machNext.click();
        sleepFor(3);
        generalKnowledge_machPrev.click();

    }

    public void setGeneralKnowledge_machClose() {
        generalKnowledge_machClose.click();
        sleepFor(3);
        generalKnowledgeHome.click();
    }


    public void setGeneralKnowledge_sobji() {
        generalKnowledge_sobji.click();
    }

    public void setGeneralKnowledgeSobjiSteps() {
        generalKnowledge_sobjiImage.click();
        sleepFor(2);
        generalKnowledge_sobjiNext.click();
        sleepFor(3);
        generalKnowledge_sobjiPrev.click();

    }

    public void setGeneralKnowledge_sobjiClose() {
        generalKnowledge_sobjiClose.click();
        sleepFor(3);
        generalKnowledgeHome.click();
    }


}
