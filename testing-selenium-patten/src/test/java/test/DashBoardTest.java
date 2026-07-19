package test;

import org.testng.annotations.Test;
import page.DashboardPage;
import page.LoginPage;

public class DashBoardTest  extends  BaseTest{

    @Test (description = " Test logout")
    public  void  testLogout () throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver(),getWait());
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(getDriver() ,getWait());
        dashboardPage.logout();
    }
}
