import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {
    private List<SinhVien> danhsachsinhvien;

    public DanhSachSinhVien() {
        this.danhsachsinhvien = new ArrayList<SinhVien>();
    }

    public void ThemSinhVien(SinhVien sv) {
        this.danhsachsinhvien.add(sv);
    }

    public void XuatTatCaSinhVien() {
        int stt = 0;
        header();
        for (SinhVien sv : danhsachsinhvien) {
            stt++;
            sv.XuatSinhVien(stt);
        }
    }
    public void header(){
        System.out.println("\n-------------------------Thong Tin Sinh Vien-------------------------\n");
        System.out.print("STT \t|");
        System.out.print("Ma So Sinh Vien \t|");
        System.out.print("Ten Sinh Vien \t\t\t|");
        System.out.print("Diem Toan \t\t|");
        System.out.print("Diem Ly \t\t|");
        System.out.print("Diem Hoa \t\t|");
        System.out.print("Diem TB \t\t|");
        System.out.print("Xep Loai \t\t|");
    }
    public void gach(){
        System.out.println("\n-----------------------------------------------------------------------\n");
    }
}

