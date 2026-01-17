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
public class GoiNam extends GoiKham{
    public GoiNam(String maGoi, LocalDate ngayDk){
        super(maGoi, ngayDk);
    }
    
    @Override
    protected void tongTien(){
        LocalDate moc1 = LocalDate.of(ngayDk.getYear(), 5, 1);
        LocalDate moc2 = LocalDate.of(ngayDk.getYear(), 9, 13);
        if(ngayDk.isBefore(moc1))
            giaTien = 10000;
        else if(ngayDk.isAfter(moc2))
            giaTien = 20000;
        else
            giaTien = 15000;
    }
    
    @Override
    protected void ngayhan(){
        ngayHetHan = ngayDk.plusYears(1);
    }
    
    @Override
    public String toString(){
        return "Goi Nam |" + "Ma goi: " + maGoi + "| Ngay Dk:" + ngayDk;
    }
    
}
