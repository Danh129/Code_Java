/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author letha
 */
public class NhanVat {
    private int MaNv;
    private String ten;
    private ArrayList<VatPham> ds = new ArrayList<>();
    public NhanVat(int MaNv, String ten){
        this.MaNv=MaNv;
        this.ten=ten;
    }
    
    public void themVatPham(VatPham vp){
        ds.add(vp);
    }
    
    public int tongLuotChoi(){
        int tong = 0;
        for(VatPham vp: getDs()){
            if(vp.getMa().charAt(0) == 'A')
                tong+=vp.getGiatri();
        }
        return tong;
    }
    public int SoLuong(){
        return ds.size();
    }
    
    static void sapxep(ArrayList<NhanVat> ds){
        Collections.sort(ds, (a, b) ->
                b.SoLuong()-a.SoLuong()
        );
    }
    
    public void hien(){
        System.out.println("Ma nhan vat:" + MaNv + "Ten nhan vat:" + ten);
        System.out.println("Tong luot choi" + tongLuotChoi());
        for (VatPham vp: ds){
            System.out.println("Ma vat pham:" + vp.getMa() + "Gia tri:" + vp.getGiatri());
        }
    }

    /**
     * @return the MaNv
     */
    public int getMaNv() {
        return MaNv;
    }

    /**
     * @param MaNv the MaNv to set
     */
    public void setMaNv(int MaNv) {
        this.MaNv = MaNv;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the ds
     */
    public ArrayList<VatPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<VatPham> ds) {
        this.ds = ds;
    }
}
