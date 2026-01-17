/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author letha
 */
public class GoiNam extends GoiKham{
    private static int dem;
    
    public GoiNam(LocalDate ngayDk){
        super(++dem, ngayDk, ngayDk.plusYears(1), tinhTien(ngayDk));
    }
    
    private static double tinhTien(LocalDate ngayDk){
        LocalDate m1_5 = LocalDate.of(ngayDk.getYear(), 1, 5);
        LocalDate m13_9 = LocalDate.of(ngayDk.getYear(), 13, 9);
        if (ngayDk.isBefore(m1_5)){
            return 9000;
        }
        else if (ngayDk.isAfter(m13_9)){
            return 20000;
        }
        else
            return 15000;
    }

    
    public GoiNam(String date){
        this(LocalDate.parse(date, CauHinh.FORMATTER));
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Goi nam | Ngay Dk: %s | Ngay het han: %s | gia tien: %.1f ",
                this.getNgayDk(), this.getNgayHetHan(), this.getGiaTien());
    }
    
}
