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
        
        double thanhTien = donGia * soLuong;        
        double phiVanChuyen = thanhTien * 0.05;
        double tongTien = thanhTien + phiVanChuyen;
        
        // Thêm nhập chọn loại sách
        System.out.println("Chọn loại sách (1. Sách giáo khoa, 2. Sách tham khảo, 3. Sách chuyên ngành, 4. Sách khác): ");
        int loaiSach=sc.nextInt();
                
        //Bài1: Kiểm tra giá
        if(donGia>0&&soLuong>=0&&namXB<=2026&&namXB>0)
            System.out.println("Thông tin sách hợp lệ!");
        else
            System.out.println("Thông tin sách không hợp lệ");
        
        //Bài2: Phân loại giá
        String phanLoaiGia;
        if(donGia<50000)
            phanLoaiGia="Sách giá thấp";
        else{
            if(donGia<=100000)
                phanLoaiGia="Sách giá trung bình";
            else{
                if(donGia<=200000)
                    phanLoaiGia="Sách giá cao";
                else
                    phanLoaiGia="Sách giá đặc biệt";
            }
        }
        
        //Bài3: Phân loại tồn kho
        String phanLoaiKho;
        if(soLuong==0)
            phanLoaiKho="Hết sách";
        else{
            if(soLuong<=5)
                phanLoaiKho="Sắp hết";
            else{
                if(soLuong<=20)
                    phanLoaiKho="Còn ít";
                else
                    phanLoaiKho="Còn nhiều";
            }
        }

        //Bài4:Dùng switch
        String tenLoai;
        switch(loaiSach){
            case 1: tenLoai="Sách giáo khoa";
            break;
            case 2: tenLoai="Sách tham khảo";
            break;
            case 3: tenLoai="Sách chuyên ngành";
            break;
            case 4: tenLoai="Sách khác";
            break;
            default: tenLoai="Không xác định";
            break;
        }


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
        System.out.println("Phân loại giá: " + phanLoaiGia);
        System.out.println("Tồn kho: " + phanLoaiKho);
        sc.close();
    }
}