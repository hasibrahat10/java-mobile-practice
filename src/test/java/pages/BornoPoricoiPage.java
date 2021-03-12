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

    @AndroidFindBy(id = "likhoni")
    public MobileElement likhoni;

    @AndroidFindBy(id = "likhoni_soroborno")
    public MobileElement likhoni_soroborno;

    @AndroidFindBy(id = "write_d")
    public MobileElement likhoni_word;

    @AndroidFindBy(id = "writting")
    public MobileElement likhoni_board;

    @AndroidFindBy(id = "rubber_soro")
    public MobileElement likhoni_rubber;

    @AndroidFindBy(id = "soro_likhoni_close")
    public MobileElement likhoni_sorbornoClose;

    @AndroidFindBy(id = "likhoni_banjonborno")
    public MobileElement likhoni_banjonborno;

    @AndroidFindBy(id = "write_a")
    public MobileElement likhoni_banjonWord;

    @AndroidFindBy(id = "rubber_banjon")
    public MobileElement likhoni_banjonRubber;

    @AndroidFindBy(id = "ban_likhoni_close")
    public MobileElement likhoni_banjonClose;



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

    public void setLikhoni(){
        likhoni.click();
    }

    public void setSorbornoText(){
        likhoni_soroborno.click();
    }

    public void setSorbornoWritingTask(){
        likhoni_word.click();
        sleepForSeconds(2);
        likhoni_board.click();
        likhoni_rubber.click();
        sleepForSeconds(4);
    }

    public void setCloseSorbornoTask(){
        likhoni_sorbornoClose.click();
    }

    public void setBanjonBornoText(){

        likhoni_banjonborno.click();
    }

    public void setBanjonBornoWritingTask(){
        sleepForSeconds(3);
        likhoni_banjonWord.click();
        sleepForSeconds(2);
        likhoni_board.click();
        likhoni_banjonRubber.click();
    }

    public void setBanjonBornoTextClose(){
        likhoni_banjonClose.click();

    }



}
