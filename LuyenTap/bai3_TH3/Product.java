/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.bai3_TH3;

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
    private double Gia;
    private LocalDate NgayPhatHanh;
    
    public Product(String MaSp, String TenSp, String MoTa, String NhaSx, double Gia, LocalDate NgayPhatHanh){
        this.MaSp=MaSp; 
        this.TenSp=TenSp;
        this.MoTa=MoTa;
        this.NhaSx=NhaSx;
        this.Gia=Gia;
        this.NgayPhatHanh=NgayPhatHanh;
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
     * @return the Gia
     */
    public double getGia() {
        return Gia;
    }

    /**
     * @param Gia the Gia to set
     */
    public void setGia(double Gia) {
        this.Gia = Gia;
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
    
    public void Xuat(){
        System.out.println("ma san pham:" + MaSp);
        System.out.println("ten san pham:" + TenSp);
        System.out.println("mo ta san pham:" + MoTa);
        System.out.println("nha san xuat" + NhaSx);
        System.out.println("Gia ban:" + Gia);
        System.out.println("Ngay phat hanh" + getNgayPhatHanh());
    }
    
    protected abstract void ThongTinRieng();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
