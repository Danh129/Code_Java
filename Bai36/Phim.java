/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai36;

/**
 *
 * @author letha
 */
public class Phim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngayChieu;
    public Phim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu ){
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }
    
    public String gettenPhim(){
        return tenPhim;
    }
    
    public void settenPhim(String tenPhim){
        this.tenPhim =tenPhim;
    }
    
    public int getnamSanXuat(){
        return namSanXuat;
    }
    
    public void setnamSanXuat(int namSanXuat){
        this.namSanXuat = namSanXuat;
    }
    
    public HangSanXuat gethangSanXuat(){
        return hangSanXuat;
    }
    
    public void sethangSanXuat(HangSanXuat hangSanXuat){
        this.hangSanXuat = hangSanXuat;
    }
    
    public double getgiaVe(){
        return giaVe;
    }
    
    public void setgiaVe(double giaVe){
        this.giaVe =giaVe;
    }
    
    public Ngay getngayChieu(){
        return ngayChieu;
    }
    
    public void setngayChieu(Ngay ngayChieu){
        this.ngayChieu = ngayChieu;
    }
    
    @Override
    public String toString(){
        return "Phim " + tenPhim + ", namSanXuat: " + namSanXuat + ", Hang san xuat:" + hangSanXuat 
                + ", Gia ve: " + giaVe + ", ngay Chieu" + ngayChieu;
    }
}
