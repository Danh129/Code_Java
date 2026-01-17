/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien3;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class BaiXe extends DichVu{
    
    public BaiXe(String ma, String ten, LocalDate namXayDung){
        super(ma, ten, namXayDung);
    }
    
    @Override
    public String loaiDv(){
        return "Bai Xe";
    }
    
}
