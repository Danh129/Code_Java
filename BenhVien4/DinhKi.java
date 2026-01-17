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
public class DinhKi extends HoSoKham{
    public DinhKi(String maHs, LocalDate ngayDk, String tenHs){
        super(maHs, ngayDk, tenHs);
    }
    
    @Override
    public void chiPhi(){
        if (NgayDk.getDayOfMonth() < 15){
            chiPhi = 200;
        }
        else
            chiPhi = 300;
    }
     
    @Override
    protected void ngayTaiKham(){
        ngayTaiKham = NgayDk.plusMonths(1);
    }
    
    @Override
    public String loaiHoSo(){
        return "Dinh Ki";
    }
    
    
    
}
