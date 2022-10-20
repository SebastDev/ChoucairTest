package co.com.choucair.certification.ChoucairTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepTwo {
    public static final Target CITY = Target.the("Input to write the city of the user").located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Input to write the postal code of the user").located(By.id("zip"));
    public static final Target COUNTRY_CONTAINER = Target.the("Container of country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target COUNTRY = Target.the("Input to write the country of the user").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_BUTTON_TWO = Target.the("Button to continue to the next step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
