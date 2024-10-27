import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private String tenChuTaiKhoan;
    private double soDu;
    private double laiSuatHangThang;
    private int soLanRutTien;
    private ArrayList<String> lichSuGiaoDich;

    // Khởi tạo tài khoản ngân hàng
    public BankAccount(String tenChuTaiKhoan, double soDu, double laiSuatHangThang) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
        this.laiSuatHangThang = laiSuatHangThang;
        this.soLanRutTien = 0;
        this.lichSuGiaoDich = new ArrayList<>();
        System.out.println("Tạo tài khoản mới: " + tenChuTaiKhoan);
        System.out.println("Số dư ban đầu: " + formatTienTe(soDu) + " VNĐ\n");
    }

    // Phương thức gửi tiền
    public void guiTien(double soTien) {
        soDu += soTien;
        String ngayGiaoDich = layNgayHienTai();
        lichSuGiaoDich.add("Deposit - " + formatTienTe(soTien) + " VNĐ - " + ngayGiaoDich);
        System.out.println("Đã gửi " + formatTienTe(soTien) + " VNĐ");
    }

    // Phương thức rút tiền với giới hạn tối đa 3 lần rút/tháng
    public void rutTien(double soTien) {
        if (soLanRutTien >= 3) {
            System.out.println("Rút " + formatTienTe(soTien) + " VNĐ - Lỗi: Bạn đã đạt giới hạn rút tiền tháng này.");
            return;
        }
        else if (soTien > soDu) {
            System.out.println("Rút " + formatTienTe(soTien) + " VNĐ - Lỗi: Số dư không đủ để rút.");
            return;
        }

        soDu -= soTien;
        soLanRutTien++;
        String ngayGiaoDich = layNgayHienTai();
        lichSuGiaoDich.add("Withdraw - " + formatTienTe(soTien) + " VNĐ - " + ngayGiaoDich);
        System.out.println("Đã rút " + formatTienTe(soTien) + " VNĐ");
    }

    // Phương thức tính lãi và cập nhật vào số dư
    public void tinhLaiHangThang() {
        double soTienLai = soDu * laiSuatHangThang;
        soDu += soTienLai;
        System.out.println("Số dư sau khi cộng lãi: " + formatTienTe(soDu) + " VNĐ");
    }

    // Phương thức in lịch sử giao dịch
    public void hienThiLichSuGiaoDich() {
        System.out.println("Lịch sử giao dịch:");
        for (int i = 0; i < lichSuGiaoDich.size(); i++) {
            System.out.println((i + 1) + ". " + lichSuGiaoDich.get(i));
        }
    }

    // Lấy số dư hiện tại
    public void hienThiSoDuHienTai() {
        System.out.println("Số dư hiện tại: " + formatTienTe(soDu) + " VNĐ");
    }

    // Định dạng tiền tệ
    private String formatTienTe(double soTien) {
        return String.format("%,.0f", soTien);
    }

    // Lấy ngày hiện tại
    private String layNgayHienTai() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(new Date());
    }
}
