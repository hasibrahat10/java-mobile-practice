package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public class TestPage extends BasePage {
    @AndroidFindBy(id = "gk")
    public MobileElement general_knowledge;
    @AndroidFindBy(id = "prani")
    public MobileElement praniList;
    @AndroidFindBy(id = "prani_next")
    public MobileElement prani_next;
    @AndroidFindBy(id = "prani_previous")
    public MobileElement prani_previous;
    @AndroidFindBy(id = "prani_close")
    public MobileElement prani_close;
    @AndroidFindBy(id = "gk_home")
    public MobileElement gk_home;

    public void check_the_application_process() {
        sleepForSeconds(5);
        general_knowledge.click();
        praniList.click();
        prani_next.click();
        prani_previous.click();
        prani_close.click();
    }

    public void generalHOme() {
        gk_home.click();
    }
}
