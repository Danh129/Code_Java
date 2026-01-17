/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien2;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public abstract class GoiKham {
    protected String maGoi;
    protected LocalDate ngayDk;
    protected LocalDate ngayHetHan;
    protected double giaTien;

    public GoiKham(String maGoi, LocalDate ngayDk) {
        this.maGoi = maGoi;
        this.ngayDk = ngayDk;
        tongTien();
        ngayhan();
    }
    protected abstract void tongTien();
    protected abstract void ngayhan();
    
    //cau c xem con han hay kh vs tim ma
    public boolean conHan(){
        return !LocalDate.now().isAfter(ngayHetHan);
    }
    @Override
    public String toString(){
        return maGoi + " | DK: " + ngayDk + " |Ngay het han: " + ngayHetHan +
                " |Gia:" + giaTien + " | " + (conHan() ? "Con han" : "het han");
                
    }

    /**
     * @return the maGoi
     */
    public String getMaGoi() {
        return maGoi;
    }

    /**
     * @param maGoi the maGoi to set
     */
    public void setMaGoi(String maGoi) {
        this.maGoi = maGoi;
    }

    /**
     * @return the ngayDk
     */
    public LocalDate getNgayDk() {
        return ngayDk;
    }

    /**
     * @param ngayDk the ngayDk to set
     */
    public void setNgayDk(LocalDate ngayDk) {
        this.ngayDk = ngayDk;
    }

    /**
     * @return the ngayHetHan
     */
    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    /**
     * @param ngayHetHan the ngayHetHan to set
     */
    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    /**
     * @return the giaTien
     */
    public double getGiaTien() {
        return giaTien;
    }

    /**
     * @param giaTien the giaTien to set
     */
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    
}
