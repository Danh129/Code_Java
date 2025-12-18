/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai2_TH3;

/**
 *
 * @author letha
 */
public class HinhVuong extends HinhChuNhat {
    public HinhVuong(double canh){
        super(canh, canh);
    }
    
    @Override 
    public String toString(){
        return String.format("Hinh vuong: [canh=%.2f]", getDai());
    }
    
}
