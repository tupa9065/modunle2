import java.util.Scanner;

public class TapChi extends TaiLieu{
    public final  String loai="tap chi";
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi() {
    }

    public TapChi(int id, String nameNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(id, nameNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "id=" + super.getId() +
                ", nameNXB='" + super.getNameNXB() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
    public void inserInfoTapChi(){
        super.insertInfoTaiLieu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("so Phat hanh");
        soPhatHanh=scanner.nextInt();
        scanner.nextLine();
        System.out.println("so trang");
        thangPhatHanh=scanner.nextInt();
        scanner.nextLine();
    }
}
