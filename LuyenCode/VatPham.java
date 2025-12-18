/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenCode;

/**
 *
 * @author letha
 */
public abstract class VatPham {
    protected String ma;
    public VatPham(String ma){
        this.ma=ma;
    }
    
    public abstract int SoLuongLuotChoi();
    public abstract int Mau();
    public abstract void hienThi();

    /**
     * @return the ma
     */
    public String getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(String ma) {
        this.ma = ma;
    }
}
