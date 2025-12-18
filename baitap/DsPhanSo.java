/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.baitap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author letha
 */
public class DsPhanSo {
    private List<PhanSo> ds = new ArrayList<>();
    //truyen phan so bat ki vao 
    public void themPs(PhanSo... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void themPs(PhanSo p){
        //chen cuoi do phuc tap O(1)
        this.ds.add(p);
    }
    public void themPs(int t, int m){
        PhanSo p =new PhanSo(t, m);
        this.ds.add(p);
    }
    public void hienThi(){
        for(var x: this.ds)
            x.hienThi();
//        this.ds.forEach(x -> x.hienThi());
    }
  
    public PhanSo tong(){
        PhanSo tong = new PhanSo(0,1);
        for(PhanSo x : ds){
            tong = tong.PtCong(x);
        }
        tong.rutGon();
        return tong;
//          return this.ds.stream().reduce(new PhanSo(), (t, x) -> t.PtCong(x)).rutGon();
    }
    public PhanSo lonNhat(){
//       PhanSo max = ds.get(0);
//       for(PhanSo p:ds)
//           if(p.soSanh(max)>0)
//               max = p;
//       return max;
          return this.ds.stream().max((x, y) -> x.soSanh(y)).get();
    }
    public void xoaPs(PhanSo p){
        this.ds.removeIf(x -> x.soSanh(p)== 0);
//        for(var x: this.ds)
//            if(x.soSanh(p) == 0){
//                this.ds.remove(x);
//                break;
//            }
    }
    public void xoaPs(int t, int m){
        PhanSo p =new PhanSo(t, m);
        this.xoaPs(p);
    }
    
}


