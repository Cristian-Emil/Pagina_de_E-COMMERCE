package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.ChooseAccount;
import pageObjects.SignInPage;

import java.util.Set;

import static utils.TestData.*;

public class LoginToPage extends BaseTest {

    @Test
    public void testLogInAdminValidCredential() throws InterruptedException {
       driver.manage().window().maximize();

        ChooseAccount chooseAccount = PageFactory.initElements(driver, ChooseAccount.class);
        Thread.sleep(1000);

        ChooseAccount.getIntraInCont().click();

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window: windowHandles) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(1000);

        SignInPage.getAdresaEmail().sendKeys(ADMIN_EMAIL);
        SignInPage.getContinuaButton().click();

        SignInPage.getAdresaEmail().sendKeys(ADMIN_PASSWORD);
        SignInPage.getContinuaButton().click();



    }












}
