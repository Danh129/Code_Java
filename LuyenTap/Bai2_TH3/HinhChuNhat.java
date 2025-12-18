/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.Bai2_TH3;

/**
 *
 * @author letha
 */
public class HinhChuNhat {
    private double dai;
    private double rong;
    
    public HinhChuNhat(){
        this(1.0, 1.0);
    }
    
    public HinhChuNhat(double dai, double rong){
        this.dai=dai;
        this.rong=rong;
    }

    /**
     * @return the dai
     */
    public double getDai() {
        return dai;
    }

    /**
     * @param dai the dai to set
     */
    public void setDai(double dai) {
        this.dai = dai;
    }

    /**
     * @return the rong
     */
    public double getRong() {
        return rong;
    }

    /**
     * @param rong the rong to set
     */
    public void setRong(double rong) {
        this.rong = rong;
    }
    
    
    public double DienTich(){
        return dai * rong;
    }
    
    public double ChuVi(){
        return (dai + rong) * 2;
    }
    
    @Override
    public String toString(){
        return String.format("hinh Chu Nhat: [ dai=%.2f, rong=%.2f]",
                dai, rong);
    }
}
