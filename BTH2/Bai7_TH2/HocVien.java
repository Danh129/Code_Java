/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2.Bai7_TH2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.stream.DoubleStream;

/**
 *
 * @author letha
 */
public class HocVien {
    private static int dem;
    private int MaSoHv=++dem;
    private LocalDate NgaySinh;
    private String HoTen;
    private double[] diem;
    
    public HocVien(String HoTen, LocalDate NgaySinh ){
        
        this.NgaySinh=NgaySinh;
        this.HoTen=HoTen;
        
    }
    
    public HocVien(String HoTen, String NgaySinh){
        this(HoTen, LocalDate.parse(NgaySinh, CauHinh.FORMATTER));
    }
    
    public void hien(){
        System.out.printf("\n id:%d\n ten : %s\n Ngay Sinh: %s\n ", 
                this.getMaSoHv(), this.getHoTen(), this.getNgaySinh().format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
        if (this.diem != null){
            for (var d: this.diem){
                System.out.printf("%.1f\t", d);
                System.out.print(" ");
            }
        }
    }
    
    public void nhapDiem(){
        this.diem = new double[CauHinh.So_Mon];
        for(int i = 0; i < CauHinh.So_Mon; i++){
            System.out.printf("So mon thu %d:", i + 1);
            this.diem[i] = CauHinh.SC.nextDouble();            
        }
    }
    
    public double tinhTb(){
        if (this.diem != null)
            return DoubleStream.of(this.diem).average().getAsDouble();
        return 0;
    }
    
    public boolean isHocBong(){
        if ( this.diem != null){
            for(var d: this.diem)
                if(d <5)
                    return false;
            return this.tinhTb() >= 8;
        }
        return false;
    }
    

    /**
     * @return the MaSoHv
     */
    public int getMaSoHv() {
        return MaSoHv;
    }

    /**
     * @param MaSoHv the MaSoHv to set
     */
    public void setMaSoHv(int MaSoHv) {
        this.MaSoHv = MaSoHv;
    }

    /**
     * @return the NgaySinh
     */
    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(LocalDate NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    /**
     * @return the HoTen
     */
    public String getHoTen() {
        return HoTen;
    }

    /**
     * @param HoTen the HoTen to set
     */
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    
    public int getTuoi(){
        return Period.between(NgaySinh, LocalDate.now()).getYears();
    }
}
