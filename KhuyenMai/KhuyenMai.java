/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhuyenMai;

import java.time.LocalDate;

/**
 *
 * @author letha
 */
public abstract class KhuyenMai {
    private String maKhuyenMai;
    private LocalDate ngayTao;
    private LocalDate ngayHetHan;

    public KhuyenMai(String maKhuyenMai, LocalDate ngayTao, LocalDate ngayHetHan) {
        this.maKhuyenMai = maKhuyenMai;
        this.ngayTao = ngayTao;
        this.ngayHetHan = ngayHetHan;
    }
    
    protected abstract String hien();
    
    @Override
    public String toString(){
        return String.format("\nMa khuyen mai: %s  | Ngay het han: %s  ", maKhuyenMai, ngayHetHan);
    }
    
    

    /**
     * @return the maKhuyenMai
     */
    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    /**
     * @param maKhuyenMai the maKhuyenMai to set
     */
    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    /**
     * @return the ngayTao
     */
    public LocalDate getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    /**
     * @return the ngayHetHan
     */
    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    /**
     * @param ngayHetHan the ngayHetHan to set
     */
    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
}
