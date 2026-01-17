/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhuyenMai;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class KhuyenMai_A extends KhuyenMai{
    private double tyLeGiam;
    public KhuyenMai_A(String maKhuyenMai, LocalDate ngayTao, LocalDate ngayHetHan, double tyLeGiam){
        super(maKhuyenMai, ngayTao, ngayHetHan);
        this.tyLeGiam=tyLeGiam;
    }
    
   @Override
   public String hien(){
       return "A";
   }
    
}
