/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btt9;

import java.util.Scanner;

/**
 *
 * @author lethu
 */
public class SachGiaoKhoa extends Sach {
    
    private String tinhTrangSach;

    public SachGiaoKhoa() {
    }
    
    public SachGiaoKhoa(String tinhTrangSach, String maSach, String ngayNhap, double donGia, int soLuong, String nhaXB) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXB);
        this.tinhTrangSach = tinhTrangSach;
    }


    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc); 
        System.out.print("Nhập tình trạng (moi / cu): ");
        this.tinhTrangSach = sc.nextLine();
    }
    
    @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println("Tình trạng: " + this.tinhTrangSach);
        System.out.println("Thành tiền: " + this.thanhTien());
    }
    
    @Override
    public double thanhTien() {
        if(tinhTrangSach.equalsIgnoreCase("moi"))
            return this.donGia*this.soLuong;
        else
            return this.donGia*this.soLuong*0.5;
    }
    
    
}
