/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai3_TH3;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class BangDia extends Product{
    private double ThoiLuongPhat;
    
    public BangDia(String MaSp, String ten, String mota, String nhasx, double giaban,
            LocalDate ngayphat, double ThoiLuongPhat){
        super(MaSp, ten, mota, nhasx, giaban, ngayphat);
        this.ThoiLuongPhat=ThoiLuongPhat;
        
    }

    /**
     * @return the ThoiLuongPhat
     */
    public double getThoiLuongPhat() {
        return ThoiLuongPhat;
    }

    /**
     * @param ThoiLuongPhat the ThoiLuongPhat to set
     */
    public void setThoiLuongPhat(double ThoiLuongPhat) {
        this.ThoiLuongPhat = ThoiLuongPhat;
    }

    @Override
    protected void ThongTinRieng() {
        System.out.println("Thong Tin Bang Dia:");
        System.out.println("Thoi Luong Phat:" + ThoiLuongPhat);
       
    }
     
}
