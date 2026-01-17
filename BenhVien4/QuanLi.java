/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien4;

import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class QuanLi {
    ArrayList<BenhNhan> ds = new ArrayList<>();
    ArrayList<HoSoKham> hs = new ArrayList<>();
    public void themBenhNhan(BenhNhan bn){
        ds.add(bn);
    }
    
    public void hienThi(){
        for(BenhNhan bn: ds){
            bn.hien();
        }
    }
    public void them(HoSoKham h){
        hs.add(h);
        
    }
    public void themHoSo(){     
        for(HoSoKham h: hs){
            h.hienThi();
        }     
    }
    
    public void sapXep(){
        ds.sort((d1, d2) -> d2.getNgaySinh().compareTo(d1.getNgaySinh()));
    }
    
    public BenhNhan timBenhNhan(String ma){
        for(BenhNhan bn: ds){
            if(bn.getMaBn().equalsIgnoreCase(ma))
                bn.hien();         
        }
        return null;
    }
    
    public void hienBenhNhanDotXuat(String loai){
        for(HoSoKham h: hs){
            if(h.loaiHoSo().equalsIgnoreCase(loai))
                h.hienThi();
        } 
    }
    
    public void BenhNhanChiPhiCao(){
        BenhNhan max =ds.get(0);
        for(BenhNhan bn: ds){
            if(bn.chiPhi() > max.chiPhi())
                max=bn;
            System.out.println("Benh nhan co chi phi cao nhat:" + max);
        }
    }
    
    public void chiPhi(String ma){
        ds.stream().filter(c -> c.getMaBn().equals(ma)).forEach(c -> System.out.println("Tong tien: " + c.chiPhi()));
    }
}
