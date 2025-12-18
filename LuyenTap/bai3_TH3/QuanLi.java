/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.bai3_TH3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
        

/**
 *
 * @author letha
 */
public class QuanLi {
    private List<Product> products = new ArrayList<>();
    
    public void them(Product p){
        products.add(p);
        System.out.println("Them thanh cong");
    }
    //xoa theo doi tuong
    public boolean xoatheodoituong(Product p){
        boolean xoa = products.remove(p);
        if (xoa){
            System.out.println("Xo thanh cong");
        }
        else{
            System.out.println("Khong co trong danh sach");
        }
        return xoa;
    }
    public boolean xoatheoma(String ma){
        Product p = TimMa(ma);
        if (p!=null){
            products.remove(p);
            System.out.println("xoa thanh cong");
            return true;
        }
        else
            System.out.println("khong hop le");
            return false;
    }
    
    public Product TimMa(String ma){
        for(Product p: products){
            if(p.getMaSp().equalsIgnoreCase(ma))
                return p;
        }
        return null;
    }
    
    //tim kiem theo ma, ten, gia ban
    public List<Product> timtheoten(String tk){
        List<Product> ten=new ArrayList<>();
        String k = tk.toLowerCase();
        for(Product p: products){
            if (p.getTenSp().toLowerCase().contains(k)|| p.getMoTa().toLowerCase().contains(k))
                ten.add(p);
        }
        return ten;
    }
    public List<Product> timkhoanggia(double min, double max){
        List<Product> ten = new  ArrayList<>();
        for(Product p :products){
            if(p.getGia()>=min && p.getGia()<=max)
                ten.add(p);
        }
        return ten;
    }
    
    public List<Product> timngayphathanh(LocalDate date){
        List<Product> ten =  new ArrayList<>();
        for(Product p : products){
            if (date.equals(p.getNgayPhatHanh()))
                ten.add(p);
        }
        return ten;
    }
    
    public void sapxep(){
        products.sort(Comparator.comparingDouble(Product::getGia).reversed());
        System.out.println("Sap xep thanh cong");
    }
    
    //hien thi
    public void hien(){
        for (Product p : products) {
            System.out.println("--------------");
            p.Xuat();
        }
        System.out.println("--------------");
        //size: thong ke san pham co bao nhieu
        System.out.println("Tong so san pham: " + products.size());
    }

    
}
