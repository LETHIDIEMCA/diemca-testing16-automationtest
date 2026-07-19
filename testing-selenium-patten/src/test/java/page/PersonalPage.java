package page;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class PersonalPage extends BasePage {
    // FLOW click vào avater -> click nut -> upload hình
    // kiểm tra : success toast ,button save

    private static final By AVATAR_IMG = By.xpath("//div[@class='orangehrm-edit-employee-image']//img[@class='employee-image']");
    private static final By UPLOAD_BTN = By.xpath("//i[@class='oxd-icon bi-plus']");

    private static final By FILE_INPUT = By.xpath("//input[@type='file']");

    private static final By SAVE_BTN = By.xpath("//button[@type='submit']");

    private static final By SUCCESS_TOAST = By.xpath("//div[contains(@class,'oxd-toast')]");
    //


    public PersonalPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open(String empNumber) {
        Allure.step("Open personal detail page", () -> {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/" + empNumber);
            // đợi đến khi xuất hiện AVATAR_IMG

            wait.until(ExpectedConditions.visibilityOfElementLocated(AVATAR_IMG));

        });


    }
    public void uploadAvatar (String fileName) throws InterruptedException{
        Allure.step("Upload avatar file"+ fileName, ()->{
            // B1: Click vào avatar
            WebElement avatarImg = wait.until(ExpectedConditions.elementToBeClickable(AVATAR_IMG));
            highLight(avatarImg);
            avatarImg.click();
            unhighLight(avatarImg);

            // b2 : Click vao nut cong de upload avatar
            WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(UPLOAD_BTN));
            highLight(uploadBtn);
            uploadBtn.click();
            unhighLight(uploadBtn);

            // B3 :doi hien thi file input -> truyen path image vao file input
            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(FILE_INPUT));


            // ghép path tuyet  doi -> src/text/resources/images
            String filePath = new File("src/test/resources/images/" + fileName).getAbsolutePath();
            fileInput.sendKeys(filePath);
            Thread.sleep(2000);

// B4: click nut Save
            WebElement saveBtn= wait.until(ExpectedConditions.elementToBeClickable(SAVE_BTN));
            highLight(saveBtn);
            saveBtn.click();
            unhighLight(saveBtn);

            Thread.sleep(2000);





        });
    }
    public  boolean isAvatarUploadSuccessfully(){
        return  Allure.step("Check avatar upload successfully",()-> {
            WebElement successToast = wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_TOAST));
            return successToast.isDisplayed();
        });
    }

}
