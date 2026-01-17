/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class GoiThang extends GoiKham{
    private static int dem;
    
    public GoiThang(LocalDate ngayDk){
        super(++dem, ngayDk,ngayDk.plusMonths(1),ngayDk.getDayOfMonth() < 9 ? 5000 : 10000);
    }
    
    public GoiThang(String date){
        this(LocalDate.parse(date, CauHinh.FORMATTER));
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Goi thang | Ngay Dk: %s | Ngay het han: %s | gia tien: %.1f ",
                this.getNgayDk(), this.getNgayHetHan(), this.getGiaTien());
    }
    
    
    
}
