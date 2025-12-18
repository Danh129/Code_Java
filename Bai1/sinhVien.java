/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author letha
 */
public class sinhVien {
    private String mssv;
    private String tensv;
    private double diemLT;
    private double diemTH;
    
    /** constructor mac dinh */
    public sinhVien(){
    }
    
    public sinhVien(String mssv, String tensv, double diemLT, double diemTH){
        this.mssv = mssv;
        this.tensv = tensv;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    
    public String getmssv(){
        return mssv;
    }
    public void setmssv(String mssv){
        this.mssv = mssv;
    }
    
    public String gettensv(){
        return tensv;
    }
    public void settensv(String tensv){
        this.tensv = tensv;
    }
    
    public double getdiemLT(){
        return diemLT;
    }
    public void setdiemLT(double diemLT){
        this.diemLT = diemLT;
    }
    
    public double getdiemTH(){
        return diemTH;
    }
    public void setdiemTH(double diemTH){
        this.diemTH = diemTH;
    }
    
    //Tinh diem tb
    public double diemTB(){
        return (diemLT + diemTH) / 2;
    }
    
    //hien thi thong tin cua sinh vien
    @Override
    public String toString(){
         return String.format("%-10s %-20s %8.2f %10.2f %10.2f",
                mssv, tensv, diemLT, diemTH, diemTB());
    }
}
