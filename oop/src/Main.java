//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // tao doi tuong nguoi dung
        NguoiDung user1 = new NguoiDung();
        user1.maNguoiDung= "001";
        user1.hoTen= "Nguyen van A";
        user1.ngaySinh = "1990/01/01";
        user1.showInfor();

        NguoiDung user2 = new NguoiDung();
        user2.maNguoiDung = "002";
        user2.hoTen = "Nguyen van B";
        user2.ngaySinh = "1996 /04/03";
        user2.showInfor();

        // lưu ý :class cha không nên dùng để tạo đối tượng
// Dog () => hàm khởi tạo đối tượng
        // 2 loại hàm khởi tạo
        // - hàm khởi tạo không có tham số . VD :Dog ()
        // lấy giá trị mặc định
        // int => 0
        // float => 0.0
        // String => ""
        // - hàm khởi tạo có tham số
        // mặc định : nếu k có khởi tạo hàm khởi tảo
        // java sẽ auto tạo hàm khởi tạo không tham số

        Dog dog1= new Dog();
        dog1.name = " Chihuahua";
        dog1.eat();
        dog1.bar();

        Dog dog2 = new Dog("Rex", "begie");
        dog2.bar();

        // VD 2: Quan lý nhan vien
        // Develop , Tester ,PM,
        // Thông tin chung ; employeeID, name ,basic salary,level level ( fresher , junior ; middle)
        // đặc trưng riêng của các title
        // Dac trung rieng
        // dev :  salary
        // fresher : 6tr
        // junior : 11tr + phụ cấp
        // middle : 11tr + phu cap + hieu suat cong viec

        // Tester
        // Fresher : 6tr
        // Junior : 10tr + phu cap
        // middle : 10tr + phu cap + KPI


        // PM
        // 15tr + phu cap + thupng du an

        Developer dev1 = new Developer("nv01", "Nguyen van A " , 11000000 ," gui xe","junior", "A");
        dev1.showInfor();
        System.out.println("Salary: "+dev1.calculateSalary());

        Tester tester1 = new Tester("nv01" ," Yen nhi",5000000 ,"gui xe", "junior","5") ;
        tester1.showInfor();
        System.out.println("Salary: " + tester1.calculateSalary());

        PM pm1 = new PM("nv3" ,  " Tran van D",  15000000 ," quan ly team",1 , "Yes");
        pm1.showInfor();


        // Tính chất 2 của OOP là tính đóng gói
        // public , private  , protected

}
}
