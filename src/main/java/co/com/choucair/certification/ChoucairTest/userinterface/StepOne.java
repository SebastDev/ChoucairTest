package co.com.choucair.certification.ChoucairTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

// We must add the website URL for mapping
public class StepOne {
    public static final Target FIRST_NAME = Target.the("Input to write the first name of the user").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Input to write the last name of the user").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Input to write the email of the user").located(By.id("email"));
    public static final Target MONTH_DATE = Target.the("Select to pick the birth month of the user").located(By.id("birthMonth"));
    public static final Target DAY_DATE = Target.the("Select to pick the birth day of the user").located(By.id("birthDay"));
    public static final Target YEAR_DATE = Target.the("Select to pick the birth year of the user").located(By.id("birthYear"));
    // public static final Target LANGUAGES = Target.the().located(By.xpath(""));
    public static final Target NEXT_BUTTON = Target.the("Button to continue to the next step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
