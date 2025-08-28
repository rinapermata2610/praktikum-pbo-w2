public class Pasien {
    private String idPasien;
    private String nama;
    private int umur;
    private RekamMedis rekamMedis; // hubungan composition

    public Pasien(String idPasien, String nama, int umur) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;
        this.rekamMedis = new RekamMedis();
    }

    public String getIdPasien() { return idPasien; }
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public RekamMedis getRekamMedis() { return rekamMedis; }

    public void tambahCatatan(String catatan) {
        rekamMedis.tambahCatatan(catatan);
    }

    @Override
    public String toString() {
        return "Pasien[id=" + idPasien + ", nama=" + nama + ", umur=" + umur + "]";
    }
}
