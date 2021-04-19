package bai3;

public class NhanVien extends Canbo{
    private String job;

    public NhanVien(String name, int dob, String gender, String address, String job) {
        super(name, dob, gender, address);
        this.job = job;
    }

    public NhanVien(String job) {
        this.job = job;
    }
    public NhanVien() {
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVien{" +
                "job='" + job + '\'' +
                '}';
    }
}
