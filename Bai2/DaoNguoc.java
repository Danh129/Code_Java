/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.List;

/**đảo ngược một Collection bởi
 * sử dụng phương thức listIterator() và Collection.reverse()
 * của lớp Collection và Listiterator trong Java.
 *
 * @author letha
 */
public class DaoNguoc {
    public static void main(String[] args){
        String[] coin={"A", "B", "C", "D", "E"};
        //tao danh sach rong
        List l = new ArrayList();
        //duyet qua tung phan tu
        for (int i = 0; i < coin.length; i++)
            l.add(coin[i]);  //danh sach l = [A, B, C, D, E]
        
        //dueyt phan tu dau den cuoi va dao nguoc neu can
        ListIterator liter = l.listIterator();
        System.out.println(" Danh sach truoc khi dao: ");
        // dung has.Next(): vai tro: Kiem tra phan tu do co trong ds ko
        // dung next(): vai tro: tra ve phan tu ke tiep av con tro no den vi tri
        while(liter.hasNext())
            System.out.println(liter.next());
        
        
        Collections.reverse(l);// ho tro dao nguoc
        liter = l.listIterator();
        System.out.println(" Danh sach sau khi dao nguoc: ");
        while(liter.hasNext())
            System.out.println(liter.next());
        
        
    }
}
