/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiNgoai;

/**
 *
 * @author letha
 */
public class CongNhan extends CanBo {
    private int bac;
    public CongNhan(String ten, int tuoi, String GioiTinh, String DiaChi, int bac){
        super(ten, tuoi, GioiTinh, DiaChi);
        this.bac=bac;
    }

    /**
     * @return the bac
     */
    public int getBac() {
        return bac;
    }

    /**
     * @param bac the bac to set
     */
    public void setBac(int bac) {
        this.bac = bac;
    }
    @Override
    public String toString(){
        return "bac{" + "bac=" + bac + ", ten=" + ten +
                ", tuoi=" + tuoi + ", gioitinh=" + GioiTinh
                + ", Diachi=" + DiaChi + '}';
    }    
}
