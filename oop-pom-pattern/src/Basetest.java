public abstract class Basetest {
    public  void setup(){
        System.out.println("Setup trinh duyet");
        System.out.println("Mo trinh duyet");
        System.out.println("Config trinh duyet");
    }

    public  void tearDown (){
        System.out.println("Teardown trinh duyet");
    }

    // define test case de moi class con se tu define logic rieng

    public abstract void  runTest ();
}
