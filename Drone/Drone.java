/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drone;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author letha
 */
enum TrangThaiDrone{
   
    NHAN_ROI("Xanh"),
    DANG_GIAM_SAT("Vang"),
    BAO_TRI("Do");
    
    private String mau;
    
    TrangThaiDrone(String mau){
        this.mau=mau;
    }

    /**
     * @return the mau
     */
    public String getMau() {
        return mau;
    }
}
public abstract class Drone {
    private String ma;
    private String ten;
    private LocalDate ngaySanXuat;
    protected TrangThaiDrone trangthai;
    

    public Drone(String ma, String ten, LocalDate ngaySanXuat, TrangThaiDrone trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySanXuat = ngaySanXuat;
        this.trangthai = trangthai;
    }
    
    protected abstract String trangThai();
    
    
    
    public void hien(){
        System.out.println("Ma Drone: " + ma + " \nTen: " + ten + "\nNgay san xuat:" + ngaySanXuat + 
                "\n Trang thai:" + trangthai + "\n Mau:" + trangthai.getMau() + "\n ->Mo ta trang thai: " + trangThai() );
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
     * @return the ngaySanXuat
     */
    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    /**
     * @param ngaySanXuat the ngaySanXuat to set
     */
    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    
}
