public class Person {
    private String name="Name";
    private String dOB="01/01/1900";
    private String soCMT="000000000";

    public Person() {
    }

    public Person(String name, String dOB, String soCMT) {
        this.name = name;
        this.dOB = dOB;
        this.soCMT = soCMT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name  +
                ", dOB='" + dOB  +
                ", soCMT='" + soCMT +
                '}';
    }
}
