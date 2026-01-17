/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien4;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class BenhNhan {
    private String maBn;
    private String tenBn;
    private LocalDate ngaySinh;
    private ArrayList<HoSoKham> ds = new ArrayList<>();

    public BenhNhan(String maBn, String tenBn, LocalDate ngaySinh) {
        this.maBn = maBn;
        this.tenBn = tenBn;
        this.ngaySinh = ngaySinh;
    }
    
    public void hien(){
        System.out.println("\n Ma benh nhan:" + maBn + "\n Ten benh nhan:" + tenBn + "\n Ngay sinh:" + ngaySinh + "\n Tong chi phi:" + chiPhi());
    }
    
    public void HoSo(HoSoKham hs){
        getDs().add(hs);
    }
    
    public double chiPhi(){
        return ds.stream().mapToDouble(HoSoKham::getChiPhi).sum();
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
     * @return the ds
     */
    public ArrayList<HoSoKham> getDs() {
        return ds;
    }
    
}
