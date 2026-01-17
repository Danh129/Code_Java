/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author letha
 */
public class Demo {
    public static void main(String[] args){
        QuanLi ql = new QuanLi();
        BenhNhan bn1 = new BenhNhan("001", "Danh", "12/09/2006");
        BenhNhan bn2 = new BenhNhan("002", "Tu", "03/11/2006"); 
        BenhNhan bn3 = new BenhNhan("003", "An", "06/12/2006");  
        ql.themBenhNhan(bn1, bn2, bn3); 
        ql.hienThi();
        System.out.println("Benh nhan co ngay sinh la 6");
        ql.hienThi6(6);
        
//        GoiKham a = new GoiThang(LocalDate.of(2025, Month.MARCH, 3));
//        GoiKham b = new GoiThang(LocalDate.of(2025, Month.DECEMBER, 19));
//        GoiKham c = new GoiNam("30/02/2025");
//        GoiKham d = new GoiNam("10/08/2025");
//        bn1.DkGoiKham(c);
//        bn2.DkGoiKham(d, a);
//        bn3.DkGoiKham(b);
//        ql.hienThib(LocalDate.of(2025, Month.APRIL, 1), LocalDate.of(2025, Month.MAY, 31));
       
        System.out.println("\nSap xep:");
        ql.sapxep();
        ql.hienThi();
        
        System.out.println("\nCau c");
        ql.hienThic("002");
        
        System.out.println("\n Cau d");
        ql.hienThi();
    }
}
