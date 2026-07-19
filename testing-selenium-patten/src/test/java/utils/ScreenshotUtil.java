package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenshotUtil {
    // thuộc tính để tạo ra floder lưu evident cho các test case
    private  static  final ThreadLocal<String> testFolder = new ThreadLocal<>();

    // thuoc tinh de luu cac step trong tung test case

    private static  final ThreadLocal<Integer> stepCount = new ThreadLocal<>();

    public static void setTestFolder (String folderPath){
        testFolder.set(folderPath);

        // reset step count ve 0 mỗi la62n tạo folder test moi

        stepCount.set(0);
    }
    public  static void clear(){
        testFolder.remove();
        stepCount.remove();
    }
    public  static  void takeScreenshot(WebDriver driver ,String stepName){
        try {
            String testFolderName = testFolder.get();

            String screenShotFolderName = testFolderName + File.separator+ "screenshots";
            Files.createDirectories(Paths.get(screenShotFolderName));

            // tăng số bước lên 1 đơn vị
            Integer stepNumber = stepCount.get();
            stepNumber = (stepNumber == null) ? 1 : stepNumber+1;
            stepCount.set(stepNumber);

            // quy tac dat ten file : step_01_enterUsername.png

            String fileName = String.format("step_%02d_%s.png", stepNumber ,stepName);

            // chụp màn hình hiện tại -> lưu tạm thời vào cache (RAM)
            File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            // copy anh vào folder duoc tao
            File desFile = new File(screenShotFolderName,fileName);
            Files.copy(srcFile.toPath(),desFile.toPath());
        } catch (IOException e) {
          System.out.println("Error taking screenshot: " + e.getMessage());
        }
    }
}
