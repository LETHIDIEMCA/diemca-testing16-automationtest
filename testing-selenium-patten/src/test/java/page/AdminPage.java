package page;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;   // THEM IMPORT NAY
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends BasePage {

    // 1. O nhap ten tai khoan
    private static final By USER_INPUT = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

    // SUA: tim dropdown dua theo label "User Role" phia tren no
    private static final By USER_ROLE_SELECT = By.xpath(
            "//label[normalize-space()='User Role']/following::div[@class='oxd-select-wrapper'][1]");
    // SUA: dua theo class thuc te trong HTML
    private static final By ADMIN_ROLE_OPTION = By.xpath("//div[@role='option']//span[normalize-space()='Admin']");
    // 4. Nut bam tim kiem
    private static final By SEARCH_BUTTON = By.xpath("//button[@type='submit']");

    private  static  final  By RECORD_COUNT_TEXT = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span");
    //private By dataRows;
    // Locator cho cac dong du lieu trong bang ket qua
    private static final By DATA_ROWS = By.xpath("//div[@class='oxd-table-body']//div[@role='row']");
    public AdminPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void open(){
        Allure.step("Open admin page",()->{
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
            // case 1 doi den khi nao element xuat hien Userinput thi step tiep theo
            wait.until(ExpectedConditions.visibilityOfElementLocated(USER_INPUT));
//       // case 2 doi den khi load day du element
//        wait.until(driver1 -> ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"));
//
        });

    }
    public void enterUsername(String username) throws InterruptedException {
        Allure.step("enterUsername:" + username,()->{
            WebElement userInput = driver.findElement(USER_INPUT);
            highLight(userInput);
            userInput.sendKeys(username);
            unhighLight(userInput);
            Thread.sleep(1000);
        });

    }

    public void selectUserRole(String role) throws InterruptedException {
        Allure.step("selectUserRole:" +role,()->{
            // Buoc 1: Click mo dropdown
            WebElement roleSelect = driver.findElement(USER_ROLE_SELECT);
            highLight(roleSelect);
            roleSelect.click();
            // Buoc 2: DUNG WAIT cho option xuat hien roi moi click
            // SUA: thay driver.findElement bang wait.until(ExpectedConditions...)
            //String xpath = "//div[@role='option']//span[text() ='" + role + "']";

            // cac 2 dung string format
            String xpath2 = String.format("//div[@role='option']//span[text() ='%s']", role);
            WebElement adminRoleOption = driver.findElement(By.xpath(xpath2));// wait.until(ExpectedConditions.visibilityOfElementLocated(ADMIN_ROLE_OPTION));
            highLight(adminRoleOption);
            adminRoleOption.click();
            unhighLight(adminRoleOption);
            Thread.sleep(1000);
        });

    }

    public void clickSearch() throws InterruptedException {
        Allure.step("ClickSearch" ,()->{
            WebElement searchButton = driver.findElement(SEARCH_BUTTON);
            highLight(searchButton);
            searchButton.click();
            Thread.sleep(2000);
            unhighLight(searchButton);
        });


    }

    public  void filterByUser ( String username ,String role) throws  InterruptedException{
      enterUsername(username);
      selectUserRole(role);
      clickSearch();
    }
    public  boolean checkNumberOfRecord (){
        return  Allure.step("Check number of record",()->{
            //WebElement recordCountText= driver.findElement(RECORD_COUNT_TEXT);
            WebElement recordCountText = wait.until(ExpectedConditions.visibilityOfElementLocated(RECORD_COUNT_TEXT));
            String text = recordCountText.getText();
            int countRecord = Integer.parseInt(text.replaceAll("\\D+", ""));
            System.out.println("Number of records: " + countRecord);

//        findElements: tra ve list cac element -> List<WebElement>
            int countDataRows = driver.findElements(DATA_ROWS).size();
            return countRecord == countDataRows;
        });


    }
}