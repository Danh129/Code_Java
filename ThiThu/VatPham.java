/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu;

/**
 *
 * @author letha
 */
public class VatPham {
    private String ma;
    private int giatri;
    
    public VatPham(String ma, int giatri){
        this.ma=ma;
        this.giatri=giatri;
    }

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

    /**
     * @return the giatri
     */
    public int getGiatri() {
        return giatri;
    }

    /**
     * @param giatri the giatri to set
     */
    public void setGiatri(int giatri) {
        this.giatri = giatri;
    }
}
