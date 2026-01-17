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
public class GangGSat extends Drone{
    public GangGSat(String ma, String ten, LocalDate ngaySanXuat){
        super(ma, ten, ngaySanXuat, TrangThaiDrone.DANG_GIAM_SAT);
    }    
    
    @Override
    public String trangThai(){
        return "Drone dang thuc hien giam sat";
    }
}
