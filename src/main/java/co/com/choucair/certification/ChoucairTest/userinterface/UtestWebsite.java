package co.com.choucair.certification.ChoucairTest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

// We must add the website URL for mapping
@DefaultUrl("https://www.utest.com/")
public class UtestWebsite extends PageObject {
    public static final Target JOIN_TODAY = Target.the("Button to start the user registration").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
}
