/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author letha
 */
public abstract class DichVu {
    private String ma;
    private String ten;
    private LocalDate namXayDung;

    public DichVu(String ma, String ten, LocalDate namXayDung) {
        this.ma = ma;
        this.ten = ten;
        this.namXayDung = namXayDung;
    }
    
    protected abstract String loaiDv();
    
    
    
    public int SoNamHoatDong(){
        return Period.between(namXayDung, LocalDate.now()).getYears();
    }
    
    public void hien(){
        System.out.println("Ma: " + ma + "Ten: " + ten + "Nam xay dung: " + namXayDung);
    }

    /**
     * @return the ma
     */
    public String getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(String ma) {
        this.ma = ma;
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

    /**
     * @return the namXayDung
     */
    public LocalDate getNamXayDung() {
        return namXayDung;
    }

    /**
     * @param namXayDung the namXayDung to set
     */
    public void setNamXayDung(LocalDate namXayDung) {
        this.namXayDung = namXayDung;
    }
    
}
