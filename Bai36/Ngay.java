/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai36;

/**
 *
 * @author letha
 */
public class Ngay {
     private int ngay, thang, nam;
    public Ngay(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public int getngay(){
        return ngay;
    }
    public void setngay(int ngay){
        this.ngay = ngay;
    }
    public int getthang(){
        return thang;
    }
    public void setthang(int thang){
        this.thang = thang;
    }
    public int getnam(){
        return nam;
    }
    public void setnam(int nam){
        this.nam = nam;
    }
    @Override
    public String toString(){
        return ngay + "/" + thang + "/" + nam;
    }
}
