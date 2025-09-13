package id.ac.polban.model;

public class Pasien extends Orang {
    private int umur;
    private RekamMedis rekamMedis;

    public Pasien(String idPasien, String nama, int umur) {
        super(idPasien, nama); // panggil constructor Orang
        this.umur = umur;
        this.rekamMedis = new RekamMedis();
    }

    public int getUmur() { return umur; }
    public RekamMedis getRekamMedis() { return rekamMedis; }

    public void tambahCatatan(String catatan) {
        rekamMedis.tambahCatatan(catatan);
    }

    @Override
    public String toString() {
        return "Pasien: " + super.toString() + ", umur=" + umur;
    }
}
