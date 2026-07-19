package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends  BasePage{
    private  static  final By USER_DROPDOWN = By.xpath("//li[@class='oxd-userdropdown']");
    private  static  final  By LOGOUT_LINK = By.linkText("Logout");

    // By.xpath ( // " a[test
    public  DashboardPage (WebDriver driver , WebDriverWait wait){
        super(driver ,wait);
    }
    public  void  logout (){

        wait.until(ExpectedConditions.elementToBeClickable(USER_DROPDOWN)).click();
//        WebElement userDropdown = driver.findElement(USER_DROPDOWN);
//        userDropdown.click();

//        WebElement logoutLink = driver.findElement(LOGOUT_LINK);
//        logoutLink.click();

        // an toàn doi co dieu kien

        wait.until(ExpectedConditions.elementToBeClickable(LOGOUT_LINK)).click();
        // sau khi click logout chuyen sang login

        wait.until(ExpectedConditions.urlContains("auth/login"));
    }

}
