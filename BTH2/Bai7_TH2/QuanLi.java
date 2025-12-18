/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2.Bai7_TH2;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import jdk.dynalink.linker.ConversionComparator;
/**
 *
 * @author letha
 */
public class QuanLi {
    private List<HocVien> ds = new ArrayList<>();
    
    public void themHv(HocVien... a){
        this.getDs().addAll(Arrays.asList(a));
    }
    
    public void them(String tenFile){
        File f = new File(tenFile);  
        try (Scanner sc = new Scanner(f)){
            while(sc.hasNext())
                this.ds.add(new HocVien (sc.nextLine(), sc.nextLine()));
        }catch (FileNotFoundException e){
            System.err.print("Khong hop le!");
        }       
    }        

   public void hien(){
       this.ds.forEach(h -> h.hien());
   }
   
   public void nhapDiem(){
       this.ds.forEach(h ->{
           System.out.printf("-- Nhap %s\n", h.getHoTen().toLowerCase());
           h.nhapDiem();
               });
   }
   
   public HocVien TimKiem(int id){
       return this.ds.stream().filter(h -> h.getMaSoHv() == id).findFirst().get();
   }
   public List<HocVien> TimKiem(String kw){
       return this.ds.stream().filter(h -> h.getHoTen().contains(kw)).collect(Collectors.toList());
   }
   
   public List<HocVien> TimKiem(){
       return this.ds.stream().filter(h -> h.isHocBong()).collect(Collectors.toList());
   }
   
   public void sapxep(){
       this.ds.sort(Comparator.comparing(HocVien::tinhTb));
   }
   
   //sap xep giam dan theo thang neu thang bang nhau thi tang theo ten
   public void sx(){
       this.ds.sort((hv1, hv2) -> {
           int m1 = hv1.getNgaySinh().getMonthValue();
           int m2 = hv2.getNgaySinh().getMonthValue();
           
           if (m1 == m2){
               return hv1.getHoTen().compareTo(hv2.getHoTen());
           }
           return -(m2 - m1);
       });
   }
   
   public void ThongkeTuoi(){
       int tuoiduoi18 = 0;
       int tuoitu18 = 0;
       int tuoitren24 = 0;
       
       for (HocVien hv : ds){
           int tuoi = hv.getTuoi();
           if (tuoi < 18){
               tuoiduoi18++;
           }
           else if (tuoi >= 18 || tuoi <= 23){
               tuoitu18++;
           }
           else{
               tuoitren24++;
           }
       }
       System.out.println("Hoc vien co tuoi duoi 18:" + tuoiduoi18);
       System.out.println("Hoc vien o tuoi tu 18 den 23:" + tuoitu18);
       System.out.println("Hoc vien co tuoi tren 24:" + tuoitren24);
   }
    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }
}
