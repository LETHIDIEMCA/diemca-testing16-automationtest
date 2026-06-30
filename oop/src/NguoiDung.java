public class NguoiDung {

    // define các biến để chứa thông tin của người dùng
    // thuoc tinh cua doi tuong => attribute , preperty
    String maNguoiDung ;
    String hoTen ;
    String diaChi;
    String gioiTinh;
    String ngaySinh;

    // Phuong thuc ,hanh dong (method) => function

    public  void showInfor (){
        System.out.println("Ma nguoi dung: " +maNguoiDung);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Đia chi: " + diaChi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);


    }
}
