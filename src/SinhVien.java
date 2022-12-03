import java.util.Scanner;

public class SinhVien {
    private int MASV;
    private String TenSV;
    private float DiemToan;
    private float DiemLy;
    private float DiemHoa;
    private float DiemTB = 0;
    private String XepLoai ="Chua Xep Loai";
    public SinhVien(){

    }

    public SinhVien(int MASV, String tenSV, float diemToan, float diemLy, float diemHoa, float diemTB, String xepLoai) {
        this.MASV = MASV;
        TenSV = tenSV;
        DiemToan = diemToan;
        DiemLy = diemLy;
        DiemHoa = diemHoa;
        DiemTB = diemTB;
        XepLoai = xepLoai;
    }

    public int getMASV() {
        return MASV;
    }

    public void setMASV(int MASV) {
        this.MASV = MASV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }

    public float getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(float diemToan) {
        DiemToan = diemToan;
    }

    public float getDiemLy() {
        return DiemLy;
    }

    public void setDiemLy(float diemLy) {
        DiemLy = diemLy;
    }

    public float getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        DiemHoa = diemHoa;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float diemTB) {
        DiemTB = diemTB;
    }

    public String getXepLoai() {
        return XepLoai;
    }

    public void setXepLoai(String xepLoai) {
        XepLoai = xepLoai;
    }

    public void NhapSinhVien(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Vao Ma Sinh Vien: ");
        this.MASV = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Vao Ten Sinh Vien: ");
        this.TenSV = scanner.nextLine();
        System.out.println("Nhap Diem Toan: ");
        this.DiemToan = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap Diem Ly: ");
        this.DiemLy = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap Diem Hoa: ");
        this.DiemHoa = Float.parseFloat(scanner.nextLine());

    }
    public void XuatSinhVien(int stt){
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        System.out.print("\n" + stt + " \t\t|");
        System.out.print(this.MASV + "\t\t\t\t|");
        System.out.print(this.TenSV + "\t\t\t\t\t|");
        System.out.print(this.DiemToan + "\t\t\t|");
        System.out.print(this.DiemLy + "\t\t\t|");
        System.out.print(this.DiemHoa + "\t\t\t|");
        System.out.print(this.DiemTB + "\t\t\t|");
        System.out.print(this.XepLoai + "\t\t|");
        dssv.gach();
    }
    public void TinhDiemTB(){
        this.DiemTB = (this.DiemToan + this.DiemLy + this.DiemHoa) /3;
    }
    public void XepLoaiSV(){
        if (this.DiemTB <= 10 && this.DiemTB >= 9 ){
            this.XepLoai = "Xuat Sac";
        } else if (this.DiemTB < 9 && this.DiemTB > 8){
            this.XepLoai = "Gioi";
        }else if (this.DiemTB < 8 && this.DiemTB > 7){
            this.XepLoai = "Kha";
        }else if (this.DiemTB < 7 && this.DiemTB > 6){
            this.XepLoai = "Trung Binh Kha";
        }else if (this.DiemTB < 6 && this.DiemTB > 5){
            this.XepLoai = "Trung Binh";
        }else {
            this.XepLoai = "Yeu";
        }
    }
}
