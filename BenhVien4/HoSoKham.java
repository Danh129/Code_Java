/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien4;

import java.time.LocalDate;

/**
 *
 * @author letha
 */

public abstract class HoSoKham {
    protected String maHs;
    protected String tenHs;
    protected LocalDate NgayDk;
    protected LocalDate ngayTaiKham;
    protected double chiPhi;

    public HoSoKham(String maHs, LocalDate NgayDk, String tenHs) {
        this.maHs = maHs;
        this.NgayDk = NgayDk;
        this.tenHs = tenHs;
        ngayTaiKham();
        chiPhi();
    }
    
    protected abstract String loaiHoSo();
    protected abstract void chiPhi();
    protected abstract void ngayTaiKham();
    
    public boolean han(){
        return !LocalDate.now().isAfter(ngayTaiKham);
    }
    
    public void hienThi(){
        System.out.println("\n Ma Ho So:" + maHs + "\n Ngay Dk:" + NgayDk + "\n Ten ho so:" + tenHs + "\n Ngay Tai kham:" + (han() ? "Tai Kham" : "Chua den Tai Kham"));
    }

    /**
     * @return the maHs
     */
    public String getMaHs() {
        return maHs;
    }

    /**
     * @param maHs the maHs to set
     */
    public void setMaHs(String maHs) {
        this.maHs = maHs;
    }

    /**
     * @return the NgayDk
     */
    public LocalDate getNgayDk() {
        return NgayDk;
    }

    /**
     * @param NgayDk the NgayDk to set
     */
    public void setNgayDk(LocalDate NgayDk) {
        this.NgayDk = NgayDk;
    }

    /**
     * @return the ngayTaiKham
     */
    public LocalDate getNgayTaiKham() {
        return ngayTaiKham;
    }

    /**
     * @param ngayTaiKham the ngayTaiKham to set
     */
    public void setNgayTaiKham(LocalDate ngayTaiKham) {
        this.ngayTaiKham = ngayTaiKham;
    }

    /**
     * @return the chiPhi
     */
    public double getChiPhi() {
        return chiPhi;
    }

    /**
     * @param chiPhi the chiPhi to set
     */
    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    /**
     * @return the tenHs
     */
    public String getTenHs() {
        return tenHs;
    }

    /**
     * @param tenHs the tenHs to set
     */
    public void setTenHs(String tenHs) {
        this.tenHs = tenHs;
    }
    
    
}
