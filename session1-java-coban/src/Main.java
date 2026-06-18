import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // LAP TRINH CO BAN
        // 1. kHAI BÁO BIẾN
        // 2. Toan tu : + , - , * , / , %
        // 3. phép toan so sánh :  > , >= , < , <= , == , !=
        // 4. phép toán nối các điều kiện : && , ||
        // 5.  condition ,loop
        // 6. function
        // 7. lap trinh hướng đối tượng ( oop)
        // + ke thua
        // + dong goi
        // + truu tuong
        // tool AI : Chat gpt ,Gemini ,Claude ...
        // nhung web hoc java

        // 1. xuất giá trị ra ngoài terminal
        // lưu code : ctrl + s (win) ,cmd + s (mac)
        System.out.println("Hello testing 16");

        // 2. khai báo biến ( variable )
        // so nguyen : int ,long
        // gán so 10 vào biến number1
        int number1 = 10;
        String string1 = "Testing 16";
        System.out.println(number1);
        System.out.println(string1);

        // Truong hợp trong println có cả chữ + so
        // convert du lieu tu so -> chu .VD : 10 => "10"
        System.out.println("Hello " + number1);

        //  3. Các phép toán
        // + - * / (chia lấy nguyên ) % ( chia lấy dư)

        int num1 = 10 ;
        int num2  = 20 ;

        // kết quả tổng của num1 và num2 sẽ gán vào biến sum

        int sum = num1 + num2;
       System.out.println("Ket qua cua num1 va num2 la " + sum);

       // Quy tac dat ten bien ,ten ham
        // dat ten bien theo quy tac camel case (tongHaiSo, dangNhapThanhCong, taoTaikhoan...)
        // dat ten bien dung ngu canh
        // cac tieng cua ten bien khong duoc co dau space
        // khong duoc co ky tu dac biet ( % & ..)
        // ky tu dau tien phai la chu ( VD dung : sum1, sum2 VD sai : 1sum ,2sum)
        // không được đặt tên biến trùng với các key trong java ( keyword : int ,float , def ,class )

       int num3 = 20 ;
       int num4 = 40 ;
       int minus = num3 - num4;
       System.out.println("Hieu cua num3 num4" + minus);

       // num3++ , ++num3=> num3 = num3 + 1
        // num3--, --num3=> num3 = num3 - 1
        // THƯỜNG SẼ GẶP TRONG VÒNG LẶP

        // phep nhan *
        int num5 = 39 ;
        int num6 = 79;
        int multiply = num5 * num6;
        System.out.println("Phep nhan cua num5 num6" + multiply);

        // phep chia

        int num7 = 10 ;
        int num8 = 4 ;
        int chiaLayNguyen = num7 / num8;
        System.out.println("Chia lay nguyen cua 10 va 4 la : " + chiaLayNguyen);

        int chiaLayDu = num7 % num8;
        System.out.println("Chia lay du cua 10 va 4 la : " + chiaLayDu);

        // cac phep toan so sanh : > >= < <= (kiem tra bang) != (kiem tra khac nhau)  ! (phủ định
        boolean kiemTra1= num7 > num8;
        boolean kiemTra2= num7 < num8;
        System.out.println("Ket qua kiem tra cua num7 va num8 la : " + kiemTra1);
        System.out.println(kiemTra2);
        // cac phep toan nay se di chung voi cu phap dieu kien ( condition)
        // va vong lap


        // phep toan noi cac dieu kien : && , ||

        boolean kiemTra3 = ( num1 > num2 ) && ( num2 > num3)  && ( num3 > num4 );

        // true && true = > true
        // tat ca truong hop con lai => false

        boolean kiemTra4 = ( num1 > num2 ) || ( num2 > num3)  || ( num3 > num4 );

        // Chỉ cần 1 trong các điều kiện là true => true
        // VD: true || false || false => true

        // tu duy dev
        // mo hinh 3 khoi  :  input  + process + output
        // B1 : hãy viết testcase về tinh nang quen mat khau
        // input : nhan email hoac SDT
        // Output
        //testcase1 : change pass thanh cong + login thanh cong voi pass moi  => true
        // testcase 2: change pass thanh cong + login thanh cong voi pass cu  => fail


        // Bai 1 : tinh tong 3 so nguyen nhap tu ban phim

        // input :
        // Scanner : doi tuong ho tro nhap gia tri tu ban phim

        // B1: tao doi tuong scanner
        Scanner scan = new Scanner(System.in);
System.out.println(" Moi ban nhap so1: ");
int so1 = Integer.parseInt (scan.nextLine()); // ep kieu

System.out.println (" Moi ban nhap so2: ");
 int so2 = Integer.parseInt(scan.nextLine()); // ep kieu

System.out.println("Moi ban nhap so3 :");
int so3 = Integer.parseInt(scan.nextLine()); // ep kieu

        // output;

        int tong = 0;

//        // processC
 tong = so1 + so2 + so3 ;
        System.out.println("Tong cua so 1 so 2 so 3 la : " + tong);

// B2: Nhập tên của bạn hãy xuất ra nội dung là
 // Xin chào <tên>

 // input : biến string lưu tên nhập từ bàn phím
 System.out.println("Moi ban nhap ten: ");
 String name = scan.nextLine();
 System.out.println(" Xin chao " + name);


 // Tong ket lai
        // khai bao bien
        // nhap
        // xuat
        // phep toan + - * / %
        // phep so sanh > >= < <= == !=
        // phep noi nhieu dieu kien && ||
        // mo hinh 3 khoi : input + process output

    }
    }
