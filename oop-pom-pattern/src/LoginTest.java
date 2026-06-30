public class LoginTest extends Basetest{
    private  Loginpage loginpage = new Loginpage();


    @Override
    public  void runTest (){
       loginpage.login("admin","123456");
       System.out.println("Check login success");
      boolean check = loginpage.verifyLoginSuccess("admin","123456");
       if (check){
           System.out.println("Login thanh cong");
       }
    }

    public  void runTestFail (){
        loginpage.login("admin","1234567");
        System.out.println("Login fail");
        boolean check = loginpage.verifyLoginSuccess("admin","1234567");
        if (check){
            System.out.println("[PASS] Login fail");
        }

    }
}
