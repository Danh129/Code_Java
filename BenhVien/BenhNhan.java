/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author letha
 */
public class BenhNhan {
    private String maBenhNhan;
    private String tenBenhNhan;
    private LocalDate ngaySinh;
    private List<GoiKham> GoiDk = new ArrayList<>();

    public BenhNhan(String maBenhNhan, String tenBenhNhan, LocalDate ngaySinh) {
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngaySinh = ngaySinh;
        
    }

    public BenhNhan(String maBenhNhan, String tenBenhNhan, String ngaySinh) {
        this(maBenhNhan, tenBenhNhan, LocalDate.parse(ngaySinh, CauHinh.FORMATTER));  
    }
    
    public void DkGoiKham(GoiKham...a){
        this.getGoiDk().addAll(Arrays.asList(a));
    }
    
    
    
    public void hienThi(){
        System.out.printf("\n Ma:%s \nTen:%s \nNgaySinh:%s", 
                maBenhNhan, tenBenhNhan, ngaySinh.format(CauHinh.FORMATTER));
        if(GoiDk == null){
            System.out.println("khong hop le");
        }
        else
            this.GoiDk.forEach(dk->dk.hienThi());
            System.out.println("Tong gia:" + tongTien());
    }
    
    public double tongTien(){
        double tong = 0;
        for(GoiKham goi: GoiDk){
            tong+=goi.getGiaTien();
        }
        return tong;
    }
    

    /**
     * @return the maBenhNhan
     */
    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    /**
     * @param maBenhNhan the maBenhNhan to set
     */
    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    /**
     * @return the tenBenhNhan
     */
    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    /**
     * @param tenBenhNhan the tenBenhNhan to set
     */
    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
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
     * @return the GoiDk
     */
    public List<GoiKham> getGoiDk() {
        return GoiDk;
    }

    /**
     * @param GoiDk the GoiDk to set
     */
    public void setGoiDk(List<GoiKham> GoiDk) {
        this.GoiDk = GoiDk;
    }

    
    
    
}
