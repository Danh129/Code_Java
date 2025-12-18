/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu;

import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
        ArrayList<NhanVat> ds = new ArrayList<>();
        NhanVat nv = new NhanVat(1, "NaMex");
        nv.themVatPham(new VatPham("A1", 3));
        nv.themVatPham(new VatPham("B1", 45));
        nv.themVatPham(new VatPham("C1", 31));
        
        NhanVat nv1 = new NhanVat(2, "LamDa");
        nv1.themVatPham(new VatPham("A1", 34));
        nv1.themVatPham(new VatPham("B1", 76));
        
        
        System.out.println("Danh sach hien thi");
        nv.hien();
        nv1.hien();
        
        
        
        System.out.println("===== Sap xep giam dan ======");
        nv.sapxep(ds);
        nv.hien();
        nv1.hien();
        
        
    }
}
