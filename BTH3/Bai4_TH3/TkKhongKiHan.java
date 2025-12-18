/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai4_TH3;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class TkKhongKiHan extends TaiKhoan{
    private static final double RATE =0.001; //0,1%/nam
    
    public TkKhongKiHan(String ThongTin, String TenTk, String DienThoai, String Email, 
            double SoTienTk, String NgayTaoTk, String TrangThaiTk){
        super(ThongTin, TenTk, DienThoai, Email, SoTienTk, NgayTaoTk, TrangThaiTk, "Khong ki han");
    }
    
    @Override
    public boolean TienRutHomNay(LocalDate today){
        return true;
    }
    
    @Override
    public boolean TienGuiHomNay(LocalDate today){
        return true;
    }
    
    @Override
    public void RutTien(double SoLuong, LocalDate today){
        if (SoLuong <= 0) throw new IllegalArgumentException("So tien phai lon hon 0");
        if (SoLuong > SoTienTk) throw new IllegalArgumentException ("So du khong du");
        SoTienTk-=SoLuong;
                
    }
}
