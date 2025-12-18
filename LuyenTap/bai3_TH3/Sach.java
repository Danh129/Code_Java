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
public class Sach extends Product{
    private int sotrang;
    public Sach(String MaSp, String TenSp, String MoTa, String NhaSx, double Gia, 
            LocalDate NgayPhatHanh, int sotrang){
        super(MaSp, TenSp,MoTa, NhaSx, Gia, NgayPhatHanh);
        this.sotrang=sotrang;
    }

    /**
     * @return the sotrang
     */
    public int getSotrang() {
        return sotrang;
    }

    /**
     * @param sotrang the sotrang to set
     */
    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
   
    @Override
    protected void ThongTinRieng(){
        System.out.println("Loai Sach");
        System.out.println("So Trang:" + sotrang);
    }
    
    
    
}
