/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH3.Bai1_TH3;

/**
 *Lớp Ellipse có 2 thuộc tính bán kính trục lớn, bán kính trục bé và các phương thức
o Phương thức khởi tạo 2 tham số khởi gán cho bán kính hai trục.
o Phương thức tính diện tích và chu vi của hình Ellipse.
o Các phương thức getter và setter của các thuộc tính.
o Ghi đè phương thức toString() trả về chuỗi đại diện cho một Ellipse có định 
dạng như phần ghi chú trong hình.
Biết công thức tính chu vi và diện tích của ellipse như sau:
§ Diện tích = PI	*	bkTrucLon	*	bkTrucNho
§ Chu vi = 2 ∗ 𝑃𝐼 
-
Lớp Circle kế thừa lớp Ellipse có các phương thức 
o Phương thức khởi tạo 1 tham số để khởi gán bán kính hình tròn.
o Ghi đè phương thức toString() trả về chuỗi đại diện cho một Circle như trong 
phần ghi chú.
 * @author letha
 */
public class Ellipse {
    private double bkTrucLon;
    private double bkTrucNho;
    
    public Ellipse(){
        this.bkTrucLon=1.0;
        this.bkTrucNho=1.0;
    }
    
    public Ellipse(double bkTrucLon, double bkTrucNho){
        setBkTrucLon(bkTrucLon);
        setBkTrucNho(bkTrucNho);
    }

    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucNho
     */
    public double getBkTrucNho() {
        return bkTrucNho;
    }

    /**
     * @param bkTrucNho the bkTrucNho to set
     */
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }
    
    //Tinh dien tich
    public double DienTich(){
        return Math.PI * bkTrucLon * bkTrucNho;
    }
    
    //Tinh chu vi
    public double ChuVi(){
        double a2 = bkTrucLon * bkTrucLon;
        double b2 = bkTrucNho * bkTrucNho;
        return 2 * Math.PI * Math.sqrt((a2 + b2) / 2.0);
    }
    
    @Override
    public String toString(){
        return String.format("Ellipse[a=%.4f, b=%.4f, DienTich=%.4f, ChuVi=%.4f]",
                bkTrucLon, bkTrucNho, DienTich(), ChuVi());
    }
}
