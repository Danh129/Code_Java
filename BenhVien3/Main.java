/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BenhVien3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Nguoi n1 = new Nguoi("001", "Danh", LocalDate.parse("12/09/2023", fm));
        Nguoi n2 = new Nguoi("002", "Tu", LocalDate.parse("22/09/2023", fm));
        QuanLi ql = new QuanLi();
        ql.themBenhNhan(n1);
        ql.themBenhNhan(n2);
        System.out.println("============== Cau a ==============");
        ql.hienThi();
        
        //Mai on lai nho tim hieu them them dich vu vao n1, n2
        DichVu d1 = new YTe("B01", "Y te", LocalDate.parse("13/09/2024", fm));
        DichVu d2 = new BaiXe("B02", "Bai xe", LocalDate.parse("11/07/2000", fm));
        //Dung dc khi themDv nam o lop quan li
        ql.themDv(d1);
        ql.themDv(d2);
        System.out.println("=============Cau b =============");
        ql.hienDichVu();
        
        
        ql.timKiemDv("Y Te");
        
        System.out.println("============= Cau d ===============");
        ql.timKiemTheoLoai("Bai Xe");
        
        System.out.println("============ Cau c ================");
        ql.timDvDuoi20Nam();
       
        System.out.println("============ Cau e =================");
        ql.SapXepTheoNam();
        ql.hienDichVu();
        
    }
}
