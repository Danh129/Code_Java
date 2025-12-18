/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.Bai1_TH3;

/**
 *
 * @author letha
 */
public class Demo {
    public static void main(String[] args){
        Ellip e = new Ellip(2, 6);
        System.out.println("======Ellip ban dau======");
        System.out.println("Dien Tich cua Ellip:" + e.DienTich());
        System.out.println("Chu Vi cua Ellip:" + e.ChuVi());
        
        //thay doi setter
        e.setBkTrucLon(4);
        e.setBkTrucNho(7);
        System.out.println("Dien Tich cua Ellip sau khi thay doi:" + e.DienTich());
        System.out.println("Chu Vi cua Ellip sau khi thay doi:" + e.ChuVi());
        
        Tron r = new Tron(2.5);
        System.out.println("Hinh Tron ban dau:" + r);
        System.out.println("========================");
        System.out.printf("Tron=[DienTich=%.4f, ChuVi=%.4f]%n", r.DienTich(), r.ChuVi());
        
        System.out.println("========================");
        System.out.println("a=" + r.getBkTrucLon());
        System.out.println("b=" + r.getBkTrucLon());
        
    }
}
