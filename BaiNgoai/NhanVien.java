/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiNgoai;

/**
 *lop nhan vien ghi de len lop can bo
 * @author letha
 */
public class NhanVien extends CanBo{
    private String nhiemvu;
    public NhanVien(String ten, int tuoi, String GioiTinh, String DiaChi, String nhiemvu){
        super(ten, tuoi, GioiTinh, DiaChi);
        this.nhiemvu=nhiemvu;
    }

    /**
     * @return the nhiemvu
     */
    public String getNhiemvu() {
        return nhiemvu;
    }

    /**
     * @param nhiemvu the nhiemvu to set
     */
    public void setNhiemvu(String nhiemvu) {
        this.nhiemvu = nhiemvu;
    }
    
    @Override
    public String toString(){
        return "Staff{" +
                "task='" + nhiemvu + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", GioiTinh='" + GioiTinh + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }
}
