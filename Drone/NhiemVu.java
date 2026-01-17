/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drone;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class NhiemVu {
    private String ten;
    private int uuTien;
    private LocalDate thoiGianTao;
    private String khuVuc;
    private ArrayList<Drone> drone = new ArrayList<>();

    public NhiemVu(String ten,int uuTien, LocalDate thoiGianTao) {
        this.ten = ten;
        this.uuTien = uuTien;
        this.thoiGianTao = thoiGianTao;
        
    }
    public void Drone(Drone dr){
        getDrone().add(dr);
    }
    @Override
    public String toString(){
        return "ten: " + ten + "| uu Tien: " + uuTien + " | thoi gian tao:" + thoiGianTao;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the uuTien
     */
    public int getUuTien() {
        return uuTien;
    }

    /**
     * @param uuTien the uuTien to set
     */
    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }

    /**
     * @return the thoiGianTao
     */
    public LocalDate getThoiGianTao() {
        return thoiGianTao;
    }

    /**
     * @param thoiGianTao the thoiGianTao to set
     */
    public void setThoiGianTao(LocalDate thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    /**
     * @return the khuVuc
     */
    public String getKhuVuc() {
        return khuVuc;
    }

    /**
     * @param khuVuc the khuVuc to set
     */
    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    /**
     * @return the drone
     */
    public ArrayList<Drone> getDrone() {
        return drone;
    }
    
}
