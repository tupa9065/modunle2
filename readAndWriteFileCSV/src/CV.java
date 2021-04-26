public class CV {
    private int id;
    private String code,name;

    public CV() {
    }

    public CV(int id, String abbreviations, String name) {
        this.id = id;
        this.code = abbreviations;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CV{" +
                "id=" + id +
                ", abbreviations='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
