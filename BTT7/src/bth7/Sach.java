package bth7;

public class Sach {
    // Yêu cầu 1: Tất cả các thuộc tính khai báo private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor mặc định (không tham số)
    public Sach() {
    }

    // Yêu cầu 2 & 3: Getters và Setters
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    // Yêu cầu 3: Ràng buộc năm xuất bản
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = 2026;
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Loi: Nam xuat ban khong hop le (phai > 0 va <= " + currentYear + ")!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Yêu cầu 3: Ràng buộc số lượng >= 0
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Loi: So luong phai >= 0!");
        }
    }
    
    // Yêu cầu 4: Constructor có đầy đủ 5 tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.setNamXuatBan(namXuatBan); // Kích hoạt kiểm tra năm
        this.setSoLuong(soLuong);       // Kích hoạt kiểm tra số lượng
    }

    // Phương thức hiển thị chi tiết sách
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("---------------------------------");
    }
}