/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiNgoai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author letha
 */
public class QLCB {
    private List<CanBo> officers;
    
    public QLCB(){
        this.officers = new ArrayList();
    }
    
    public void addCanBo(CanBo officer){
        this.officers.add(officer);
    }
    
    public List<CanBo> tim(String ten){
        return this.officers.stream().filter(o -> o.getTen().contains(ten)).collect(Collectors.toList());
    }
    
    public void hien(){
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
