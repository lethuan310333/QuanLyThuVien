/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btt9;

/**
 *
 * @author lethu
 */
import java.util.Scanner;

public class Sach {
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach() {}

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.print("Nhập ngày nhập (dd/mm/yyyy): ");
        ngayNhap = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập nhà xuất bản: ");
        nhaXuatBan = sc.nextLine();
    }

 
    public void Xuat(){
        System.out.println("Mã sách: "+this.maSach);
        System.out.println("Ngày nhập: "+this.ngayNhap);
        System.out.println("Đơn giá: "+this.donGia);
        System.out.println("Số lượng: "+this.soLuong);
        System.out.println("Nhà xuất bản: "+this.nhaXuatBan);
        
    }
    public double thanhTien(){
        return soLuong*donGia;
    }
}
