package test;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.BasePage;
import page.LoginPage;
import utils.ConfigReader;
import utils.ScreenshotUtil;

// Epic -> Feature -> Story -> Testcase
@Epic("OrangeHRM web")
@Feature("Authentication")

public class LoginTest extends BaseTest {
    @Story(" Login")
    @Severity(SeverityLevel.BLOCKER)
    @Description ("Login Success with Admin username and ***** and redirect to Dashboard page")
    @Test(description = "TestLoginSuccess")
    public void testLoginSuccess () throws InterruptedException {

        // khoi tao doi tuong la Loginpage

        LoginPage loginPage = new LoginPage(getDriver(),getWait());
        // SUA: dung dau . thay vi :
        String username = ConfigReader.get("admin.username");
        String password = ConfigReader.get("admin.password");

        loginPage.login(username,password);

        // kiem tra expected - actual result

        String currentUrl = getDriver().getCurrentUrl();
        ScreenshotUtil.takeScreenshot(getDriver(),"login_success");
        Assert.assertTrue(currentUrl.contains("dashboard"));
    }
    @Test(description = "TestLoginFail")
    public void testLoginFail () throws InterruptedException {

        // khoi tao doi tuong la Loginpage

        LoginPage loginPage = new LoginPage(getDriver(),getWait());
        loginPage.login("Admin" ,"admin1234");

        // kiem tra expected - actual result
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("auth/login"));
    }


}
