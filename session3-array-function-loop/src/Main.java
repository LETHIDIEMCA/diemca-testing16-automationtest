import java.util.Scanner;

public class Main {
    static void inPhanTuCuaMang(int[] arrayNum) {
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println(arrayNum[i]);
        }
    }

    static int tongCacPhantuMang(int[] arrayNum1) {
        int sum = 0;
        for (int i = 0; i < arrayNum1.length; i++) {
            sum += arrayNum1[i];
        }
        return sum; // return DAT NGOAI vong for
    }

    // ham tim max, min trong mang
    // input : int[] arrNum
    // output : [max, min]
    static int[] maxMinArray(int[] arrNum) {
        int max = arrNum[0];
        int min = arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > max) {
                max = arrNum[i];
            }
            if (arrNum[i] < min) {
                min = arrNum[i];
            }
        }
        int[] tupleMaxMin = new int[2];
        tupleMaxMin[0] = max;
        tupleMaxMin[1] = min;
        return tupleMaxMin;
    }

    static int findSencondMax(int[] arrayNum2) {
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
        }
        return secondMax;
    }

    static String removeNguyenam(String str) {
        String result = "";
        char lowerC = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            lowerC = Character.toLowerCase(c);
            if (lowerC != 'u' && lowerC != 'e' && lowerC != 'o' && lowerC != 'a' && lowerC != 'i') {
                result += c;
            }
        }
        return result;
    }


    // tính tổng các chữ số của 1 so

    static int sumChuSo(int number) {

//        // 1234 => 1 + 2+ 3+ 4
//        // b1 => convert sang String
//        // dùng for
//        // sum = sum + number [i]
//
//        String strNum = String.valueOf(number);
//        int sum1 = 0;
//        for ( int i = 0 ; i < strNum.length();i ++){
//            String character = Character.toString(strNum.charAt(i));
//            sum1 += Integer.parseInt(character);
//        }
//        return sum1;

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;

        }

       return sum;
}

// đếm số chữ số của 1 số
    // vd 123456 => 6

    static int countChuso (long number) {
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }
        return count;
    }

    // Đảo ngược số
    // vd 1234 => 4321

//    static int daoChuSo (long number) {
//        int soDao = 0;
//        while (number > 0) {
//            int chuSoCuoi = number % 10 ;        // lay chu so cuoi cung cua n
//            soDao = soDao * 10 + chuSoCuoi; // dua chu so do vao cuoi soDao
//            number = number / 10;                      // bo di chu so cuoi cua n
//        }
//
//        return soDao;
//
//    }


    // Vong lap long nhau

    static  void  inHinhChuNhat (int dai , int rong){
        for ( int i = 0 ; i < rong ; i ++){
            for (int j = 0; j < dai ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // in hinh tam giac

    static  void inhinhtamgiacvuong (int doDai ){
        for ( int i= 1 ; i <= doDai;i ++){
            for ( int j = 1 ; j <=doDai; j ++){
                if ( j <= i){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inhinhtamgiacvuong (10 );
        int[] arrayNum2 = {1, 2, 3, 4, 5, 6};
        String str = "Cybersoft";
        inPhanTuCuaMang(arrayNum2);
        int sum = tongCacPhantuMang(arrayNum2);     // SUA: dung arrayNum2 thay vi mang rong
        int max = maxMinArray(arrayNum2)[0];         // SUA: dung arrayNum2 thay vi arrNum
        int min = maxMinArray(arrayNum2)[1];         // SUA: dung arrayNum2 thay vi arrNum
        int secondMax = findSencondMax(arrayNum2);
        int number = 123456;
        inHinhChuNhat (4,3 );
        int tong = sumChuSo(number);
        int demChuso = countChuso(number);
       // int daoChuso = daoChuSo(number);
       // System.out.println("So sau khi dao nguoc: " + daoChuso);
        System.out.println( " Dem gia tri la :" + demChuso);
        System.out.println( " Tong cac chu so : " + tong);
        String result = removeNguyenam(str);
        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("So lon nhat: " + max);
        System.out.println("So nho nhat: " + min);
        System.out.println("So lon thu 2: " + secondMax);
        System.out.println("Chuoi sau khi xoa nguyen am: " + result);
    }
}