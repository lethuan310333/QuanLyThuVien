/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btt9;

/**
 *
 * @author lethu
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BTT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> dsSach = new ArrayList<>();

        // 1. Nhập danh sách các loại sách
        System.out.print("Nhập tổng số lượng sách: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin sách thứ " + (i + 1) + " ---");
            System.out.print("Chọn loại sách (1 - Sách giáo khoa, 2 - Sách tham khảo): ");
            int loai = Integer.parseInt(sc.nextLine());

            Sach s;
            if (loai == 1) {
                s = new SachGiaoKhoa();
            } else {
                s = new SachThamKhao();
            }
            s.Nhap(sc);
            dsSach.add(s);
        }

        // 2. Xuất danh sách các loại sách
        System.out.println("\n================ DANH SÁCH SÁCH ================");
        for (Sach s : dsSach) {
            s.Xuat();
            System.out.println("--------------------------------");
        }

        // 3. Tính tổng thành tiền cho từng loại & chuẩn bị tính TBC đơn giá STK
        double tongTienSGK = 0;
        double tongTienSTK = 0;
        double tongDonGiaSTK = 0;
        int demSTK = 0;

        for (Sach s : dsSach) {
            if (s instanceof SachGiaoKhoa) {
                tongTienSGK += s.thanhTien();
            } else if (s instanceof SachThamKhao) {
                tongTienSTK += s.thanhTien();
                tongDonGiaSTK += s.getDonGia();
                demSTK++;
            }
        }

        System.out.println("\n================ TỔNG THÀNH TIỀN ================");
        System.out.println("Tổng thành tiền Sách giáo khoa: " + tongTienSGK);
        System.out.println("Tổng thành tiền Sách tham khảo: " + tongTienSTK);

        // 4. Tính trung bình cộng đơn giá của các sách tham khảo
        System.out.println("\n================ TRUNG BÌNH CỘNG ĐƠN GIÁ ================");
        if (demSTK > 0) {
            System.out.println("Trung bình cộng đơn giá Sách tham khảo: " + (tongDonGiaSTK / demSTK));
        } else {
            System.out.println("Không có sách tham khảo nào trong danh sách.");
        }

        // 5. Xuất ra các sách giáo khoa của nhà xuất bản X
        System.out.print("\nNhập tên nhà xuất bản X cần tìm: ");
        String nxbX = sc.nextLine();

        System.out.println("--- Các sách giáo khoa của NXB " + nxbX + " ---");
        boolean timThay = false;
        for (Sach s : dsSach) {
            if (s instanceof SachGiaoKhoa && s.getNhaXuatBan().equalsIgnoreCase(nxbX)) {
                s.Xuat();
                System.out.println("--------------------------------");
                timThay = true;
            }
        }
        if (timThay==false) {
            System.out.println("Không tìm thấy sách giáo khoa nào thuộc NXB " + nxbX);
        }
    }
}