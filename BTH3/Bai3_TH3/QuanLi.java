/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai3_TH3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author letha
 */
public class QuanLi {
    private List<Product> products = new ArrayList<>();
    
    public void them(Product p){
        products.add(p);
        System.out.println("Them Thanh Cong!");
    }
    
    //xoa theo doi tuong
    public boolean xoadoituong(Product p){
        boolean xoa = products.remove(p);
        if (xoa){
            System.out.println("Xoa thanh cong!");
        }
        else
            System.out.println("Khong tim thay");
        
        return xoa;
    }
    
    
    //xoa theo ma
    public boolean xoatheoma (String ma){
        Product p = TimMa(ma);
        if (p!=null){
            products.remove(p);
            System.out.println("Xoa thanh cong!" + ma);
            return true;
        }
        else{
            System.out.print("Khong tim thay!");
            return false;
        }       
    }
    
    public Product TimMa(String ma){
        for(Product p : products){
            //equalsIgnoreCase: so sanh voi ma khong phan biet hoa hay thuong
            if (p.getMaSp().equalsIgnoreCase(ma))
                return p;
        }
        return null;
    }
    
    
    //Tim kiem ma, ten, gia ban
    public List<Product> timtheoten(String tukhoa){
        List<Product> res = new ArrayList<>();
        String k = tukhoa.toLowerCase();
        for (Product p : products){
            if (p.getTenSp().toLowerCase().contains(k) || p.getMoTa().toLowerCase().contains(k)){
            res.add(p);
            }
        }
        return res;
    }
    
    public List<Product> timkhoanggia(double min, double max){
        List<Product> res = new ArrayList<>();
        for(Product p : products){
            if (p.getGiaban() >= min && p.getGiaban() <=max){
                res.add(p);
            }
        }
        return res;
    }
    
    public List<Product> timtheophathanh(LocalDate date){
        List<Product> res = new ArrayList<>();
        for(Product p : products){
            if(date.equals(p.getNgayPhatHanh()))
                res.add(p);
        }
        return res;
    }
    //Sap xep
    public void sapxep(){
        products.sort(Comparator.comparingDouble(Product::getGiaban).reversed());
        System.out.println("Da sap xep!");
        
    }
    
    
    //hien thi
    public void hien(){
        for (Product p : products) {
            System.out.println("--------------");
            p.xuat();
        }
        System.out.println("--------------");
        //size: thong ke san pham co bao nhieu
        System.out.println("Tong so san pham: " + products.size());
    }
}
