/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
        //viet dc kieu 12/09/2006
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        BenhNhan b1 = new BenhNhan("B01", "Danh", LocalDate.parse("12/09/2006", fm));
        BenhNhan b2 = new BenhNhan("B02", "Tu", LocalDate.parse("06/11/2006", fm));
        BenhNhan b3 = new BenhNhan("B03", "An", LocalDate.parse("06/10/2006", fm));
        QuanLi ql = new QuanLi();
        ql.themBenhNhan(b1);
        ql.themBenhNhan(b2);
        ql.themBenhNhan(b3);
        System.out.println("=====Benh nhan co ngay sinh la ngay 06 =====");
        ql.hienThi();
        
        b1.goiDangKi(new GoiThang("G01", LocalDate.parse("01/05/2025", fm)));
        b1.goiDangKi(new GoiNam("G01", LocalDate.parse("12/05/2026", fm)));
        b2.goiDangKi(new GoiNam("G02", LocalDate.parse("13/05/2025", fm)));
        b3.goiDangKi(new GoiThang("G02", LocalDate.parse("13/09/2025", fm)));
        System.out.println("======Cau b ================");
        ql.hienThiCaub(LocalDate.parse("01/01/2025", fm), LocalDate.parse("31/12/2025", fm));
        
        System.out.println("=========== Cau c ============");
        ql.hienThiMaBenhNhan("B01");
        
        System.out.println("=========== Cau d ============");
        System.out.println("so goi:" + b2.getGoi().size());
        ql.tongTien("B02");
        
        System.out.println("=========== Cau e ============");
        ql.sapxep();
        ql.hienThi();
    }
}
