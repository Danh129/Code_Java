/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai1_TH3;

/**
 *
 * @author letha
 */
public class Circle extends Ellipse{
    
    //constructor: truyen radius cho bk 2 truc
    public Circle(double radius){
        super(radius, radius);
    }
    //Phuong thuc dac biet
    public double ChuVi(){
        return 2 * Math.PI * getBkTrucLon();
    }
    
    @Override
    public String toString(){
        return String.format("Circle[getBkTrucLon=%.4f, DienTich=%.4f, ChuVi=%.4f]", 
                getBkTrucLon(), DienTich(), ChuVi());
    }
    
}
