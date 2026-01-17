/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public abstract class GoiKham {
    protected int maGoiKham;
    protected LocalDate ngayDk;
    protected LocalDate ngayHetHan;
    protected double giaTien;

    public GoiKham(int maGoiKham, LocalDate ngayDk, LocalDate ngayHetHan, double giaTien) {
        this.maGoiKham = maGoiKham;
        this.ngayDk = ngayDk;
        this.ngayHetHan = ngayHetHan;
        this.giaTien = giaTien;
    }
    
    public void hienThi(){
        System.out.println("ma goi:" + getMaGoiKham());
    }

    /**
     * @return the maGoiKham
     */
    public int getMaGoiKham() {
        return maGoiKham;
    }

    /**
     * @param maGoiKham the maGoiKham to set
     */
    public void setMaGoiKham(int maGoiKham) {
        this.maGoiKham = maGoiKham;
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
