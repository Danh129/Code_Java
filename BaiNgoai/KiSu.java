/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiNgoai;

/**
 *
 * @author letha
 */
public class KiSu extends CanBo {
    private String nganh;
    public KiSu(String ten, int tuoi, String GioiTinh, String DiaChi, String nganh ){
        super(ten, tuoi, GioiTinh, DiaChi);
        this.nganh=nganh;
    }

    /**
     * @return the nganh
     */
    public String getNganh() {
        return nganh;
    }

    /**
     * @param nganh the nganh to set
     */
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
     @Override
    public String toString() {
        return "KiSu{" +
                "nganh='" + nganh + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + GioiTinh + '\'' +
                ", diachi='" + DiaChi + '\'' +
                '}';
    }
    
}
