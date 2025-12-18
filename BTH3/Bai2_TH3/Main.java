/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai2_TH3;

/**
 *
 * @author letha
 */
public class Main {
    public static void main(String[] args){
         HinhChuNhat rect = new HinhChuNhat(5.0, 4.0);
         System.out.println("\n========= Hinh Chu nhat =======");
         System.out.println(rect);
         System.out.printf("Dien Tich=%.3f, Chu Vi=%.3f", rect.DienTich(), rect.ChuVi());
         
         HinhVuong vuong = new HinhVuong(4.0);
         System.out.println("\n========= Hinh Vuong ========");
         System.out.println(vuong);
         System.out.printf("Dien Tich=%.3f, Chu Vi=%.3f", vuong.DienTich(), vuong.ChuVi());
         
         TamGiac t = new TamGiac(2.0, 4.0, 5.0);
         System.out.println("\n========= Tam Giac =======");
         System.out.println(t);
         System.out.printf("Dien Tich=%.3f, Chu Vi=%.3f", t.DienTich(), t.ChuVi());
         
         TamGiacCan tcan = new TamGiacCan(2.0, 4.0);
         System.out.println("\n========= Tam Giac Can =======");
         System.out.println(tcan);
         System.out.printf("Dien Tich=%.3f, Chu Vi=%.3f", tcan.DienTich(), tcan.ChuVi());
         
         TamGiacDeu tdeu = new TamGiacDeu(6.0);
         System.out.println("\n========= Tam Giac Deu =======");
         System.out.println(tdeu);
         System.out.printf("Dien Tich=%.3f, Chu Vi=%.3f", tdeu.DienTich(), tdeu.ChuVi());
    }
    
}
