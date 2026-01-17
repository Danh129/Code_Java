/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhuyenMai;

import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class SanPham {
    private String maSp;
    private String tenSp;
    private double giaBan;
    private ArrayList<KhuyenMai> ds = new ArrayList<>();

    public SanPham(String maSp, String tenSp, double giaBan) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaBan=giaBan;
        
        
    }
    public void KhuyenMai(KhuyenMai km){
        getDs().add(km);
    }

    
    public void hienThi(){
        System.out.println("\nMa san pham: " + maSp + "\nTen san pham: " + tenSp + "\nGia Ban: " + giaBan );
    }
    
    

    /**
     * @return the maSp
     */
    public String getMaSp() {
        return maSp;
    }

    /**
     * @param maSp the maSp to set
     */
    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    /**
     * @return the tenSp
     */
    public String getTenSp() {
        return tenSp;
    }

    /**
     * @param tenSp the tenSp to set
     */
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    /**
     * @return the ds
     */
    public ArrayList<KhuyenMai> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<KhuyenMai> ds) {
        this.ds = ds;
    }
    
}
