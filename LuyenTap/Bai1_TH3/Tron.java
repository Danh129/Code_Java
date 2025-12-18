/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.Bai1_TH3;

/**
 *
 * @author letha
 */
public class Tron extends Ellip{
    public Tron(double radius){
        super(radius, radius);
    }
    
    public double ChuVi(){
        return 2 * Math.PI * getBkTrucLon();
    }
    
    @Override
    public String toString(){
        return String.format("Tron=[getBkTrucLon=%.2f, DienTich=%.2f, ChuVi=%.2f]", 
                getBkTrucLon(), DienTich(), ChuVi());
    }
}
