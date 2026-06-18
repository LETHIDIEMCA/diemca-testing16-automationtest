import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // 1. condition statement

        // Bài 1 : Kiểm tra số dương hay số âm

        // input : number từ bàn phím

        Scanner scan = new Scanner(System.in);

        System.out.println(" Mời bạn nhập số :");
        int number = scan.nextInt();


        // output : số âm hoặc số dương

        if (number >= 0) {
            System.out.println(" Số bạn nhập là số dương");
        } else {
            System.out.println(" Số bạn nhập là số âm");
        }


        // Bài 2 : Kiểm tra số chẵn số lẻ

        //   -> kiểm tra chẵn
        Scanner scan1 = new Scanner(System.in);
        System.out.println(" Mời bạn nhập số :");
        int number1 = scan1.nextInt();
        if (number1 % 2 == 0) {
            System.out.println(" Là số chẵn");
        } else {
            System.out.println(" Là số lẻ");
        }

        // Bài 3 :  Xếp loại điểm học sinh
        // 9-10 -> xuất sắc
        // 8 -9 < 9 - > giỏi
        // 6.5 - 8 -> khá
        // 5 - 6.5 -> trung bình
        // dưới 5 - > yếu
        // < 0 , > 10 -> lỗi
        //  không phải số -> lỗi
        // 9 -> XS
        // 8 -> giỏi
        // 6.5 -> TB
        // 5 => TB
        // 4.5 -> yếu

        System.out.println("Mời bạn nhập điểm");
        float diem = scan.nextFloat();

        if ((diem < 0) || (diem > 10)) {
            System.out.println("Diem bi sai ,vui lòng nhap lai");

        }
        // diem >= 9 và diem >= 10
        // 9 <= diem  && diem >= 10
        else if (diem >= 9) {
            System.out.println("Xuất sắc");

        } else if (diem >= 8) {
            System.out.println("Gioi");

        } else if (diem >= 6.5) {

            System.out.println("Khá");
        } else if (diem >= 5) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }


        // Bài 3 : Kiem tra dang nhap

        // dung user name và pass => dang nhap thanh cong
        // nguoc lia that bai


        String username = "admin";
        String password = "123456";
        boolean isActive = true;

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println(" lOI : Tai khoan khong duoc de trong");
        } else if (!isActive) {
            // isActive : status khong phải là active
            System.out.println(" Loi : tai khoan da bi khoa");

        } else if (username.equals("admin") == false || password.equals("123456") == false) {
            System.out.println(" Loi : Tai khoan hoac mat khau không dung");

        } else {
            System.out.println("Đăng nhập thành công");
        }


        // Bài 4 : tinh tien ve theo do tuoi va loai ve

        // input :
        // tuoi ,loai ve
        //  tre em < 12 tuoi : mien phi
        // cao cao tuoi ( >= 60 tuoi ) : 50,000 (cho tat ca loai ve )
        // nguoi con lai
        // VIP : 200
        // thuong : 150
        Scanner scan2 = new Scanner(System.in);
        System.out.println(" Mời bạn nhập tuổi :");
        int tuoi = scan2.nextInt();
        scan.nextLine();
        System.out.println(" Mời bạn nhập loại vé :");
        String loaiVe = scan.nextLine();
        int tienve = 0;

        // case 1 : 11 , VIP => FREE
        if ((tuoi < 12)) {
            tienve = 0;

        } else if (tuoi >= 60) {
            tienve = 50000;
        } else {

            if (loaiVe.equalsIgnoreCase("VIP")) {
                tienve = 200000;
            } else {
                tienve = 150000;
            }
        }
        if (tienve == 0) {
            System.out.println(" Bạn được miễn phí vé");
        } else {
            System.out.println(" Tiền vé của bạn là " + tienve);
        }


        // case 1 : 65 , VIP => 50.000
        // CASE 3 : 20 , VIP ==> 200
        // Case 4 : 20, thuong ==> 150.000


        /// bai 5 : tim so lon nhat trong 3 so

        Scanner scan3 = new Scanner(System.in);
        System.out.println(" Nhap vao so thu nhat");
        int a = scan3.nextInt();

        Scanner scan4 = new Scanner(System.in);
        System.out.println(" Nhap vao so thu hai");
        int b = scan4.nextInt();


        Scanner scan5 = new Scanner(System.in);
        System.out.println(" Nhap vao so thu ba");
        int c = scan5.nextInt();
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(" So lon nhat là : " + max);


// 2. vong lặp

        // bai 1 : in các số từ 1 đến 50

        int n = 50;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // bai 2 : in cac so chan tu 1 den 50
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }

        // Bài 3 : Tính tong các số từ 1 đến n
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong = tong + i;

        }
        System.out.println("Tong tu 1 den n là : " + tong);

        // Bài 4  : in bảng cửu chương

        int nunber1 = 7 ;
        // 7 x 1 = 7
        // 7 x 2 = 14
        // 7 x3  = 21
        // 7 x 10 = 70
         for ( int i = 1 ; i <= 10 ; i ++) {
             System.out.println(number1 + " x " + i + " = " + (number1 * i));
         }
    }

}

