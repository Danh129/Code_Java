/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.baitap;

/**
 *
 * @author letha
 */
public class Demo {
     public static void main(String[] args) {
        PhanSo p = new PhanSo(15,25);
        PhanSo q = new PhanSo(-48,36);
        PhanSo r = new PhanSo(24,-52);
        PhanSo k = new PhanSo(-22,18);
//        PhanSo[] a = {p,q,r,k};
//        System.out.println("Cac phan so:");
        
        DsPhanSo ds = new DsPhanSo();
        ds.themPs(p);
        ds.themPs(q, r,k);
        ds.themPs(20, 30);
        
        ds.hienThi();
        System.out.print("\n Tong cac so: ");
        ds.tong().hienThi();
        System.out.print("\n So lon nhat: ");
        ds.lonNhat().hienThi();
        System.out.print("\n Xoa: ");
        ds.xoaPs(-48, 36);
        ds.hienThi();
     }
        
        //Bai 5
//        for (var x : a){
//            x.rutGon();
//            x.hienThi();
//        }
//        PhanSo tong = new PhanSo(0,1); 
//        for (var x : a) {
//            tong = tong.PtCong(x);
//        }
//        System.out.print("\nTong cac phan so: ");
//        tong.rutGon();
//        tong.hienThi();
//        
//        PhanSo max= a[0];
//        for(int i =1; i < a.length;i++){
//            if(a[i].soSanh(max) > 0)
//                max = a[i];
//        }
//        System.out.print("\n Phan so lon nhat: ");
//        max.hienThi();
//     } 

//     C2: dung stream
//     Stream.of(a).max((x,y) -> x.soSanh(y)).get().hienThi();
}
