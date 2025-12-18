/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.Bai2_TH3;

/**
 *
 * @author letha
 */
public class TamGiac {
    protected double a, b, c;
    
    public TamGiac(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    private boolean KiemTra(double a, double b, double c){
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }
    
    public double ChuVi(){
        return a + b + c;
    }
    public double DienTich(){
        double p = ChuVi() / 2.0;
        double s = p * (p - a) * (p - b) * (p - c);
        if (s < 0){
            throw new ArithmeticException("khong hop le");
        }
        else 
            return Math.sqrt(s);
    }
    
    @Override
    public String toString(){
        return String.format("Tam Giac = [ a=%.2f, b=%.2f, c=%.2f]", a, b, c);
    }
}
