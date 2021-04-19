package bai3;

public class KySu extends Canbo{
    private String specialized;

    public KySu(String name, int dob, String gender, String address, String specialized) {
        super(name, dob, gender, address);
        this.specialized = specialized;
    }

    public KySu(String specialized) {
        this.specialized = specialized;
    }
    public KySu() {

    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return super.toString()+"KySu{" +
                "specialized='" + specialized + '\'' +
                '}';
    }
}
