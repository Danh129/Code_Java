/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //boi uu tien la int nne phai dung Inter....
        NhiemVu nv1 = new NhiemVu("Dron1", Integer.parseInt("1"), LocalDate.parse("12/02/2023", fm));
        NhiemVu nv2 = new NhiemVu("Dron2", Integer.parseInt("3"), LocalDate.parse("12/07/2024", fm));
        NhiemVu nv3 = new NhiemVu("Dron3", Integer.parseInt("2"), LocalDate.parse("12/05/2023", fm));
        QuanLi ql = new QuanLi();
        
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        
        
        System.out.println("========= Cau a =========");
        ql.hienThi();
        
        nv1.Drone(new BaoTri("A01", "Bao Tri 1", LocalDate.parse("12/09/2024", fm)));
        nv2.Drone(new GangGSat("B01", "Dang Giam Sat1", LocalDate.parse("23/12/2024", fm)));
        nv3.Drone(new NhanRoi("C01", "Nhan Roi 1", LocalDate.parse("11/09/2024", fm)));
        System.out.println("========== Cau b =========");
        ql.hienDrone(LocalDate.parse("01/01/2024", fm), LocalDate.parse("31/12/2024", fm));
        
        System.out.println("========= In Drone Thu 2 ========");
        ql.hienDron2();
        
        System.out.println("========== cau c ==========");
        ql.timTheoTen("Dron3");
        
        
        System.out.println("========= Cau e =========");
        ql.sapXep();
        ql.hienThi();
        
        System.out.println("=========== Dem ===============");
        System.out.println("So luong Drone: " + ql.demSoLuongDrone());
        
    }
}
