import java.util.Scanner;

public class TaiLieu {
    public final  String loai="tai lieu";
    private int id;
    private String nameNXB;
    private  int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(int id, String nameNXB, int soBanPhatHanh) {
        this.id = id;
        this.nameNXB = nameNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameNXB() {
        return nameNXB;
    }

    public void setNameNXB(String nameNXB) {
        this.nameNXB = nameNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "id=" + id +
                ", nameNXB='" + nameNXB + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
    public void insertInfoTaiLieu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("NXB");
        nameNXB=scanner.nextLine();
        System.out.println("so ban phat hanh");
        soBanPhatHanh=scanner.nextInt();
        scanner.nextLine();
    }
}
