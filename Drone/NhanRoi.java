/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drone;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public class NhanRoi extends Drone{
    public NhanRoi(String ma, String ten, LocalDate ngaySanXuat){
        super(ma, ten, ngaySanXuat, TrangThaiDrone.NHAN_ROI);
    }    
    
    @Override
    public String trangThai(){
        return "Drone dang trong trang thai san sang nhiem vu";
    }
    
}
