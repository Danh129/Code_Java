/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author letha
 */
public class QuanLi {
    ArrayList<BenhNhan> ds = new ArrayList<>();
    public void themBenhNhan(BenhNhan...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    
    public void hienThi(){
        this.ds.forEach(t -> t.hienThi());
    }
    //hien thi benh nhan co ngay sinh la 6
    public void hienThi6(int ngay){
        this.ds.stream().filter(bn -> bn.getNgaySinh().getDayOfMonth() == ngay).forEach(t -> t.hienThi());
    }
    
    public void hienThib(LocalDate start, LocalDate end){
        for(BenhNhan bn: ds){
            boolean thoa = false;
            for(GoiKham goi: bn.getGoiDk()){
                LocalDate ngay = goi.getNgayDk();
                if(ngay.isAfter(start) && ngay.isBefore(end)){
                    thoa=true;
                    break;
                }
            }
            if (thoa)
                bn.hienThi();
        }
    }
    public void hienThic(String x){
        this.ds.stream().filter(bn->bn.getMaBenhNhan().equals(x)).
                forEach(bn->bn.getGoiDk().
                        forEach(goi-> {
                            goi.hienThi();
                            if(goi.getNgayHetHan().isBefore(LocalDate.now()))
                                System.out.println("Goi da het han");
                            else
                                System.out.println("Goi con han");
                        }));
                
    }
    public void sapxep(){
        this.ds.sort((bn1, bn2) -> bn1.getNgaySinh().compareTo(bn2.getNgaySinh()));
    }
}
