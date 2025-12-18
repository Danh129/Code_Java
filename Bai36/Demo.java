/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai36;

/**
 *
 * @author letha
 */
public class Demo {
    public static  void main(String[] args){
        Ngay ngay1 = new Ngay(15, 05, 2025);
        Ngay ngay2 = new Ngay(31, 01, 2025);
        Ngay ngay3 = new Ngay(16, 02, 2025);
        
        HangSanXuat hangSanXuat1 =new HangSanXuat("Hang A", "Viet Nam");
        HangSanXuat hangSanXuat2 =new HangSanXuat("Hang B", "My");
        HangSanXuat hangSanXuat3 =new HangSanXuat("Hang c", "Uc");
        
        Phim phim1 = new Phim("Bo Gia", 2020, hangSanXuat1, 65000, ngay1);
        Phim phim2 = new Phim("Running", 2021, hangSanXuat2, 100000, ngay2);
        Phim phim3 = new Phim("Kham Pha Ba Lan", 2022, hangSanXuat3, 75000, ngay3);
        
        System.out.println(phim1);
        System.out.println(phim2);
        System.out.println(phim3);
    }
}
