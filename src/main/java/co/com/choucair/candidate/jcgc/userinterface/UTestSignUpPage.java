package co.com.choucair.candidate.jcgc.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignUpPage extends PageObject {

    public static final Target SIGNUP_BUTTON = Target.the("Button that show us the form to sign " +
            "up").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/" +
            "div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRSTNAME = Target.the("Where do we write " +
            "first name").located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Where do we write " +
            "last name").located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Where do we write " +
            "e-mail address").located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("Where do we write " +
            "our birth month").located(By.name("birthMonth"));

    public static final Target BIRTH_DAY = Target.the("Where do we write " +
            "our birth day").located(By.name("birthDay"));

    public static final Target BIRTH_YEAR = Target.the("Where do we write " +
            "our birth day").located(By.name("birthYear"));

    public static final Target NEXT_LOCATION_BUTTON = Target.the("Button that show us the next step " +
            "(location) to sign up").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target INPUT_ZIP = Target.the("Where do we write " +
            "zip").located(By.id("zip"));

    public static final Target NEXT_DEVICES_BUTTON = Target.the("Button that show us the next step " +
            "(devices) to sign up").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target NEXT_PASSWORD_BUTTON = Target.the("Button that show us the next step " +
            "(password) to sign up").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_PASSWORD = Target.the("Where do we write " +
            "password").located(By.name("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Where do we write " +
            "confirm password").located(By.name("confirmPassword"));

    public static final Target CHECKBOX_TERMS_USE = Target.the("Checkbox to verify if we accept terms" +
            " of use").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECKBOX_PRIVACY_SECURITY_POLICY = Target.the("Checkbox to verify if we accept terms" +
            " of use").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Button that show us to complete" +
            " the sign up").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div/div"));


}
