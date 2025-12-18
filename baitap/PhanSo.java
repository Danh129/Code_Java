/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.baitap;

/**
 *
 * @author letha
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo(int t, int m){
        this.tuSo = t;
        this.mauSo = m;
    }
    public PhanSo(){
        this(0,1);
    }
    public void hienThi(){
        System.out.printf("%d/%d\t", this.tuSo, this.mauSo);
    }
     public PhanSo PtCong(PhanSo p) {
        int tu = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        int mau = this.mauSo * p.mauSo;
        return new PhanSo(tu, mau); 
    }
     public static int ucln(int a, int b){
         a = Math.abs(a);
         b = Math.abs(b);
         while(a != b)
             if(a > b)
                 a -= b;
             else
                 b -= a;
         return a;
     }
     public void rutGon(){
         int uc = ucln(tuSo, mauSo);
         tuSo /= uc;
         mauSo /= uc;
         if(mauSo < 0){
             tuSo = -tuSo;
             mauSo = -mauSo;
         }
     }
     public int soSanh(PhanSo p){
         int left = this.tuSo * p.mauSo;
         int right = p.tuSo * this.mauSo;
         
         if(left > right)
             return 1;
         else if(left < right)
             return -1;
         else
             return 0;
     }
     
     //thay giai
//     public int soSanh(PhanSo p){
//         double v1 = this.tuSo*1.0/this.mauSo;
//         double v2 = p.tuSo*1.0/p.mauSo;
     //nay kh dc dung nua
//         if(v1 > v2)
//             return 1;
//         else if(v1 < v2)
//             return -1;
//         return 0;
     //dung nay
//     return Double.compare(v1, v2);
//     }
}
