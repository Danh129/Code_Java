/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenCode;

/**
 *
 * @author letha
 */
public class VatPhamTangLuotChoi extends VatPham{
    private int SoLuongTang;
    
    public VatPhamTangLuotChoi(String ma, int SoLuongTang){
        super(ma);
        this.SoLuongTang=SoLuongTang;
    }
    
    @Override
    public int Mau(){
        return 0;
    }
    
    @Override
    public int SoLuongLuotChoi(){
        return SoLuongTang;
    }
    
    @Override
    public void hienThi(){
        System.out.println("Vatpham tang luot choi hoac mau:" + ma + " Tang:" + SoLuongTang);
    }
    

    /**
     * @return the SoLuongTang
     */
    public int getSoLuongTang() {
        return SoLuongTang;
    }

    /**
     * @param SoLuongTang the SoLuongTang to set
     */
    public void setSoLuongTang(int SoLuongTang) {
        this.SoLuongTang = SoLuongTang;
    }
}
