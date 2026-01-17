/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author letha
 */
public class BenhNhan {
    private String maBn;
    private String tenBn;
    private LocalDate ngaySinh;
    private List<GoiKham> goi = new ArrayList<>();

    public BenhNhan(String maBn, String tenBn, LocalDate ngaySinh) {
        this.maBn = maBn;
        this.tenBn = tenBn;
        this.ngaySinh = ngaySinh;
    }
    
    @Override
    public String toString(){
        return "Ma benh nhan:" + maBn + "| Ten benh nhan:" + tenBn + "| Ngay Sinh:" + ngaySinh;
    }
    
    public void goiDangKi(GoiKham g){
        goi.add(g);   
    }
    public double tongTien(){
        return goi.stream().mapToDouble(GoiKham::getGiaTien).sum();
    }

    /**
     * @return the maBn
     */
    public String getMaBn() {
        return maBn;
    }

    /**
     * @param maBn the maBn to set
     */
    public void setMaBn(String maBn) {
        this.maBn = maBn;
    }

    /**
     * @return the tenBn
     */
    public String getTenBn() {
        return tenBn;
    }

    /**
     * @param tenBn the tenBn to set
     */
    public void setTenBn(String tenBn) {
        this.tenBn = tenBn;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the goi
     */
    public List<GoiKham> getGoi() {
        return goi;
    }

    /**
     * @param goi the goi to set
     */
    public void setGoi(List<GoiKham> goi) {
        this.goi = goi;
    }
    
    
}
