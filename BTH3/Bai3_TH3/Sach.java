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
public class Sach extends Product{
    private int SoTrang;
    
    public Sach(String MaSp, String ten, String mota, String nhasx, double giaban,
            LocalDate ngayphat, int sotrang){
        super(MaSp, ten, mota, nhasx, giaban, ngayphat);
        this.SoTrang=sotrang;
    }

    /**
     * @return the SoTrang
     */
    public int getSoTrang() {
        return SoTrang;
    }

    /**
     * @param SoTrang the SoTrang to set
     */
    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    @Override
    protected void ThongTinRieng() {
        System.out.println("Loai Sach");
        System.out.println("So Trang: " + SoTrang);
    
    }
    
    
    
}
