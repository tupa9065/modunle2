package bai3;

public class CongNhan extends Canbo{
    private int Level;

    public CongNhan(String name, int dob, String gender, String address, int level) {
        super(name, dob, gender, address);
        Level = level;
    }

    public CongNhan(int level) {
        Level = level;
    }
    public CongNhan() {
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    @Override
    public String toString() {
        return super.toString()+"CongNhan{" +
                "Level=" + Level +
                '}';
    }
}
