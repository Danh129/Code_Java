/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenCode;

import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
        QuanLi ql = new QuanLi();
        
        NhanVat nv1 = new NhanVat(1, "Danh");
        NhanVat nv2 = new NhanVat(2, "Tuan");
        
        nv1.themVatPham(new VatPhamTangLuotChoi("A1", 2));
        nv1.themVatPham(new VatPhamTangMau("B2", 6));
        nv2.themVatPham(new VatPhamTangLuotChoi("A2", 4));
        nv2.themVatPham(new VatPhamTangMau("B1", 10));
        
        ql.themNhanVat(nv1);
        ql.themNhanVat(nv2);
        
        System.out.println("===== Danh Sach Nhan Vat ======");
        ql.hienThiAll();
        
        System.out.println("===== Danh Sach Sau Sap Xep =====");
        ql.sapXepGiamDanSoVatPham();    
        ql.hienThiAll();
    }
}
