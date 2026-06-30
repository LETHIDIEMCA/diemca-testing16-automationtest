//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // tạo các testcase cho page login

        // Test
        // BaseTest- class cha
        // - setup môi trường giả lập chạy testcase
        // - clear môi trường về ban đầu
        //  LoginTest = class con
        // define các testcase


        // Page object model

        // LoginPage
        // thuoc tính:
        // usernameLocator
        // passwordLocator
        // loginButtonLocator

        // Phuong thuc
        // step 1 : enterUsername
        // step 2 : enterPassword
        // Step 3: clickLoginButton

        // hàm kiem tra expected - actual

        // class de setup cac browser test
        // class cha : BrowserDriver
        //class con : ChromeDriver ,SafariDriver

        LoginTest test1 = new LoginTest();
        test1.runTest();

    }
}