package id.ac.polban.model;

public class Dokter {
    private String idDokter;
    private String nama;
    private String spesialis;

    public Dokter(String idDokter, String nama, String spesialis) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getIdDokter() { return idDokter; }
    public String getNama() { return nama; }
    public String getSpesialis() { return spesialis; }

    @Override
    public String toString() {
        return "Dokter[id=" + idDokter + ", nama=" + nama + ", spesialis=" + spesialis + "]";
    }
}
