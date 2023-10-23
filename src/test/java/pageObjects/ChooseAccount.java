package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseAccount {

    public ChooseAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
//-- Accesam pt a insera adresa de email in casuta "Introdu adresa de email" -------------------------------------------
    @FindBy(xpath="//*[@id=\"my_account\"]/i")

    private static WebElement intraInCont;
    public static WebElement getIntraInCont() { return intraInCont; }

}
