/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class Nguoi {
    private String ma;
    private String ten;
    private LocalDate ngaySinh;
    private ArrayList<DichVu> dv = new ArrayList<>();

    public Nguoi(String ma, String ten, LocalDate ngaySinh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }
    
    public void Loai(DichVu d){
        getDv().add(d);
        
    }
   
    public void hien(){
        System.out.println("Ma benh nhan: " + ma + "| Ten benh nhan: " + ten + "Ngay sinh: " + ngaySinh); 
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
     * @return the dv
     */
    public ArrayList<DichVu> getDv() {
        return dv;
    }
    
    

    
    
}
