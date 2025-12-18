/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai4_TH3;

import java.lang.reflect.AccessFlag;
import java.time.LocalDate;

/**
 *
 * @author letha
 */
enum KyHan{
    Mot_Tuan, 
    Mot_Thang, 
    Mot_Nam
}
public abstract class TaiKhoan {
    protected String ThongTin;
    protected String TenTk;
    protected String DienThoai;
    protected String Email;
    protected double SoTienTk;
    protected String NgayTaoTk;
    protected String TrangThaiTk;
    protected String LoaiTk;
    
    public TaiKhoan(String ThongTin, String TenTk, String DienThoai, String Email, 
            double SoTienTk, String NgayTaoTk, String TrangThaiTk, String LoaiTk){
        this.ThongTin=ThongTin;
        this.TenTk=TenTk;
        this.DienThoai=DienThoai;
        this.Email=Email;
        this.SoTienTk=SoTienTk;
        this.NgayTaoTk=NgayTaoTk;
        this.TrangThaiTk=TrangThaiTk;
        this.LoaiTk=LoaiTk;
    }

    /**
     * @return the ThongTin
     */
    public String getThongTin() {
        return ThongTin;
    }

    /**
     * @param ThongTin the ThongTin to set
     */
    public void setThongTin(String ThongTin) {
        this.ThongTin = ThongTin;
    }

    /**
     * @return the TenTk
     */
    public String getTenTk() {
        return TenTk;
    }

    /**
     * @param TenTk the TenTk to set
     */
    public void setTenTk(String TenTk) {
        this.TenTk = TenTk;
    }

    /**
     * @return the DienThoai
     */
    public String getDienThoai() {
        return DienThoai;
    }

    /**
     * @param DienThoai the DienThoai to set
     */
    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the SoTienTk
     */
    public double getSoTienTk() {
        return SoTienTk;
    }

    /**
     * @param SoTienTk the SoTienTk to set
     */
    public void setSoTienTk(double SoTienTk) {
        this.SoTienTk = SoTienTk;
    }

    /**
     * @return the NgayTaoTk
     */
    public String getNgayTaoTk() {
        return NgayTaoTk;
    }

    /**
     * @param NgayTaoTk the NgayTaoTk to set
     */
    public void setNgayTaoTk(String NgayTaoTk) {
        this.NgayTaoTk = NgayTaoTk;
    }

    /**
     * @return the TrangThaiTk
     */
    public String getTrangThaiTk() {
        return TrangThaiTk;
    }

    /**
     * @param TrangThaiTk the TrangThaiTk to set
     */
    public void setTrangThaiTk(String TrangThaiTk) {
        this.TrangThaiTk = TrangThaiTk;
    }

    /**
     * @return the LoaiTk
     */
    public String getLoaiTk() {
        return LoaiTk;
    }

    /**
     * @param LoaiTk the LoaiTk to set
     */
    public void setLoaiTk(String LoaiTk) {
        this.LoaiTk = LoaiTk;
    }
    
    //Tien Gui
    public void TienGui(double SoLuong){
        if (SoLuong <= 0)throw new IllegalCallerException("So Tien Phai Lon Hon 0");
        this.SoTienTk+=SoLuong;  
    }
    
    public abstract boolean TienGuiHomNay(LocalDate today);
          
    public abstract boolean TienRutHomNay(LocalDate today);
        
    public abstract void RutTien(double SoLuong, LocalDate today);
    
    public String ThongTin(){
        return String.format("[%s] %s |  So Dien Thoai: %s  |  Email: %s  | "
                + "So du: %.2f  |  Ngay Tao: %s  |  Trang Thai: %s  | Loai: %s ",
                ThongTin, TenTk, DienThoai, Email, SoTienTk, NgayTaoTk, TrangThaiTk, LoaiTk );
    }
}
