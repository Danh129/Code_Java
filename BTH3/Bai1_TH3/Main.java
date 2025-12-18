/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai1_TH3;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
        //Tao Ellipse
        Ellipse e = new Ellipse(5.0, 4.0);
        //Xuat
        System.out.println("Ellipse ban dau:" + e.toString());
        System.out.println("Dien Tich la:" + e.DienTich());
        System.out.println("Chi vi la:" + e.ChuVi());
        
        //Thay doi thuoc tinh setter
        e.setBkTrucLon(4.0);
        e.setBkTrucNho(3.0);
        System.out.println("-----------------------");
        System.out.println("Ellipse luc sau:" + e);
        
        //Tao Circle
        Circle c = new Circle(2.5);
        System.out.println("Circle:" + c);
        System.out.println("-----------------------");
        System.out.printf("DienTich=%.6f, ChuVi=%.6f%n",
                c.DienTich(), c.ChuVi());
        //Circle dung phuong thuc Ellipse
        System.out.print("--------------------------");
        System.out.printf("\nCircle a=" + c.getBkTrucLon());
        System.out.printf("\nCircle b=" + c.getBkTrucNho());
    }
}
