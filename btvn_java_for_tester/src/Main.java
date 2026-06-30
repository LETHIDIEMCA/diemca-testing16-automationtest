import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // BTVN cap 1
        // bai 3
        Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao so n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Tong cac so chan tu 0 den " + n + " la: " + sum);


        // bai 4

        System.out.print("Nhap vao chuoi cua ban: ");
        String chuoi = sc.nextLine();
        String[] danhSachTutrongchuoi = chuoi.split(" ");
        // So phan tu trong mang chinh la so tu
        int soTu = danhSachTutrongchuoi.length;

        System.out.println("So tu trong chuoi la: " + soTu);

        // bai 5

        System.out.print("Nhap vao chuoi moi cua ban: ");
        String chuoi1 = sc.nextLine();

        // Tach chuoi thanh cac tu, dua vao dau cach
        String[] danhSachTu = chuoi.split(" ");
        // Chuoi ket qua, bat dau rong
        String ketQua = "";
        for (int i = 0; i < danhSachTu.length; i++) {
            String tu = danhSachTu[i]; // lay ra 1 tu
            char chuCaiDauTien = tu.charAt(0);              // lay ky tu dau tien cua tu
            char chuCaiDauInHoa = Character.toUpperCase(chuCaiDauTien); // chuyen thanh chu hoa
            if (i == 0) {
                ketQua = ketQua + chuCaiDauTien;
            } else {
                ketQua = ketQua + " " + chuCaiDauInHoa;
            }
        }

        System.out.println("Chu cai dau tien cua moi tu: " + ketQua);


        // BTVN cap 2
        // Bai 1
        System.out.print("Nhap vao so tien thu nhap hang nam cua ban theo don vi trieu dong: ");
        double thuNhap = sc.nextDouble();
        double thue = 0; // so thue se tinh duoc
        // Kiem tra thu nhap tung muc lay muc tran tru muc san se ra muc tung bac de nhan
        if (thuNhap <= 5) {
            // Toan bo thu nhap nam trong bac 1
            thue = thuNhap * 0.05;
        }else if (thuNhap <= 10) {
            // 5 trieu dau tinh 5%, phan con lai tinh 10%
            thue = 5 * 0.05 + (thuNhap - 5) * 0.10;
        } else if (thuNhap <= 18) {
        // Cong don thue cua bac 1, bac 2, roi tinh phan con lai 15%
        thue = 5 * 0.05 + 5 * 0.10 + (thuNhap - 10) * 0.15;
       } else if (thuNhap <= 32) {
        thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (thuNhap - 18) * 0.20;
       } else if (thuNhap <= 52) {
        thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (thuNhap - 32) * 0.25;

       } else if (thuNhap <= 80) {
        thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + (thuNhap - 52) * 0.30;
       } else {
        // Thu nhap tren 80 trieu
        thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30 + (thuNhap - 80) * 0.35;
    }
        System.out.println("So thue phai tra cua ban la: " + thue);

        // Bai 2
        System.out.print("Nhap vao chuoi cua ban: ");
        String chuoi2 = sc.nextLine();
        boolean chuoiDoiXung = true;
        int cuoi = chuoi2.length() - 1; // vi tri ky tu cuoi cung cua chuoi
        for (int dau = 0; dau < cuoi; dau++) {
            if (chuoi2.charAt(dau) == chuoi2.charAt(cuoi)) {
                // 2 ky tu giong nhau -
                cuoi--;
            } else {
                // 2 ky tu khac nhau -> phat hien khong doi xung
                chuoiDoiXung = false;
                break;
            }
        }

        if (chuoiDoiXung) {
            System.out.println("La chuoi doi xung");
        } else {
            System.out.println("La chuoi khong doi xung");

        }

        }
}