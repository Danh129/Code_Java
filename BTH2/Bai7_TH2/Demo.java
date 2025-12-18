/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2.Bai7_TH2;
import java.io.FileNotFoundException;
/**
 *
 * @author letha
 */
public class Demo {
    public static void main(String[] args){
        HocVien hv1 = new HocVien("Nguyen Van A", "12/12/2005");
        HocVien hv2 = new HocVien("Chu Van B", "04/12/2004");
        HocVien hv3 = new HocVien("Le Van L", "15/07/2004");
        
        QuanLi ql = new QuanLi();
        ql.themHv(hv1, hv2, hv3);
        ql.hien();
        
        
//        ql.them("src/main/resouces/hocvien.txt");
//        ql.hien();
        
//        System.out.println("--------Nhap Diem --------");
//        ql.nhapDiem();
//        ql.hien();
//        
//        System.out.println("--------Danh sach nhan hoc bong-----");      
//        ql.TimKiem().forEach(h -> h.hien());
//        
//        System.out.println("--------Sap xep theo diem tb-------");
//        ql.sapxep();
//        ql.hien();
        
        System.out.print("-----------Sap xep theo thang va ten--------");
        ql.sx();
        ql.hien();
        
        System.out.println("=======thong ke=======");
        ql.ThongkeTuoi();
        ql.hien();
    }
}
