/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class Account {

    private long stk;
    private String ttk, trangThai;
    private double soTien;

    Scanner sc = new Scanner(System.in);

    public static final double laiSuat = 0.035;

    public Account(long stk) {
        this.stk = stk;
    }
    
    

    public Account(long stk, String ttk) {
        this.stk = stk;
        this.ttk = ttk;
        soTien = 50;
    }

    public Account(long stk, String ttk, double soTien) {
        this.stk = stk;
        this.ttk = ttk;
        this.soTien = soTien;
    }

    public Account() {
        stk = 99999;
        ttk = "chua xac dinh";
        soTien = 50;
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        if (stk > 0 && stk != 999999) {
            this.stk = stk;
        }

    }

    public String getTtk() {
        return ttk;
    }

    public void setTtk(String ttk) {
        if (ttk != null) {
            this.ttk = ttk;
        }
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        if (soTien >= 50) {
            this.soTien = soTien;
        }

    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        String st1 = format.format(soTien);
        return "Account{" + "stk=" + stk + ", ttk=" + ttk + ", trangThai=" + trangThai + ", soTien=" + st1 + '}';
    }

    public void napTien(long stk) {
        System.out.println("Nhap so tien ban nap : ");
        double tien = sc.nextDouble();
        if (tien < 0) {
            System.out.println("Khong hop le!");
            System.out.println("So tien nap vo phai lon hon 0 ");
        }
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String st1 = format.format(tien);
        soTien = tien + soTien;
    }

    public void rutTien(long stk) {
        System.out.println("Nhap so tien ban muon rut : ");
        double tien = sc.nextDouble();
        if (tien > soTien) {
            System.out.println("Khong hop le!");
            System.out.println("Tien rut phai nho hon tien trong tai khoan");
        }
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String st1 = format.format(tien);
        soTien = soTien - tien;
    }

    public void chuyenKhoan(long stk, double tien) {
        if (this.soTien >= tien) {
            this.soTien -= tien;
        }
        
    }

    public void daoHan() {
        soTien = soTien + soTien * laiSuat;

        NumberFormat format = NumberFormat.getCurrencyInstance();
        String st1 = format.format(soTien);
        System.out.println("Ban vua duoc : " + st1 + "tu dao hang 1 thang");
    }
    public void in() {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String st1 = format.format(soTien);
                System.out.println(String.format("%-10s %-20s %-20s \n", this.getStk() ,this.getTtk() , this.getSoTien()));

    }
}
