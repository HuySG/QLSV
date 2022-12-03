import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        Option(dssv);
        Menu();

    }
    public static void Option(DanhSachSinhVien dssv){
        Scanner scanner = new Scanner(System.in);
        int n ;
        boolean Exit = false;
        do {
            Menu();
            n = Integer.parseInt(scanner.nextLine());
            switch (n){
                case 1:
                    //Nhap SV
                   SinhVien sv = new SinhVien();

                   sv.NhapSinhVien();
                    //tinh diem trung binh
                   sv.TinhDiemTB();
                    //xep loai sinh vien
                    sv.XepLoaiSV();
                   dssv.ThemSinhVien(sv);

                    break;
                case 2:
                    //Xuat SV
                    dssv.XuatTatCaSinhVien();
                    break;

                case 3:
                    Exit = true;
                    break;
                default:
                    break;
            }
        }while (!Exit);
    }
    public static void Menu(){
        System.out.println("\nChoose Option\n");
        System.out.println("1. Nhap Sinh Vien");
        System.out.println("2. Xuat Sinh Vien");
        System.out.println("3. Exit");
    }
}