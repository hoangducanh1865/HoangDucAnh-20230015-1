public class Main {

    public static void main(String[] args) {
        // Tạo tài khoản mới
        BankAccount taiKhoan = new BankAccount("Nguyen Van A", 5000000, 0.0055);
        System.out.println("-------------------------------------");

        // Thực hiện một số giao dịch
        taiKhoan.guiTien(1000000);
        taiKhoan.rutTien(500000);
        taiKhoan.rutTien(50000000);
        taiKhoan.rutTien(500000);
        taiKhoan.rutTien(500000);
        taiKhoan.rutTien(500000);
        System.out.println("-------------------------------------");

        // Hiển thị số dư hiện tại
        taiKhoan.hienThiSoDuHienTai();
        System.out.println("-------------------------------------");

        // Hiển thị lịch sử giao dịch
        taiKhoan.hienThiLichSuGiaoDich();
        System.out.println("-------------------------------------");

        // Tính lãi và cập nhật số dư
        taiKhoan.tinhLaiHangThang();
        System.out.println("-------------------------------------");
    }
}
