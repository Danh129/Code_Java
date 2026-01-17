/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhuyenMai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author letha
 */
public class QuanLi {
    ArrayList<SanPham> ds = new ArrayList<>();
    
    public void themSp(SanPham sp){
        ds.add(sp);
    }
    
    public void hienThi(){
        for(SanPham sp: ds){
            sp.hienThi();
        }
    }
    
    public void timTenSp(String ten){
        for(SanPham sp: ds){
            if(sp.getTenSp().equalsIgnoreCase(ten))
                sp.hienThi();
        }

        
    }
    public void themKhuyenMai(String ma, KhuyenMai km){
        ds.stream().filter(s -> s.getMaSp().equals(ma))
                .findFirst()
                .ifPresent(s -> s.KhuyenMai(km));
        
    }
    
    //Hien thi khuyen mai theo ma hoac ten sp
    public void HienThiKhuyenMai(String key){
//        for(SanPham sp: ds){
//            for(KhuyenMai km: sp.getDs()){
//                km.hien();
//            }
//        }

//        ds.stream().filter(s -> String.valueOf(s.getMaSp()).equals(key) || s.getTenSp().equalsIgnoreCase(key))
//                .forEach(s -> {
//                    System.out.println("San pham: " + s.getTenSp());
//                    s.getDs().forEach(System.out::println);
//                });

//        ds.stream().filter(s -> s.getMaSp().equals(key) || s.getTenSp().equalsIgnoreCase(key))
//                .forEach(s -> {
//                    System.out.println("San pham: " + s.getTenSp());
//                    s.getDs().forEach(System.out::println);
//                
//                });
            ds.stream().filter(s -> s.getMaSp().equals(key) || s.getTenSp().equalsIgnoreCase(key))
                .forEach(s -> s.getDs().forEach(System.out::println));
                
    }
   //xem danh sach khuyen mai chi dinh
    public List<SanPham> SpTheoLoaiKM(String loai){
        return ds.stream().filter(s -> s.getDs().stream().anyMatch(k -> k.hien().equals(loai)))
                .collect(Collectors.toList());
    }
    
    //sap xep giam dan theo so luong
    public void sapXep(){
        ds.sort((sp1, sp2) -> {
            long count1 = sp1.getDs().stream().filter(k -> !k.getNgayHetHan().isBefore(LocalDate.now())).count();
            long count2 = sp2.getDs().stream().filter(k -> !k.getNgayHetHan().isBefore(LocalDate.now())).count();
            return Long.compare(count2, count1);//giam dan
        });
    }
    
    //Tim kiem san pham sap het han
    public void timKiemSpSapHetHan(int x){
        LocalDate targetDate = LocalDate.now().plusDays(x);
        for(SanPham sp: ds){
            for(KhuyenMai km: sp.getDs()){
                if(km.getNgayHetHan().equals(targetDate))
                    System.out.println("San pham: " + sp.getTenSp() + " Sap het han: " + km.getMaKhuyenMai());
            }
        }
        
    }
    
    //Xoa khuyen mai het han
    public void xoaKMHetHan(){
        for(SanPham sp: ds){
            sp.getDs().removeIf(km -> km.getNgayHetHan().isBefore(LocalDate.now()));
        }
        System.out.println("Da xoa cac khuyen mai het han");
    }
}
