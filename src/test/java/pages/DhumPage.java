package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DhumPage extends BasePage {
    @AndroidFindBy(id = "agdum_bagdum")
    public MobileElement agdum_bagdum;

    @AndroidFindBy(id = "sobdho_goton")
    public MobileElement shobdo_ghoton;

    @AndroidFindBy(id = "shobdo_choice_three")
    public MobileElement shobdo_three;

    @AndroidFindBy(id = "shobdo_choice_two")
    public MobileElement shobdo_two;

    @AndroidFindBy(id = "shobdo_choice_one")
    public MobileElement shobdo_one;

    @AndroidFindBy(id = "shobdo_option_one")
    public MobileElement opt_one;

    @AndroidFindBy(id = "shobdo_option_two")
    public MobileElement opt_two;

    @AndroidFindBy(id = "shobdo_option_three")
    public MobileElement opt_three;

    @AndroidFindBy(id = "shobdho_close")
    public MobileElement shobdo_close;


    public void go_to_ShobdoGhoton_Process() {
        agdum_bagdum.click();
        shobdo_ghoton.click();
    }

    public void dragAndDropWord() {
        System.out.println("drag and drop implement ");

    }


    public void closeShobdoGhoton() {
        shobdo_close.click();
    }


}
