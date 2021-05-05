import java.util.Scanner;

public class Sach extends TaiLieu{
    public final  String loai="sach";
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(int id, String nameNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(id, nameNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "id=" + super.getId() +
                ", nameNXB='" + super.getNameNXB() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
    public void inserInfoSach(){
        super.insertInfoTaiLieu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("tac gia");
        tenTacGia=scanner.nextLine();
        System.out.println("so trang");
        soTrang=scanner.nextInt();
        scanner.nextLine();
    }
}
