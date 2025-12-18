/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.Bai2_TH3;

/**
 *
 * @author letha
 */
public class TamGiacCan extends TamGiac{
    public TamGiacCan(double a, double c){
        super(a, a, c);
    }
    
    @Override
    public String toString(){
        return String.format("Tam Giac Can =[ a=%.2f, c=%.2f ]", a, c);
    }
    
}
