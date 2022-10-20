package co.com.choucair.certification.ChoucairTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalStep {
    public static final Target PASSWORD = Target.the("Input to write the password of the user").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[1]/input"));
    public static final Target CONFIRM_PASSWORD = Target.the("Input to confirm the password of the user").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input"));
    // Checkbox
    public static final Target FIRST_CHECK = Target.the("Checkbox to stay informed about Utest").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target SECOND_CHECK = Target.the("Checkbox to accept the Utest terms of use").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target THIRD_CHECK = Target.the("Checkbox to accept the Utest privacy and security policy").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target FINAL_BUTTON = Target.the("Button to send info and create new user").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div"));
}
