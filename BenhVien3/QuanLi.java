/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien3;

import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class QuanLi {
    ArrayList<Nguoi> ds = new ArrayList<>();
    ArrayList<DichVu> dv = new ArrayList<>();
    public void themBenhNhan(Nguoi n){
        ds.add(n);
    }
    public void hienThi(){
        for(Nguoi n: ds){
            n.hien();
        }
    }
    public void themDv(DichVu d){
        dv.add(d);
    }
    public void hienDichVu(){
        for(DichVu d: dv){
            d.hien();
        }
    }
    
    public void timKiemDv(String ten){
        ds.stream().filter(d -> d.getTen().equals(ten)).forEach(System.out::println);
        
    }
    
    public void timKiemTheoLoai(String loai){
        for (DichVu d: dv){
            if (d.loaiDv().equalsIgnoreCase(loai))
                d.hien();
        }
    }
    
    public void timDvDuoi20Nam(){
        for(DichVu d: dv){
            if (d.SoNamHoatDong() < 20){
                d.hien();
                System.out.println("So nam hoat dong: " + d.SoNamHoatDong());
            }
        }
    }
    
    public void SapXepTheoNam(){
        dv.sort((d1, d2) -> d1.getNamXayDung().compareTo(d2.getNamXayDung()));
    }
    
}
