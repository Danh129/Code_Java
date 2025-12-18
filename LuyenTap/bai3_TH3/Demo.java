/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.bai3_TH3;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author letha
 */
public class Demo {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        QuanLi ql = new QuanLi();
        DateTimeFormatter m = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (true){
            System.out.println("Quan Li Cong Ty San Xuat Sach va Bang Dia");
            System.out.println("1. Them san pham");
            System.out.println("2. Xoa san pham");
            System.out.println("3. Cap nhat ");
            System.out.println("4. Tim kiem");
            System.out.println("5. Sap xep");
            System.out.println("6. Hien thi");
            System.out.println("7. Thoat");
            System.out.print("Chon tu 1 den 7:");
            
            String chon = sc.nextLine().trim();
            switch(chon){
                case "1":
                    them(ql);
                    break;
                case "2":
                    xoa(ql);
                    break;
                case "3":
                    capnhat(ql);
                    break;
                case "4":
                    timkiem(ql);
                    break;
                case "5":
                    ql.sapxep();
                    break;
                case "6":
                    ql.hien();
                    break;
                case "7":
                    System.out.print("Cam on!");
                    sc.close();
                    return;
                default:
                    System.out.print("Khong hop le!");
            }
        }     
    }
    
    private static Product inputSach(){
        System.out.println("nhap ma sp:");
        String MaSp = sc.nextLine().trim();
        System.out.println("nhap ten sp:");
        String ten = sc.nextLine().trim();
        System.out.println("nhap mo ta:");
        String mota = sc.nextLine().trim();
        System.out.println("nhap nha san xuat:");
        String nhasx = sc.nextLine().trim();
        
        double giaban = readDouble("nhap gia ban:");
        LocalDate ngayphat = readDate("nhap ngay phat:");
        int sotrang = (int) readDouble("nhap thoi luong:");
        return new Sach(MaSp, ten, mota, nhasx, giaban, ngayphat, sotrang);
    }
    
    private static Product inputBangDia(){
        System.out.println("nhap ma sp:");
        String MaSp = sc.nextLine().trim();
        System.out.println("nhap ten sp:");
        String ten = sc.nextLine().trim();
        System.out.println("nhap mo ta:");
        String mota = sc.nextLine().trim();
        System.out.println("nhap nha san xuat:");
        String nhasx = sc.nextLine().trim();
        
        double giaban = readDouble("nhap gia ban:");
        LocalDate ngayphat = readDate("nhap ngay phat:");
        double ThoiLuongPhat = readDouble("nhap thoi luong:");
        return new BangDia(MaSp, ten, mota, nhasx, giaban, ngayphat, ThoiLuongPhat);
    }
    
    //Doc double
    private static double readDouble(String d){
        while (true){
            System.out.print(d);
            String line = sc.nextLine().trim();
            try {
                return Double.parseDouble(line);
            }catch (NumberFormatException e){
                System.out.print("Khong hop le!");
            }
        }
    }
    //Doc Date
    private static java.time.LocalDate readDate(String d){
        java.time.format.DateTimeFormatter f = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (true){
            System.out.print(d);
            String line = sc.nextLine().trim();
            if (line.isEmpty()){
                return null;
            }       
            try {
                return java.time.LocalDate.parse(line, f);
            }catch (java.time.DateTimeException e){
                System.out.print("Khong hop le!");
            }
        }
    }
    //them
    private static void them(QuanLi ql){
        System.out.println("Moi nhap lua chon cua ban:");
        System.out.println("1. Them Sach");
        System.out.println("2. Them Bang Dia");
        String t = sc.nextLine().trim();
        if (t.equals("1")){
            Product b = inputSach();
            ql.them(b);
        }else if (t.equals("2")){
            Product c = inputBangDia();
            ql.them(c);
        }else{
            System.out.print("khong hop le!");
        }
    }
    
    //xoa
    private static void xoa(QuanLi ql){
        System.out.println("1. Xoa theo ma");
        System.out.println("2. Xoa theo doi tuong");
        String t = sc.nextLine().trim();
        if (t.equals("1")){           
        System.out.print("nhap ma can xoa:");
        String id = sc.nextLine().trim();
        ql.xoatheoma(id);
        }
        else if(t.equals("2")){
            System.out.println("nhap ma can xoa:");
            String id = sc.nextLine().trim();
            Product p = ql.TimMa(id);
            if (p != null){
                ql.xoatheodoituong(p);
            }
            else
                System.out.println("khong hop le");       
        }      
    }
    
    //cap nhat
    private static void capnhat(QuanLi ql){
        System.out.println("Nhap ma san pham: ");
        String id = sc.nextLine().trim();
        Product p = ql.TimMa(id);
        if (p == null){
            System.out.println("khong tim thay");
            return;
        }
        System.out.println("San pham hien tai:");
        p.Xuat();
        
        System.out.println("Ban hay chon cap nhat:");
        System.out.println("1: Cap nhat ten");
        System.out.println("2. Cap nhat mo ta");
        System.out.println("3. Cap nhat gia ban");
        System.out.println("4. Cap nhap ngay phat hanh");
        System.out.println("5. Cap nhat ma san pham");
        String op = sc.nextLine().trim();
        
        switch(op){
            case "1":{
                System.out.println("Nhap ten moi:");
                p.setTenSp(sc.nextLine().trim());
                System.out.println("Da cap nhat");
                break;
            }
            case "2":{
                System.out.println("Nhap mo ta moi:");
                p.setMoTa(sc.nextLine().trim());
                System.out.println("Da cap nhat");
                break;
            }
            case "3":{
                double giamoi = readDouble("Nhap gia ban moi:");
                p.setGia(giamoi);
                System.out.println("Da cap nhat");
                break;
            }
            case "4":{
                LocalDate d = readDate("Nhap ngay phat hanh moi:");
                p.setNgayPhatHanh(d);
                System.out.println("Da cap nhat");
                break;
            }
            case "5":{
                System.out.println("Nhap ma san pham moi:");
                p.setMaSp(sc.nextLine().trim());
                System.out.println("Da cap nhap");
                break;
            }
            default:
                System.out.println("khong hop le!");
                break;
        }  
    }
    
    //tim kiem
    private static void timkiem(QuanLi ql){
        System.out.println("Ban hay chon Phuong thuc tim kiem:");
        System.out.println("1. Tim kiem theo ma");
        System.out.println("2. Tim kiem theo mo ta hoac ten san pham");
        System.out.println("3. Tim kiem theo khoang gia");
        System.out.println("4. Tim kiem theo ngay phat hanh");
        String op = sc.nextLine().trim();
        switch(op){
            case "1":{
                System.out.println("Nhap ma can tim:");
                String id = sc.nextLine().trim();
                Product tim = ql.TimMa(id);
                if (tim != null){
                    tim.Xuat();
                }
                else
                    System.out.println("Khong tim thay!");
                break;      
            }
            case "2":{
                System.out.println("Nhap mo ta / ten:");
                String kw = sc.nextLine().trim();
                List<Product> list = ql.timtheoten(kw);
                if (list.isEmpty()){
                    System.out.println("khong tim thay");
                }
                else
                    list.forEach(Product::Xuat);
                break;
            }
            case "3":{
                double min = readDouble("nhap gia tri min:");
                double max = readDouble("nhap gia tri max:");
                List<Product> r =ql.timkhoanggia(min, max);
                if (r.isEmpty()){
                    System.out.println("khong tim thay");
                }
                else
                    r.forEach(Product::Xuat);
                break;
            }
            case "4":{
                LocalDate d = readDate("nhap ngay phat hanh:");
                if (d == null){
                    System.out.println("khong tim thay");
                    break;
                }
                List<Product> date = ql.timngayphathanh(d);
                if(date.isEmpty()){
                    System.out.println("Khong hop le!");
                }
                else
                    date.forEach(Product::Xuat);
                break;
            }
            default:
                System.out.println("khong hop le!");
                
        }
    }
}
