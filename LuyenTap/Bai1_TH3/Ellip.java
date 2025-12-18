/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.Bai1_TH3;

/**
 *
 * @author letha
 */
public class Ellip {
    private double BkTrucLon;
    private double BkTrucNho;
    
    public Ellip(){
        this.BkTrucLon=1.0;
        this.BkTrucNho=1.0;
    }
    
    public Ellip(double BkTrucLon, double BkTrucNho){
        setBkTrucLon(BkTrucLon);
        setBkTrucNho(BkTrucNho);
    }

    /**
     * @return the BkTrucLon
     */
    public double getBkTrucLon() {
        return BkTrucLon;
    }

    /**
     * @param BkTrucLon the BkTrucLon to set
     */
    public void setBkTrucLon(double BkTrucLon) {
        this.BkTrucLon = BkTrucLon;
    }

    /**
     * @return the BkTrucNho
     */
    public double getBkTrucNho() {
        return BkTrucNho;
    }

    /**
     * @param BkTrucNho the BkTrucNho to set
     */
    public void setBkTrucNho(double BkTrucNho) {
        this.BkTrucNho = BkTrucNho;
    }
    
    public double DienTich(){
        return Math.PI * BkTrucLon *BkTrucNho;
    }
    
    public double ChuVi(){
        return 2 * Math.PI * Math.sqrt((BkTrucLon * BkTrucLon + BkTrucNho * BkTrucNho)/2);
    }
    
    @Override
    public String toString(){
        return String.format("Ellip=[a=%.2f, b=%.2f, DienTich=%.2f, ChuVi=%.2f]", 
                BkTrucLon, BkTrucNho, DienTich(), ChuVi());
    }
    
}
