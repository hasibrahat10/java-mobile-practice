package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BornoPoricoiPage extends BasePage {


    @AndroidFindBy(id = "borno_porichoi")
    public MobileElement b_Poricoi;

    @AndroidFindBy(id = "soro_borno")
    public MobileElement sorborno;


    @AndroidFindBy(id = "letter")
    public MobileElement letter;

    @AndroidFindBy(id = "next")
    public MobileElement next;

    @AndroidFindBy(id = "previous")
    public MobileElement previous;

    @AndroidFindBy(id = "soroborno_close")
    public MobileElement closeSorborno;

    @AndroidFindBy(id = "soroborno_home")
    public MobileElement sorbornoHome;
    @AndroidFindBy(id = "banjon_borno")
    public MobileElement banjonBorno;
    @AndroidFindBy(id = "banjon_next")
    public MobileElement banjonNext;
    @AndroidFindBy(id = "banjon_previous")
    public MobileElement banjonPrevious;
    @AndroidFindBy(id = "banjon_close")
    public MobileElement banjonClose;

    public void setBornoPoricoi() {
        b_Poricoi.click();
    }


    public void setSorborno() {
        sorborno.click();
        sleepFor(3);

    }

    public void prevNext() {
        next.click();
        sleepFor(4);
        previous.click();
        sleepForSeconds(2);
    }

    public void setCloseSorborno() {
        closeSorborno.click();
        sleepForSeconds(3);
    }

    public void setSorbornoHome() {
        sorbornoHome.click();
        sleepForSeconds(3);
    }

    public void setBanjonBorno() {
        banjonBorno.click();
        sleepForSeconds(3);
    }

    public void setNextPrev() {
        banjonNext.click();
        sleepForSeconds(2);
        banjonPrevious.click();
    }


    public void setBanjonClose() {
        banjonClose.click();
        sleepForSeconds(2);
    }


}
