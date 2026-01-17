/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhuyenMai;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author letha
 */
public class KhuyenMai_B extends KhuyenMai {
    List<String> danhSachDv;
    public KhuyenMai_B(String maKhuyenMai, LocalDate ngayTao, LocalDate ngayHetHan, List<String> dv){
        super(maKhuyenMai, ngayTao, ngayHetHan);
        this.danhSachDv=dv;
    }
    
   @Override
   public String hien(){
       return "B";
   }
}
