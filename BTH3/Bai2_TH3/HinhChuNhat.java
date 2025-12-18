/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai2_TH3;

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
        //dung set thay vi dung this -> do set co the thay doi gia tri
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
    
    //Tinh dien tich
    public double DienTich(){
        return dai * rong;
    }
    
    //Tinh chu vi
    public double ChuVi(){
        return 2 * (dai + rong);
    }
    
    @Override 
    public String toString(){
        return String.format("Dai=%.2f, Rong=%.2f", dai, rong);
    }
    
}
