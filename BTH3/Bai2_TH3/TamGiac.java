/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai2_TH3;

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
    //kiem tra bat dang thuc cua tam giac
    private boolean Dung(double a, double b, double c){
        return a > 0 && b > 0 && c > 0 && a+b>c && a+c>b && b+c>a;
    }
    
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    
    public double ChuVi(){
        return a + b + c;
    }
    
    public double DienTich(){
        double p = ChuVi() / 2.0;
        double s = p * (p-a) * (p-b) * (p-c);
        
        if (s < 0){
            throw new ArithmeticException("Gia tri phai lon hon 0");
        }
        return Math.sqrt(s);
    }
    
    @Override
    public String toString(){
        return String.format("Tam giac: a=%.2f, b=%.2f, c=%.2f", a, b, c);
    }
    
}
