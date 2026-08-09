package ui_tests;

import dto.UserLombok;
import manager.AppManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.Random;

public class RegistrationTests extends AppManager
{
    @BeforeMethod
    public void goToRegistrationPage()
    {
        new HomePage(getDriver()).clickBtnLogin();
    }
    @Test
    public void registrationPositiveTest()
    {
        int i = new Random().nextInt(1000);
        UserLombok user = UserLombok.builder()
                .username("ghdjd" + i + "nbd@hghg.bh")
                .password("Adfeyt23!")
                .build();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginRegistrationForm(user);
        loginPage.clickBtnRegistration();
    }

    @Test
    public void testMethod(){
        new HomePage(getDriver()).ajaxMethod();
    }
}
