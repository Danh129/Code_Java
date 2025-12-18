/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiNgoai;
import java.util.List;
import java.util.Scanner;

/**
 *Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
 * Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.

Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
Các nhân viên có thuộc tính riêng: công việc.
* 
Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.

Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực
* hiện các chức năng sau:

Thêm mới cán bộ.
Tìm kiếm theo họ tên.
Hiện thị thông tin về danh sách các cán bộ.
Thoát khỏi chương trình.
 * @author letha
 */
public class Demo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true){
            System.out.println("Quan Li Can Bo");
            System.out.println("1. Thong tin can bo");
            System.out.println("2. Tim kiem Theo ten");
            System.out.println("3. Hien Thi");
            System.out.println("4. Thoat");
            
            String chon = scanner.nextLine();
            switch (chon){
                case "1":{
                    System.out.println("a. ki Su");
                    System.out.println("b. cong nhan");
                    System.out.println("c. nhan vien");
                    String type = scanner.nextLine();
                    
                    switch (type){
                        case "a":{
                            System.out.print("nhap ten: ");
                            String ten = scanner.nextLine();
                            System.out.print("nhap tuoi: ");
                            int tuoi = scanner.nextInt();
                            System.out.print("nhap gioi tinh: ");
                            scanner.nextLine();
                            String GioiTinh = scanner.nextLine();
                            System.out.print("nhap Dia chi: ");                         
                            String DiaChi = scanner.nextLine();
                            System.out.print("nhap nganh: ");
                            String nganh = scanner.nextLine();
                            CanBo kisu = new KiSu(ten, tuoi, GioiTinh, DiaChi, nganh);
                            qlcb.addCanBo(kisu);
                            System.out.println(kisu.toString());
                            break;
                        }
                        case "b":{
                            System.out.print("nhap ten: ");
                            String ten = scanner.nextLine();
                            System.out.print("nhap tuoi: ");
                            int tuoi = scanner.nextInt();
                            System.out.print("nhap gioi tinh: ");
                            scanner.nextLine();
                            String GioiTinh = scanner.nextLine();
                            System.out.print("nhap Dia chi: ");                         
                            String DiaChi = scanner.nextLine();
                            System.out.print("nhap bac: ");
                            int bac = scanner.nextInt();
                            CanBo congnhan = new CongNhan(ten, tuoi, GioiTinh, DiaChi, bac);
                            qlcb.addCanBo(congnhan);
                            System.out.println(congnhan.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c":{
                            System.out.print("nhap ten: ");
                            String ten = scanner.nextLine();
                            System.out.print("nhap tuoi: ");
                            int tuoi = scanner.nextInt();
                            System.out.print("nhap gioi tinh: ");
                            scanner.nextLine();
                            String GioiTinh = scanner.nextLine();
                            System.out.print("nhap Dia chi: ");                         
                            String DiaChi = scanner.nextLine();
                            System.out.print("nhap nhiem vu: ");
                            String nhiemvu = scanner.nextLine();
                            CanBo nhanvien = new NhanVien(ten, tuoi, GioiTinh, DiaChi, nhiemvu);
                            qlcb.addCanBo(nhanvien);
                            System.out.println(nhanvien.toString());
                            break;
                        }
                        default:
                            System.out.println("khong hop le!");
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.print("Tim kiem can bo:");
                    String ten = scanner.nextLine();
                    
                    List<CanBo> kq = qlcb.tim(ten);
                    if (kq.isEmpty()){
                        System.out.println("Khong tim thay ten");
                    }
                    else{
                    qlcb.tim(ten).forEach(CanBo ->{
                        System.out.println(CanBo.toString());
                    });
                    }
                    break;
                }
                case "3":{
                    qlcb.hien();
                    break;
                }
                case "4":{
                    return;
                }
                default:
                    System.out.print("Nho chon tu 1-4 nha! Sai thi chon lai");
                    continue;
            }
        }
    }
}
