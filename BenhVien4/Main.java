/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        BenhNhan bn1 = new BenhNhan("B01", "Thanh Danh", LocalDate.parse("12/09/2006", fm));
        BenhNhan bn2 = new BenhNhan("B02", "Trong Tin", LocalDate.parse("12/11/2006", fm));
        QuanLi ql = new QuanLi();
        ql.themBenhNhan(bn1);
        ql.themBenhNhan(bn2);
        System.out.println("======Them benh nhan ============");
        ql.hienThi();
        
        HoSoKham h1 = new DinhKi("001", LocalDate.parse("12/01/2024", fm), "Dinh Ki");
        HoSoKham h2 = new DotXuat("002", LocalDate.parse("18/08/2024", fm), "Dot Xuat");
        ql.them(h1);
        ql.them(h2);
        System.out.println("======== Them Ho so =============");
        ql.themHoSo();
        
        System.out.println("============Sap xep giam dan ===========");
        ql.sapXep();
        ql.hienThi();
        
        System.out.println("============ Tim benh nhan theo ma =========");
        ql.timBenhNhan("B02");
        
        System.out.println("============= Tim theo loai ==============");
        ql.hienBenhNhanDotXuat("Dinh Ki");
        
        System.out.println("============ Benh nhan co chi phi cao nhat ===========");
        ql.BenhNhanChiPhiCao();
        ql.chiPhi("B01");
    }
}
