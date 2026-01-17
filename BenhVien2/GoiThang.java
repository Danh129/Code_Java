/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien2;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class GoiThang extends GoiKham{
    public GoiThang(String maGoi, LocalDate ngayDk){
        super(maGoi, ngayDk);
        
    }
    @Override
    protected void tongTien(){
        if(ngayDk.getDayOfMonth() < 9)
            giaTien = 5000;
        else
            giaTien = 10000;
    }

    @Override
    protected void ngayhan(){
        ngayHetHan = ngayDk.plusMonths(1);
    }
    
    @Override
    public String toString(){
        return "Goi Thang | " + "Ma goi: " + maGoi + " | Ngay Dk:" + ngayDk;
    }
    
    
}
