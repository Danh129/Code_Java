/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai4_TH3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.print.attribute.standard.Chromaticity;

/**
 *
 * @author letha
 */
public class TkCoKiHan extends TaiKhoan{
    private KyHan KyHan;
    private LocalDate NgayBatDau;
    private LocalDate NgayDaoHan;
    private boolean HuyBo;
    
    public TkCoKiHan(String ThongTin, String TenTk, String DienThoai, String Email, 
            double SoTienTk, String NgayTaoTk, String TrangThaiTk, KyHan KyHan, LocalDate NgayBatDau){
        super(ThongTin, TenTk, DienThoai, Email, SoTienTk, NgayTaoTk, TrangThaiTk, "Co ki han");
        this.KyHan=KyHan;
        this.NgayBatDau=NgayBatDau;
        this.NgayDaoHan=TinhToanKiHan(NgayBatDau, KyHan );
        this.HuyBo=false;
    }
    
    private LocalDate TinhToanKiHan(LocalDate s, KyHan k){
        switch(k){
            case Mot_Tuan:
                return s.plusWeeks(1);
            case Mot_Thang:
                return s.plusMonths(1);
            case Mot_Nam:
                return s.plusYears(1);
            default:
                return s;
        }
    }

    /**
     * @return the KyHan
     */
    public KyHan getKyHan() {
        return KyHan;
    }

    /**
     * @return the NgayBatDau
     */
    public LocalDate getNgayBatDau() {
        return NgayBatDau;
    }

    /**
     * @return the NgayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return NgayDaoHan;
    }

    /**
     * @return the HuyBo
     */
    public boolean isHuyBo() {
        return HuyBo;
    }
    
    private double getTiLeNam(){
        switch(KyHan){
            case Mot_Tuan:
                return 0.005;
            case Mot_Thang:
                return 0.045;
            case Mot_Nam:
                return 0.068;
            default:
                return 0.0;
        }
    }
    public double LaiSuatDaoHan(LocalDate today){
        if (HuyBo) return 0.0;
        double rate = getTiLeNam();
        long days=ChronoUnit.DAYS.between(NgayBatDau, NgayDaoHan);
        return SoTienTk * rate * ((double)days / 365.0);
    }
    
    public double LaiSuatTruongThanh(LocalDate today){
        if (HuyBo) return 0.0;
        if (!today.isBefore(NgayDaoHan)){
            double lai=LaiSuatDaoHan(today);
            this.SoTienTk+=lai;
            return lai;
        }
        return 0.0;
    }
    
    @Override
    public boolean TienRutHomNay(LocalDate today){
        return true;
    }
    
    @Override
    public boolean TienGuiHomNay(LocalDate today){
        return !HuyBo && today.equals(NgayDaoHan);
    }
    
    
    public void TienRut(double SoLuong, LocalDate today){
        if (SoLuong <= 0) throw new IllegalArgumentException("So tien phai rut lon hon 0");
        if (SoLuong > SoTienTk) throw new IllegalArgumentException("So du khong du");
        if (today.isBefore(NgayDaoHan)){
            HuyBo=true;
            SoTienTk-=SoLuong;
            System.out.println("Rut truoc han (Mat lai ki nay)");
        }
        else{
            SoTienTk-=SoLuong;
        }
    }
    
    @Override
    public String ThongTin(){
        return super.ThongTin() + String.format("| Ki Han: %s | Bat Dau: %s  | Dao Han: %s"
                + "Huy Truoc Han: %s", KyHan.name(), NgayBatDau.toString(), NgayDaoHan.toString(), HuyBo ? "co" : "khong");
    }

    /**
     * @param NgayDaoHan the NgayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate NgayDaoHan) {
        this.NgayDaoHan = NgayDaoHan;
    }

    @Override
    public void RutTien(double SoLuong, LocalDate today) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
