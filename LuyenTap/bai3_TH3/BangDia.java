/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.bai3_TH3;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class BangDia extends Product{
    private double ThoiLuong;
    public BangDia(String MaSp, String TenSp, String MoTa, String NhaSx, double Gia, 
            LocalDate NgayPhatHanh, double ThoiLuong){
        super(MaSp, TenSp, MoTa, NhaSx, Gia, NgayPhatHanh);
        this.ThoiLuong=ThoiLuong;
    }

    /**
     * @return the ThoiLuong
     */
    public double getThoiLuong() {
        return ThoiLuong;
    }

    /**
     * @param ThoiLuong the ThoiLuong to set
     */
    public void setThoiLuong(double ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }
    
    @Override
    protected void ThongTinRieng(){
        System.out.println("Loai Bang Dia");
        System.out.println("Thoi Luong phat:" + ThoiLuong);
    }
}
