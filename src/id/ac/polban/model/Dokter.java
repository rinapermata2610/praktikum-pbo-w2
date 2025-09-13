package id.ac.polban.model;

public class Dokter extends Orang {
    private String spesialis;

    public Dokter(String idDokter, String nama, String spesialis) {
        super(idDokter, nama); // panggil constructor Orang
        this.spesialis = spesialis;
    }

    public String getSpesialis() { return spesialis; }

    @Override
    public String toString() {
        return "Dokter: " + super.toString() + ", spesialis=" + spesialis;
    }
}
