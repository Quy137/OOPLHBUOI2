/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class AccountList {

    Account[] accList;
    private int count;
    Scanner sc = new Scanner(System.in);

    public AccountList(int n) {
        if (n > 0) {
            Account[] accList = new Account[n];
        }
        Account[] accList = new Account[10];
        count = 0;

    }

    public AccountList() {
        Account[] accList = new Account[10];
        count = 0;
    }

    public void themAcc(Account acc) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Khách hàng số: " + (i + 1));
            System.out.println("Nhap so tai khoan");
            long stk = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ten tai khoan");
            String ttk = sc.nextLine();
            System.out.println("Nhap so tien trong tai khoan");
            double soTien = sc.nextDouble();
            sc.nextLine();
            acc = new Account(stk, ttk, soTien);
            count++;
            accList[i] = new Account();

        }
    }

    public int soLuong() {
        System.out.println("So luong tai khoan : " + accList.length);
        return 0;
    }

    public int timKiemAcc(AccountList[] a) {
        int k = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (count == k) {
                return i + 1;
            } else {
            }
            return 0;
        }
        return 0;
    }

    public void xoaTk(Account acc) {
        int a = sc.nextInt();
        sc.nextLine();
        count = accList.length;
        for (int i = 0; i < a; i++) {
            while (count == a) {
                for (int j = i; j < count - 1; j++) {
                    accList[i] = accList[j + 1];
                }
                count--;
            }
        }
    }

    public void xuatThongTin() {
        System.out.println(String.format("%-10s %-20s %-20s \n", "So tai khoan", "Ten tai khoan", "So tien trong tai khoan"));
        for (int i = 0; i < count; i++) {
            accList[i].in();
        }

    }
}
