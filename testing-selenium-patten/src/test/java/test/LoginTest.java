package test;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.BasePage;
import page.LoginPage;
import utils.ConfigReader;
import utils.CsvReader;
import utils.ScreenshotUtil;

import java.io.IOException;
import java.util.List;

// Epic -> Feature -> Story -> Testcase
@Epic("OrangeHRM web")
@Feature("Authentication")

public class LoginTest extends BaseTest {
    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() throws IOException {
        // Doc CSV va convert sang Object[][] chi trong 2 dong
        List<String[]> rows = CsvReader.readCsv("src/test/resources/loginData.csv");
        return CsvReader.toDataProviderArray(rows);   // ✅ dung method co san
    }
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expected) {
        // username, password, expected tu file CSV
    }
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
