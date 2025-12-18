/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai4_TH3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author letha
 */
public class Demo {
    public static void main(String[] args){
        List<TaiKhoan> taikhoan=new ArrayList<>();
        
        taikhoan.add(new TkKhongKiHan("0001", "Nguyen Van S", "0965437824", "a@gmail.com", 
        1000.0, LocalDate.now().minusMonths(2).toString(), "Hoat Dong"));
        taikhoan.add(new TkCoKiHan("0002", "Le Tri N", "0873465239", "p@gmail.com", 5000.0
                , LocalDate.now().minusDays(15).toString(), "Hoat Dong", KyHan.Mot_Thang, LocalDate.now()));
        for (TaiKhoan a: taikhoan){
            System.out.println(a.ThongTin());
        }
    }           
}
