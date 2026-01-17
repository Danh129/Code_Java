/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author letha
 */
public class QuanLi {
    ArrayList<BenhNhan> ds = new ArrayList<>();
    public void themBenhNhan(BenhNhan bn){
        ds.add(bn);
    }
    public void hienThi(){
        ds.stream().filter(bn -> bn.getNgaySinh().getDayOfMonth() == 6).forEach(System.out::println);
    }
    
    public void hienThiCaub(LocalDate tu, LocalDate den){
        for(BenhNhan bn: ds){
            for(GoiKham g: bn.getGoi()){
                if(!g.getNgayDk().isBefore(tu) && !g.getNgayDk().isAfter(den)){
                    System.out.println(bn + "->" + g);
                }
            }
        }
        
    }
    public void hienThiMaBenhNhan(String ma){
        //kieu giong tim theo ma
        ds.stream().filter(bn->bn.getMaBn().equals(ma))
                .forEach(bn -> bn.getGoi().forEach(System.out::println));
        
    }
    public void tongTien(String ma){
        ds.stream().filter(bn -> bn.getMaBn().equals(ma)).
                forEach(bn -> System.out.println("Tong tien: " + bn.tongTien()));
    }
    public void sapxep(){
        ds.sort((bn1, bn2) -> bn1.getNgaySinh().compareTo(bn2.getNgaySinh()));
    }
}
