package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GamesPage extends BasePage{
    @AndroidFindBy(id = "games")
    public MobileElement catgoryGames;

     @AndroidFindBy(id = "hojoborolo")
    public MobileElement hojoborolo;

 @AndroidFindBy(id = "level_one")
    public MobileElement hojoboroloLevelOne;
 @AndroidFindBy(xpath = "//android.widget.GridView/android.widget.Button")
    public MobileElement hojoboroloAllElements;

 @AndroidFindBy(xpath = "grid")
    public MobileElement hojoboroloGrid;
@AndroidFindBy(id = "hojoborolo_close")
    public MobileElement hojoboroloCloseOne;

@AndroidFindBy(id = "hojoborolo_home")
    public MobileElement hojoboroloHome;



@AndroidFindBy(id = "level_two")
    public MobileElement hojoboroloLevelTwo;

@AndroidFindBy(id = "level_three")
    public MobileElement hojoboroloLevelThree;
@AndroidFindBy(id = "level_two_close")
    public MobileElement hojoboroloLevelClosethree;

@AndroidFindBy(id = "grid_three")
    public MobileElement hojoboroloLevelthreeGrid;
@AndroidFindBy(id = "level_three_close")
    public MobileElement hojoboroloLevelThreeClose;

@AndroidFindBy(id = "close_popup_hojo")
    public MobileElement closeHojoboroloPop;


@AndroidFindBy(id = "puzzel")
    public MobileElement puzzel;

@AndroidFindBy(id = "close_popup")
    public MobileElement closePopupGames;






}
