/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drone;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class QuanLi {
    ArrayList<NhiemVu> ds = new ArrayList<>();
    
    public void them(NhiemVu nv){
        ds.add(nv);
    }
    public void hienThi(){
        ds.stream().filter(vn -> vn.getThoiGianTao().getDayOfMonth() == 12).forEach(System.out::println);
    }
    
    public void sapXep(){
        //voi do uu tien la int
        //ngay thang thi String thi kh sap xep theo binh thuong dc
        ds.sort((nv1, nv2) -> {
            if (nv1.getUuTien() != nv2.getUuTien())
                return Integer.compare(nv2.getUuTien(), nv1.getUuTien());
            return nv1.getThoiGianTao().compareTo(nv2.getThoiGianTao());       
        });
    }
    
    public void hienDrone(LocalDate tu, LocalDate cuoi){
        for(NhiemVu nv: ds){
            for(Drone dr: nv.getDrone()){
                if(!dr.getNgaySanXuat().isBefore(tu) && !dr.getNgaySanXuat().isAfter(cuoi)){
                    //hien nay ben Drone
                    dr.hien();
                }
            }
        }
    }
    public void hienDron2(){
        for(NhiemVu nv: ds){
            for(Drone dr: nv.getDrone()){
                dr.hien();
            }
            
        }
    }
    
    public void timTheoTen(String ten){
        ds.stream().filter(s -> s.getTen().equalsIgnoreCase(ten))
                .forEach(s -> s.getDrone().forEach(dr -> dr.hien()));
    }
    
    public long demSoLuongDrone(){
        return ds.stream().flatMap(nv -> nv.getDrone().stream()).count();
    }
    
    
}
