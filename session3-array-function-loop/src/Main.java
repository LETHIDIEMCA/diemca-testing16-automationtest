import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // mảnh
        // mảng số nguyên
        // cách 1 : tạo mảnh số nguyên và gán giá trị sẵn
//        int[] arrayNum ={1,2,3,4,5,6,7};
//        //  danh index   0 1 2 3 4 5 6 (0 là phần tử đầu tiên của mảng)
//        System.out.println(arrayNum[0]);
//
//        // in các phần tử của mảng => loop
//        // khi duyet mang
//        // gia tri khoi dau  : phan tu dau tien cua mang
//        // dieu kien ket thuc : duyet toi chi so cuoi cung cua mang
//        // buoc nhay : tuy vao de bai
//        for(int i = 0 ;i <arrayNum.length; i++){
//            System.out.println(arrayNum[i]);
//        }
//
//        // 2. nhap tung phan tu cua mang
//        // phan 1  : khai bao so luong phan tu cua mang do
//        // phan 2 : nhap tung phan tu cua mang
//
//
//
//        // bai : tinh tong cac so co trong mang
//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();        // hoặc cách khác để gán n
//
//        for (int i = 0; i < n; i++) {
//            sum += arrayNum[i];   // ✅ ĐÚNG — cộng dồn từng phần tử vào sum
//        }
//        System.out.println(" Tong cac so trong mang la : " + sum);
//
//
//    // bai 2 : tim phan tu min,max co trong mang
//
//        int max = arrayNum[0];
//        int min = arrayNum [0];
//        for (int i = 1 ; i < n ; i++) {
//            if (arrayNum[i] > max) {
//                max = arrayNum[i];
//            }
//            if (arrayNum[i] < min) {
//                min = arrayNum[i];
//            }
//        }
//        System.out.println( " So lon nhat la :" + max);
//        System.out.println( " So nho nhat la :" + min);
//
//
//        // Bai 3: nhap so can tim ,in ra vi tri so can tim ,neu khong tim thay thi in ra -1
//        // VD1 : [ 1,2,3,4,5 ]  TARGET = 3
//        // output :2
//        // VD 2 : [ 1,2,3,4,5 ]  TARGET = 6
//        // OUTPUT  : -1
//
//        Scanner sc1 = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        System.out.print("Nhap so  can tim: ");
//        int[] arrayNum1 = new int[n];
//        // Nhap gia tri cho mang
//        for (int i = 0; i < n; i++) {
//            System.out.print("Nhap arrayNum[" + i + "]: ");
//            arrayNum[i] = sc.nextInt();
//        }
//
//        // Nhap so can tim
//        System.out.print("Nhap so can tim (target): ");
//        int target = sc.nextInt();
//
//        // Tim kiem tuyen tinh
//        int position = -1;// Tim kiem tuyen tinh
//        for (int i = 0; i < n; i++) {
//            if (arrayNum[i] == target) {
//                position = i;
//                break; // tim thay roi thi dung ngay, khong can duyet tiep
//            }
//        }

//        // In ket qua
//        System.out.println(position);

        int[] arrayNum2 = {1, 2, 3, 4, 5, 6};
//        int target1 = 3;
//        int vitri1= -1;
//        for (int i = 0 ; i <arrayNum2.length;i++ ){
//            if ((arrayNum2[i]==target1)){
//                vitri1= i;
//            }
//        }
//        System.out.println("vI TRI CUA SO CAN TIM : " +vitri1 );


        // bÀI 4 : Tim so lon thu 2 cho mang
        // VD  [ 1,2,3,4,5]
        // OUT PUT : 4

        int maxiMum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int n = arrayNum2.length;
        for (int i = 0; i < n; i++) {
            if (arrayNum2[i] > maxiMum) {
                secondMax = maxiMum;
                maxiMum = arrayNum2[i];
            } else if (arrayNum2[i] > secondMax && arrayNum2[i] < maxiMum) {
                secondMax = arrayNum2[i];

            }
            System.out.println("SO LON THU HAI LA :" + secondMax);

        }
// bai 5 : xa nguyen am ( ư ,e,o,a,i)
        //  Input: "Xin chào các bạn"
        // Output: "X C C B"

        String str = "Cybersoft";
        // bien luu ket qua
        String result = "";

        // String la tap hop cac ky tu  (character ), mảng các ký tu
        // string <==> char []
        char lowerC = 0;
        for (int i = 0; i < str.length(); i++) {
            // chuyen cac ky tu ve viet thuong
            char c = str.charAt(i); // lay ky tu thu i trong mang ky tu
            lowerC = Character.toLowerCase(c);
         if (lowerC != 'u' && lowerC != 'e' && lowerC != 'o' && lowerC != 'a' && lowerC != 'i') {
           result += c;
           }
//// cach 2
//            if ( "ueoai".contains(String.valueOf(lowerC)) == false){
            //result += c;
        }

        // cach 3 : indexOf cua string
//        // khong tim thya  => -1
//        // tim thay => index
//        If( !="ueoai".contains(Character.toString(lowerC))) {
//            result += c;
//        }
        System.out.println(result);

    }

}