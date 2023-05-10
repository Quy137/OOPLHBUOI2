/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountList list = new AccountList();
        Account acc = new Account();
        int chon;
        
        do {
            System.out.println("\n------------Menu---------------");
            System.out.println("Chon cac so tuong ung");
            System.out.println("1. Them tai khoan ");
            System.out.println("2. So tai khoan hien co ");
            System.out.println("3. In thong tin tat ca tai khoan");
            System.out.println("4. Nap tien vao tai khoan");
            System.out.println("5. Rut tien ");
            System.out.println("6. Chuyen tien");
            System.out.println("7. Ket thuc ");
            System.out.println("Chon : ");
            chon = sc.nextInt(); sc.nextLine();
            if(chon < 1 || chon > 7) {
                System.out.println("Loi !!!!!");
                System.out.println("Chon 1 den 7 ");
            } else {
                switch(chon) {
                    case 1: {
                        list.themAcc(acc);
                        break;
                    }
                    case 2: {
                        System.out.println("So luong danh sach tai khoan " + list.soLuong());
                        break;
                    }
                    case 3: {
                        list.xuatThongTin();
                        break;
                    }
                    case 4: {
                        System.out.println("Nhap so tai khoan muon thuc hien giao dich : ");
                        long stk = sc.nextLong();sc.nextLine();
                        
                        acc.napTien(stk);
                        break;
                    }
                    case 5: {
                        System.out.println("Nhap so tai khoan muon thuc hien giao dich : ");
                        long stk = sc.nextLong();sc.nextLine();
                        
                        acc.rutTien(stk);
                        break;
                    }
                    case 6: {
                        System.out.println("Nhap so tai khoan muon thuc hien giao dich : ");
                        long stk = sc.nextLong();sc.nextLine();
                        
                        acc.chuyenKhoan(acc.getStk(), acc.getSoTien());
                        break;
                    }
                    case 7: {
                        System.out.println("Cam on ");
                        break;
                    }
                }
            }
        } while(chon !=7);
    }
}
