import java.util.Scanner;

public class Bao extends TaiLieu{
    public final  String loai="bao";
    private int ngayPhatHanh;

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }

    public Bao(int id, String nameNXB, int soBanPhatHanh, int ngayPhatHanh) {
        super(id, nameNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "id=" + super.getId() +
                ", nameNXB='" + super.getNameNXB() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
    public void inserInfoBao(){
        super.insertInfoTaiLieu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ngay Phat hanh");
        ngayPhatHanh=scanner.nextInt();
        scanner.nextLine();

    }
}
