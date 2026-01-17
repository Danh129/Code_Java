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
public class BaoTri extends Drone{
    public BaoTri(String ma, String ten, LocalDate ngaySanXuat){
        super(ma, ten, ngaySanXuat, TrangThaiDrone.BAO_TRI);
    }    
    
    @Override
    public String trangThai(){
        return "Drone dang bao tri";
    }
}
