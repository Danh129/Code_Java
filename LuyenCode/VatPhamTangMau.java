/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenCode;

/**
 *
 * @author letha
 */
public class VatPhamTangMau extends VatPham{
    private int TangMau;
    
    public VatPhamTangMau(String ma, int TangMau){
        super(ma);
        this.TangMau=TangMau;
    }
    
    @Override
    public int Mau(){
        return TangMau;
    }
    
    @Override
    public int SoLuongLuotChoi(){
        return 0;
    }
    
    @Override
    public void hienThi(){
        System.out.println("Vat pham tang mau: " + ma + "Tang Mau:" + TangMau);
    }

    /**
     * @return the TangMau
     */
    public int getTangMau() {
        return TangMau;
    }

    /**
     * @param TangMau the TangMau to set
     */
    public void setTangMau(int TangMau) {
        this.TangMau = TangMau;
    }
}
