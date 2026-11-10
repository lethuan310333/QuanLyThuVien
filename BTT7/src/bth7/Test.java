package bth7;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        // --- YÊU CẦU 3: Tạo đối tượng và gán giá trị thủ công ---
        Sach Toan = new Sach();
        Toan.maSach = "001";
        Toan.tieuDe = "Giai tich";
        Toan.tacGia = "Nguyen Van A";
        Toan.namXuatBan = 2023;
        Toan.soLuong = 10;

        Sach Tin = new Sach();
        Tin.maSach = "002";
        Tin.tieuDe = "Lap trinh co ban";
        Tin.tacGia = "Tran Van B";
        Tin.namXuatBan = 2024;
        Tin.soLuong = 20;

        // In kiểm tra đối tượng
        System.out.println("=== THONG TIN SACH VUA TAO ===");
        Toan.hienThiThongTin();
        Tin.hienThiThongTin();

        // --- YÊU CẦU 4: Quản lý danh sách bằng ArrayList ---
        ArrayList<Sach> dsSach = new ArrayList<>();

        // Thêm các cuốn sách vào ArrayList
        dsSach.add(Toan);
        dsSach.add(Tin);

        // Duyệt danh sách và in ra màn hình
        System.out.println("=== DANH SACH SACH TRONG ARRAYLIST ===");
        for (int i = 0; i < dsSach.size(); i++) {
            System.out.println("Cuon sach thu " + (i + 1) + ":");
            dsSach.get(i).hienThiThongTin();
        }
    }
}