package quanlythuvien;

import java.util.Scanner; 

public class QuanLyThuVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bài 1: Nhập thông tin sách
        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXB = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập đơn giá: ");
        double donGia = Double.parseDouble(sc.nextLine());

        // Bài 2: Tính thành tiền
        double thanhTien = donGia * soLuong;

        // Bài 3: Phí vận chuyển (5%)
        double phiVanChuyen = thanhTien * 0.05;

        // Bài 4: Tổng tiền nhập (nhớ dùng dấu +)
        double tongTien = thanhTien + phiVanChuyen;

        // Xuất kết quả
        System.out.println("\n=== KẾT QUẢ NHẬP KHO ===");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm XB: " + namXB);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Thành tiền: " + thanhTien);
        System.out.println("Phí vận chuyển: " + phiVanChuyen);
        System.out.println("Tổng tiền nhập: " + tongTien);

        sc.close();
    }
}