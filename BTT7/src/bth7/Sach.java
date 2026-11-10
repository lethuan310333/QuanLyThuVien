/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth7;

/**
 *
 * @author lethu
 */
// Thuộc tính để mặc định để gán trực tiếp bằng dấu chấm
public class Sach {
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;
   
// Yêu cầu 2: In thông tin chi tiết một cuốn sách
public void hienThiThongTin(){
    System.out.println("Mã sách: "+this.maSach);
    System.out.println("Tiêu đề: "+this.tieuDe);
    System.out.println("Tác giả: "+this.tacGia);
    System.out.println("Năm xuất bản: "+this.namXuatBan);
    System.out.println("Số lượng: "+this.soLuong);
    System.out.println("---------------------------------");
}
    
}
