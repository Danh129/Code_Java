/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai3_TH3;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public abstract class Product {
    private String MaSp;
    private String TenSp;
    private String MoTa;
    private String NhaSx;
    private double Giaban;
    private LocalDate NgayPhatHanh;
    
    public Product(String MaSp, String ten, String mota, String nhasx, double giaban, LocalDate ngayphat){
        this.MaSp=MaSp;
        this.TenSp=ten;
        this.MoTa=mota;
        this.NhaSx=nhasx;
        this.Giaban=giaban;
        this.NgayPhatHanh=ngayphat;
    }

    /**
     * @return the MaSp
     */
    public String getMaSp() {
        return MaSp;
    }

    /**
     * @param MaSp the MaSp to set
     */
    public void setMaSp(String MaSp) {
        this.MaSp = MaSp;
    }

    /**
     * @return the TenSp
     */
    public String getTenSp() {
        return TenSp;
    }

    /**
     * @param TenSp the TenSp to set
     */
    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    /**
     * @return the MoTa
     */
    public String getMoTa() {
        return MoTa;
    }

    /**
     * @param MoTa the MoTa to set
     */
    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    /**
     * @return the NhaSx
     */
    public String getNhaSx() {
        return NhaSx;
    }

    /**
     * @param NhaSx the NhaSx to set
     */
    public void setNhaSx(String NhaSx) {
        this.NhaSx = NhaSx;
    }

    /**
     * @return the Giaban
     */
    public double getGiaban() {
        return Giaban;
    }

    /**
     * @param Giaban the Giaban to set
     */
    public void setGiaban(double Giaban) {
        this.Giaban = Giaban;
    }
    
    //xuat thong tin
    public void xuat(){
        System.out.println("Ma san pham:" + MaSp);
        System.out.println("Ten san pham:" + TenSp);
        System.out.println("Mo ta san pham:" + MoTa);
        System.out.println("Nha san xuat san pham:" + NhaSx);
        System.out.println("Gia ban san pham:" + Giaban);
        System.out.println("Ngay phat hanh san pham:" + getNgayPhatHanh());
    }
    
    //phan thong tin rieng
    protected abstract void ThongTinRieng();

    @Override
    public boolean equals(Object obj) {
        
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * @return the NgayPhatHanh
     */
    public LocalDate getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    /**
     * @param NgayPhatHanh the NgayPhatHanh to set
     */
    public void setNgayPhatHanh(LocalDate NgayPhatHanh) {
        this.NgayPhatHanh = NgayPhatHanh;
    }
    
    
}
