/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author letha
 */
public class Demo1 {
    public static void main(String[] args){
        //sinh vien 1 chinh minh
        sinhVien sv1 = new sinhVien("0001", "Le Thanh Danh", 9.0, 8.0);
        //sinh vien 2 ban than
        sinhVien sv2 = new sinhVien("0002", "Nguyen Thanh An", 9.7, 8.0);
       //sinh vien 3 bang constructor mac dinh
       sinhVien sv3 = new sinhVien();
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Nhap mssv: ");
       sv3.setmssv(sc.nextLine());
       
       System.out.print("Nhap tensv: ");
       sv3.settensv(sc.nextLine());
       
       System.out.print("Nhap diem ly thuyet: ");
       sv3.setdiemLT(sc.nextDouble());
       
       System.out.print("Nhap diem thuc hanh: ");
       sv3.setdiemTH(sc.nextDouble());
       
       System.out.println("\n==== Danh sach sinh vien ===== ");
       System.out.printf("%-10s %-20s %8s %10s %10s\n",
               "mssv", "tensv", "diemLT", "diemTH", "diemTB");
       System.out.println("----------------------------------------------------");
       System.out.println(sv1);
       System.out.println(sv2);
       System.out.println(sv3);
       
    }
}
