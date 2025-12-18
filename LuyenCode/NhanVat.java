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
public class NhanVat {
    private int MaNv;
    private String ten;
    
    ArrayList<VatPham> ds =new ArrayList<>();
    public NhanVat(int MaNv, String ten){
        this.MaNv=MaNv;
        this.ten=ten;
    }
    
    public int SoLuongVatPham(){
        return ds.size();
    }
    
    public int tongLuotChoi(){
        int tong = 0;
        for(VatPham vp: ds){
            tong+=vp.SoLuongLuotChoi();
        }
        return tong;
    }
    
    public void themVatPham(VatPham vp){
        ds.add(vp);
    }
    
    public void hienThi(){
        System.out.println("Ma nhan vat:" + MaNv + "Ten nhan vat:" + ten);
        System.out.println("Tong Luot choi:" + tongLuotChoi());
        for(VatPham vp: ds){
            vp.hienThi();
        }
    }
    

    /**
     * @return the MaNv
     */
    public int getMaNv() {
        return MaNv;
    }

    /**
     * @param MaNv the MaNv to set
     */
    public void setMaNv(int MaNv) {
        this.MaNv = MaNv;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }
    
}
