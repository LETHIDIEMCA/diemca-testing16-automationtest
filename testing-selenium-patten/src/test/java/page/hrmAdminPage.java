package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hrmAdminPage extends BasePage{
    // 1. O nhap ten tai khoan
    private static final  By MENU_ADMIN = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]");
    private static final  By MENU_PIM = By.xpath("//a[@href='https://www.orangehrm.com/']");

    public hrmAdminPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }

}
