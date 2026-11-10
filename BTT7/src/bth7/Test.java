package bth7;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        // Khởi tạo đối tượng bằng Constructor đầy đủ tham số (Yêu cầu 4)
        Sach toan = new Sach("001", "Giai tich", "Nguyen Van A", 2024, 10);

        // Khởi tạo đối tượng bằng constructor mặc định kết hợp Setter (Yêu cầu 2)
        Sach tin = new Sach();
        tin.setMaSach("002");
        tin.setTieuDe("Lap trinh co ban");
        tin.setTacGia("Tran Van B");
        tin.setNamXuatBan(2023);
        tin.setSoLuong(20);

        // Quản lý danh sách đối tượng bằng ArrayList
        ArrayList<Sach> dsSach = new ArrayList<>();
        dsSach.add(toan);
        dsSach.add(tin);

        // Duyệt danh sách và in thông tin
        System.out.println("=== DANH SACH SACH TRONG THU VIEN ===");
        for (int i = 0; i < dsSach.size(); i++) {
            System.out.println("Cuon sach thu " + (i + 1) + ":");
            dsSach.get(i).hienThiThongTin();
        }
    }
}