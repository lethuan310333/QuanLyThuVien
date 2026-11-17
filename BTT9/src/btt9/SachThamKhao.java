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
public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
    }
    
    public SachThamKhao(double thue, String maSach, String ngayNhap, double donGia, int soLuong, String nhaXB) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXB);
        this.thue = thue;
    }
    
    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Nhập thuế: ");
        this.thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Thuế: " + this.thue);
        System.out.println("Thành tiền: " + this.thanhTien());
    }
    
    @Override
    public double thanhTien() {
        return soLuong*donGia+thue;
    }
    
    
}
