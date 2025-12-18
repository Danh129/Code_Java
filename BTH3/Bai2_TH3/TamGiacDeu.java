/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai2_TH3;

/**
 *
 * @author letha
 */
public class TamGiacDeu extends TamGiac{
    public TamGiacDeu(double a){
        super(a, a, a);
    }
    
    public String toString(){
        return String.format("Tam Giac Deu: canh=%.3f", a);
    }    
}
