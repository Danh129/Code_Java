/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai36;

/**
 *
 * @author letha
 */
public class HangSanXuat {
    private String tenHangSanXuat, quocGia;
    public HangSanXuat(String tenHangSanXuat, String quocGia){
        super();
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }
    public String gettenHangSanXuat(){
        return tenHangSanXuat;
    }
    public void settenHangSanXuat(String tenHangSanXuat){
        this.tenHangSanXuat = tenHangSanXuat;
    }
    public String getquocGia(){
        return quocGia;
    }
    public void setquocGia(String quocGia){
        this.quocGia = quocGia;
    }
}
