package id.ac.polban.model;

public class Orang {
    protected String id;
    protected String nama;

    public Orang(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }

    @Override
    public String toString() {
        return "Orang[id=" + id + ", nama=" + nama + "]";
    }
}
