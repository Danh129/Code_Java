/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.Bai2_TH3;

/**
 *
 * @author letha
 */
public class Demo {
    public static void main(String[] args){
        HinhChuNhat r = new HinhChuNhat(4.0, 5.0);
        System.out.println("======= Hinh Chu Nhat ======");
        System.out.println(r);
        System.out.println("Dien Tich HCN:" + r.DienTich());
        System.out.println("Chu Vi HCN:" + r.ChuVi());
        
        HinhVuong v = new HinhVuong(5.0);
        System.out.println("======= Hinh Vuonng ======");
        System.out.println(v);
        System.out.println("Dien Tich HV:" + v.DienTich());
        System.out.println("Chu Vi HV:" + v.ChuVi());
        
        TamGiac tgiac = new TamGiac(3.0, 7.0, 4.0);
        System.out.println("=======Tam Giac ===========");
        System.out.println(tgiac);
        System.out.println("Dien Tich Tam Giac:" + tgiac.DienTich());
        System.out.println("Chu Vi Tam Giac:" + tgiac.ChuVi());
        
        TamGiacCan tcan = new TamGiacCan(2.0, 4.0);
        System.out.println("=======Tam Giac Can ===========");
        System.out.println(tcan);
        System.out.printf("Dien Tich=%.3f, Chu Vi=%.3f %n", tcan.DienTich(), tcan.ChuVi());
        
        TamGiacDeu tdeu = new TamGiacDeu(4.0);
        System.out.println("======= Tam Giac Deu ===========");
        System.out.println(tdeu);
        System.out.printf("Dien Tich=%.3f, Chu Vi=%.3f", tdeu.DienTich(), tdeu.ChuVi());
    }
}
