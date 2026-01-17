/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien4;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class DotXuat extends HoSoKham{
    public DotXuat(String maHs, LocalDate ngayDk, String tenHs){
        super(maHs, ngayDk, tenHs);
    }
    
    @Override
    public void chiPhi(){
        if (NgayDk.getDayOfMonth() <= 1){
            chiPhi = 500;
        }
        else
            chiPhi = 0;
    }
     
    @Override
    protected void ngayTaiKham(){
        ngayTaiKham = NgayDk.plusDays(1);
    }
    
    @Override
    public String loaiHoSo(){
        return "Dot Xuat";
    }
    
}
