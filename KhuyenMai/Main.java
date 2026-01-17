/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhuyenMai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
        
        SanPham sp1 = new SanPham("A01", "Do noi that", 200000);
        SanPham sp2 = new SanPham("A02", "Do trang tri", 50000);
        SanPham sp3 = new SanPham("A03", "Dong ho", 300000);
        QuanLi ql = new QuanLi();
       
        ql.themSp(sp1);
        ql.themSp(sp2);
        ql.themSp(sp3);
        System.out.println("==============Cau a ==============");
        ql.hienThi();
        
        System.out.println("==============Cau b ==============");
        ql.timTenSp("Do trang tri");
        
        KhuyenMai kmA = new KhuyenMai_A("B01", LocalDate.now(), LocalDate.now().plusDays(5), 10.0);
        KhuyenMai kmB = new KhuyenMai_B("B02", LocalDate.now(), LocalDate.now().plusDays(2), Arrays.asList("Ve xem phm", "Bap rang"));
        KhuyenMai kmC = new KhuyenMai_C("B03", LocalDate.now().minusDays(10), LocalDate.now().minusDays(1), "Op lung", 20.0);
        
        ql.themKhuyenMai("A01", kmA);
        ql.themKhuyenMai("A02", kmC);
        ql.themKhuyenMai("A03", kmB);
        
        System.out.println("=============Cau c ================");
        ql.HienThiKhuyenMai("Do trang tri");
        
        
        System.out.println("===========Tim loai khuyen mai =============");
        List<SanPham> dsA = ql.SpTheoLoaiKM("A");
        dsA.forEach(s -> System.out.println("-" + s.getTenSp()));
        
        System.out.println("============Sap xep giam dan ===============");
        ql.sapXep();
        ql.hienThi();
        
        System.out.println("===========Tim kiem san pham sap het han =========");
        ql.timKiemSpSapHetHan(5);
        
        System.out.println("============Xoa san pham sap het han ============");
        ql.xoaKMHetHan();
        
        
    }
}
