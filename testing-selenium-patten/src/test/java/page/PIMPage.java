package page;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class PIMPage extends BasePage {

    private static final By ICON_SORT = By.xpath("//div[text()='Id']//div//i[contains(@class, 'arrow-down-up')]");
    private static final By ICON_SORT_ASC = By.xpath("(//div[@role='columnheader'])[2]//li[.//span[text() ='Ascending']]");
    private static final By EMPLOYEE_ROWS = By.xpath("//div[@class='oxd-table-card']");
    public PIMPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);


    }
    // buoc 1 :setep open page PIM
    public  void open (){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
        wait.until(ExpectedConditions.visibilityOfElementLocated(EMPLOYEE_ROWS));
    }
    // BUOC 2 : CLICK ICON SORT => CLICK ITEM SORT ASC
    public void sortByIdAsc (){
        Allure.step("Sort by id asscending", ()->{
            // doi den khi icon sort co the click duoc
            WebElement iconSort = wait.until(ExpectedConditions.elementToBeClickable(ICON_SORT));
            highLight(iconSort);
            iconSort.click();
            unhighLight(iconSort);
            Thread.sleep(2000);


            // doi den khi icon sort hien thi va co the click
            WebElement iconSortAsc = wait.until(ExpectedConditions.elementToBeClickable(ICON_SORT_ASC));
            highLight(iconSortAsc);
            iconSortAsc.click();
            unhighLight(iconSortAsc);
            Thread.sleep(2000);

        });
    }
    // viet ham de lay ra list cac ID cua trang 1
    public List<String> getEmployeeIds (){
        return Allure.step("Get ids", ()->{
            List<WebElement> rows = driver.findElements(EMPLOYEE_ROWS);

            // CÁCH 1 : TRruyen thong -> for

            List<String> ids= new ArrayList<>();
            for (int i=0 ; i< rows.size();i++){
                // lay row thu i
                WebElement row = rows.get(i);
                // 1 row se co nhiu column (cell)
                List<WebElement> cells = row.findElements(By.xpath(".//div[@role='cell']"));
                String id = cells.get(1).getText();
                ids.add(id);
            }
            return ids;

            // cách 2 :stream ()

        });
    }
}
