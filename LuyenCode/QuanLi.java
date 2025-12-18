/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author letha
 */
public class QuanLi {
    ArrayList<NhanVat> ds = new ArrayList<>();
    
    public void themNhanVat(NhanVat nv){
        ds.add(nv);
    }
    
    public NhanVat timNhanVat(int MaNv){
        for(NhanVat nv: ds){
            if(nv.getMaNv() == MaNv)
                return nv;
        }
        return null;
    }
    
    public void hienThiAll(){
        for(NhanVat nv: ds){
            nv.hienThi();
        }
    }
    public void sapXepGiamDanSoVatPham(){
        Collections.sort(ds, (a, b) ->
                Integer.compare(b.SoLuongVatPham(),a.SoLuongVatPham())
        );
    }
}
