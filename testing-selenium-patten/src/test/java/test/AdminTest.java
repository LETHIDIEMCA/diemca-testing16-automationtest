package test;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AdminPage;
import page.LoginPage;
@Epic("OrangeHRM web")
@Feature("Admin test")
public class AdminTest extends BaseTest {
     // Viet before method để các testcase deu phai login truoc
    private  AdminPage adminPage;
    @BeforeMethod
    public  void loginAndOpenAdminPage () throws InterruptedException {
        // case 1 login truoc va se truy cap vào url của admin page
        LoginPage loginPage = new LoginPage(getDriver(),getWait() );
        loginPage.login("Admin" ,"admin123");
        adminPage= new AdminPage( getDriver(),getWait());
        adminPage.open();
       // Thread.sleep(5000);

        // case 2 login -> click menu admin


    }
    @Story("Manage system user")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filter by admin user")
    @Test (description = "Test filter byg admin user")
    public  void testFilterByAdminUser () throws InterruptedException{
       adminPage.filterByUser("Admin","Admin");
       Assert.assertTrue(true);
       Assert.assertTrue(adminPage.checkNumberOfRecord());

    }
}

